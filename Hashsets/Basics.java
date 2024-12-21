import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(150);
        set.add(18);
        System.out.println(set.size());
        set.add(100);
        System.out.print(set + " ");
        System.out.println();

        // search a elements O(1) Tc -> true/false
        System.out.println(set.contains(10));
        set.add(50);  // insert Tc = O(1)
        System.out.println(set.contains(50));

        // remove element
        set.remove(10);
        System.out.println(set);

        // suppose koi element is not present in set in that time set will not show any error
        set.remove(10);
        System.out.println(set);

        // set se array me convert 
        Object [] arr =set.toArray();
        for (Object arr1 : arr) {
            System.out.print(arr1 + " ");
        }
        System.out.println();

        //Iterate in 
        for(int ele :set){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
