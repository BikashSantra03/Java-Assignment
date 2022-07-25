public class Question3 {
    public static void main(String[] args) {
        System.out.println("Hey Bikash Your Output is : \n");

        int i, j;
        int n = 14;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i + j <= (n - 1) / 2 || j - i >= (n - 1) / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
