public class Question1 {
    public static void main(String[] args) {
        System.out.println("Hey Bikash Your Output is : \n");
        int i, j;
        int n = 9;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("    ");

            for (j = 0; j < n; j++) {
                if (j == 0 || i == j || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("    "); //

            for (j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1 || i == (n - 1) / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("    "); //

            for (j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("    "); //

            for (j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) / 2 || (j == n - 1) && i <= (n - 1) / 2 || i - j == (n - 1) / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("    ");
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("   ");

            for (j = 0; j < n; j++) {
                if (j == 0 || i == j || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
