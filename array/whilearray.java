
public class whilearray {

    public void app() {
        int[]ujju = {4, 5, 9, 2, 6};
        int i = 0;
        while (i < ujju.length) {
            System.out.print(ujju[i] +" ");
            i++;
        }
    }

    public static void main(String[] args) {
        whilearray on = new whilearray();

        on.app();
    }
}
