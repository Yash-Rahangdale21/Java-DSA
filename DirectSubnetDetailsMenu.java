import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DirectSubnetDetailsMenu {

    public static void main(String[] args) throws UnknownHostException {
        Scanner sc = new Scanner(System.in);

        // Variables to store current IP details
        String ipStr = "";
        int prefix = 0, ipInt = 0, mask = 0, network = 0, broadcast = 0;

        while (true) {
            if (ipStr.isEmpty()) {
                System.out.print("Enter IP address with prefix (e.g. 192.168.12.5/28): ");
                String input = sc.nextLine();
                String[] parts = input.split("/");
                ipStr = parts[0];
                prefix = Integer.parseInt(parts[1]);

                InetAddress ip = InetAddress.getByName(ipStr);
                byte[] addr = ip.getAddress();
                ipInt = bytesToInt(addr);
                mask = prefixToMask(prefix);
                network = ipInt & mask;
                broadcast = network | ~mask;
            }

            System.out.println("\n--- Subnet Details Menu ---");
            System.out.println("1. Show Subnet Mask");
            System.out.println("2. Show Network ID");
            System.out.println("3. Show Broadcast Address");
            System.out.println("4. Show First and Last Usable IP");
            System.out.println("5. Show Total Number of Addresses");
            System.out.println("6. Show All Details");
            System.out.println("7. Enter New IP/Prefix");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Subnet Mask : " + intToIP(mask));
                    break;

                case 2:
                    System.out.println("Network ID : " + intToIP(network));
                    break;

                case 3:
                    System.out.println("Broadcast Address : " + intToIP(broadcast));
                    break;

                case 4:
                    System.out.println("First Usable IP : " + intToIP(network + 1));
                    System.out.println("Last Usable IP : " + intToIP(broadcast - 1));
                    break;

                case 5:
                    System.out.println("Number of Addresses in Block: " +
                            (int) Math.pow(2, 32 - prefix));
                    break;

                case 6:
                    System.out.println("\n--- Complete Subnet Details ---");
                    System.out.println("IP Address       : " + ipStr);
                    System.out.println("Prefix Length    : /" + prefix);
                    System.out.println("Subnet Mask      : " + intToIP(mask));
                    System.out.println("Network ID       : " + intToIP(network));
                    System.out.println("Broadcast Address: " + intToIP(broadcast));
                    System.out.println("First Usable IP  : " + intToIP(network + 1));
                    System.out.println("Last Usable IP   : " + intToIP(broadcast - 1));
                    System.out.println("Total Addresses  : " + (int) Math.pow(2, 32 - prefix));
                    break;

                case 7:
                    ipStr = ""; // reset to allow re-entry
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1–8.");
            }
        }
    }

    // Utility Methods
    static int bytesToInt(byte[] bytes) {
        int val = 0;
        for (byte b : bytes)
            val = (val << 8) | (b & 0xFF);
        return val;
    }

    static int prefixToMask(int prefix) {
        return (int) (0xFFFFFFFFL << (32 - prefix));
    }

    static String intToIP(int val) {
        return ((val >>> 24) & 0xFF) + "." +
               ((val >>> 16) & 0xFF) + "." +
               ((val >>> 8) & 0xFF) + "." +
               (val & 0xFF);
    }
}