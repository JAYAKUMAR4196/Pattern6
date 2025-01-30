public class Pattern6 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the grid (n x n)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Top half of the diamond
                if (i <= n / 2) {
                    if (j >= n / 2 - i && j <= n / 2 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Bottom half of the diamond
                else {
                    if (j >= i - n / 2 && j < n - (i - n / 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
