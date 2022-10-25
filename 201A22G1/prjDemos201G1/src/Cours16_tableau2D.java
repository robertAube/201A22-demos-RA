public class Cours16_tableau2D {
    public Cours16_tableau2D() {
//        tester_fusionner_tableauV1();
        //      tester_fusionner_tableauV2();
        jouerAvecTableau2D();
    }

    private void jouerAvecTableau2D() {
        int[][] tab2D = {{1, 2, 3, 4, 5}, {6, 7}};

        afficherTableauDeTabInt(tab2D);

        tab2D[0][4] = 55;
        afficherTableauDeTabInt(tab2D);
        afficherTableauDeTabIntV2(tab2D);
    }

    private void afficherTableauDeTabIntV2(int [][] tab2D) {
        for (int ligne = 0; ligne < tab2D.length ; ligne ++) {
            for (int colonne = 0; colonne < tab2D[ligne].length; colonne++) {
                System.out.print(tab2D[ligne][colonne] + ", ");
            }
            System.out.println();
        }
    }

    private void tester_fusionner_tableauV1() {
        int tab1[] = {1, 2, 3};
        int tab2[];
        int tabFusionne[];

        tab2 = new int[]{4, 5};

        Cours14_tableau.afficherTableau(tab1);
        Cours14_tableau.afficherTableau(tab2);

        tabFusionne = fusionnerTableau(tab1, tab2);

        Cours14_tableau.afficherTableau(tabFusionne);
    }

    private void tester_fusionner_tableauV2() {
        int[][] tabDetabInt = new int[2][];
        int tabFusionne[];

        tabDetabInt[0] = new int[]{4, 5};
        tabDetabInt[1] = new int[]{3, 4, 5};

        afficherTableauDeTabInt(tabDetabInt);

        tabFusionne = fusionnerTableau(tabDetabInt[0], tabDetabInt[1]);

        Cours14_tableau.afficherTableau(tabFusionne);
    }

    private void afficherTableauDeTabInt(int[][] tabDeTabInt) {
        for (int i = 0; i < tabDeTabInt.length; i++) {
            Cours14_tableau.afficherTableau(tabDeTabInt[i]);
        }
    }

    private int[] fusionnerTableau(int tab1[], int tab2[]) {
        int[] tableauFusion;
        int j;

        tableauFusion = new int[tab1.length + tab2.length];

        j = 0;
        for (int i = 0; i < tab1.length; i++) {
            tableauFusion[j++] = tab1[i];
        }

        for (int i = 0; i < tab2.length; i++) {
            tableauFusion[j++] = tab2[i];
        }

        return tableauFusion;
    }


    public static void main(String[] args) {
        new Cours16_tableau2D();
    }
}
