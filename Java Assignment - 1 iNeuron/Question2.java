public class Question2 {
    public static void main(String[] args) {
        System.out.println("Hey Bikash Your Output is : \n");

        int i, j;
        int n = 4;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print("1");
            }

            for (j = 0; j < n; j++) {
                if (i == 1)
                    System.out.print("2");
            }

            for (j = 0; j < n; j++) {
                if (i == 2)
                    System.out.print("3");
            }

            for (j = 0; j < n; j++) {
                if (i == 3)
                    System.out.print("4");
            }
            System.out.println();
        }
    }
}
