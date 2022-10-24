public class Cours17_tableau2D {
    public Cours17_tableau2D() {
        //  tester_fusionner_tableauV2();
        jouerAvecTableau2D();
    }

    private void jouerAvecTableau2D() {
        int[][] tab2D = {{1, 2, 3, 4, 5}, {6, 7}};

        afficherTableauDeTableauV2(tab2D);

        tab2D[0][4] = 55;

        afficherTableauDeTableauV2(tab2D);

        afficherTableauDeTableauV2(tab2D);
       // tab2D[4][0] = 55; //java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 2
    }

    private void afficherTableauDeTableau(int[][] tabDeTab) {
        for (int ligne = 0; ligne < tabDeTab.length; ligne++) {
            Cours16_Tableau.afficherTableau(tabDeTab[ligne]);
        }
    }
    private void afficherTableauDeTableauV2(int[][] tab2D) {
        for (int ligne = 0; ligne < tab2D.length; ligne++) {
            for (int colonne = 0; colonne < tab2D[ligne].length; colonne++) {
                System.out.print(tab2D[ligne][colonne] + ", ");
            }
            System.out.println();
        }
    }

    private void tester_fusionner_tableauV1() {
        int tab1[];
        int tab2[];
        int tabFusionne[];

        tab1 = new int[]{1, 2, 3};
        tab2 = new int[]{4, 5};

        Cours16_Tableau.afficherTableau(tab1);
        Cours16_Tableau.afficherTableau(tab2);

        tabFusionne = fusionnerTableau(tab1, tab2);

        Cours16_Tableau.afficherTableau(tabFusionne);
    }

    private void tester_fusionner_tableauV2() {
        int tabFusionne[];

        int[][] tabDeTab = new int[2][];

        tabDeTab[0] = new int[]{1, 2, 3};
        tabDeTab[1] = new int[]{4, 5};

        afficherTableauDeTableau(tabDeTab);

        tabFusionne = fusionnerTableau(tabDeTab[0], tabDeTab[1]);

        Cours16_Tableau.afficherTableau(tabFusionne);
    }



    public int[] fusionnerTableau(int tab1[], int tab2[]) {
        int[] tabOut;
        tabOut = new int[tab1.length + tab2.length];
        int j;

        j = 0;
        for (int i = 0; i < tab1.length; i++) {
            tabOut[j++] = tab1[i];
        }

        for (int i = 0; i < tab2.length; i++) {
            tabOut[j++] = tab2[i];
        }
        return tabOut;
    }

    public static void main(String[] args) {
        new Cours17_tableau2D();
    }
}
