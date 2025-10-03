public class zeroandoneKnapsack {
    public static int profit(int i ,int[] wt, int[] val, int c) {
        if(i==wt.length) return 0;
        int skip = profit(i+1, wt, val, c);
        if(wt[i]>c) return skip;
        int take = val[i] + profit(i+1, wt, val, c-wt[i]);
        return Math.max(take,skip);
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int c = 8;
        // i = 0 to n-1 | c = c to 0
       
        System.out.println(profit(0,wt, val, c));
    }
}
