public class leetcode69 {
    public static void main(String[] args) {
        int x =20;
        long lo = 0,hi=(long)x;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid*mid ==(long)x) {
                System.out.println(mid);
            }
            else if(mid*mid>(long)x) hi=mid-1;
            else lo=mid+1;
        }
        System.out.println(hi);
    }
}
