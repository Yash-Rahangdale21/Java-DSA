
public class ArrayReference {
// shallow copy concept//
    static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 9, 3};
        System.out.println("Original Array : ");
        printArray(arr);
        System.out.println(" ");

        // trying to coping array to arr2
        int[] arr2 = arr;
        System.out.println("Coping array");
        printArray(arr2);


        //changing some value of array two
        arr2[0]=0;
        arr2[1]=0;

        System.out.println("original array after changing arr2");
        printArray(arr);
        
        System.out.println("coping array after changing of arr2 ");
        printArray(arr2);
    }
}
