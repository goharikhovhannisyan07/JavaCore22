package group1.HomeWork2.Figure;

public class FigurePainter {
    char c='♥';
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    void figure1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = j; k <= i; k++) {
                    System.out.print(c + " ");


                }
                System.out.println("");
            }

        }
    }

    /*
                  *
                * *
              * * *
            * * * *
          * * * * *
     */
    void figure2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(c + " ");


            }
            System.out.println();

        }
            }


    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    void figure3() {
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
