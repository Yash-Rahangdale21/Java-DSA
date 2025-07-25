public class UniquePath{
    public static void main(String[] args) {
        int m = 3; // Number of rows
        int n = 3; // Number of columns
        System.out.println("Unique Path Count: " + uniquePaths(0,0,m,n));
    }
    public static int uniquePaths(int row,int col,int x,int y ) {
        if (row >= x || col >= y) return 0;
        if (row == x - 1 && col == y - 1) return 1;
        return uniquePaths(row + 1, col, x, y) + uniquePaths(row, col + 1, x, y);
    }
}