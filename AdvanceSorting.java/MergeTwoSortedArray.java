public class MergeTwoSortedArray {
    public static void print(int []arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void merge(int []a,int []b,int []c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                c[k++] = b[j++];
            }
            else{ // a[i]<b[j]
                c[k++] = a[i++];
            }
        }
        while(j<b.length)  c[k++] = b[j++];
        while(i<a.length)  c[k++] = a[i++];
    }
    public static void main(String[] args) {
        int [] a ={10,16,25,37,54};
        int [] b = {8,14,20,21,60};
        int [] c = new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }
}
