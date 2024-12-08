public class Syntax {
    // Syntax and Declaration
    public static void main(String[] args) {

        // way 1
        int [] arr = new int[5];

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // way 2 
        int [] arr2 = {5,6,8,3,5};
        for(int ele : arr2){
            System.out.print(ele + " ");
        }

        int [] y; // declaration
        y = new int[5];
    }

}
