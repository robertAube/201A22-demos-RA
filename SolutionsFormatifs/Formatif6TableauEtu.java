/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-10-31)
 */
public class Formatif6TableauEtu {
    public Formatif6TableauEtu() {
        trace();
        testerGetNbValeursPositives();
        testerTrouverIndice();
        testerSontDesTableauxEgaux();
        testerRemplacerValeur();
        testerSortirLesNombresPositifs();
        testerFindLargestNbs();
    }

    // 1 //////////////////////////////////////////////////////////////////
    private int[] traceTableau(int t1[]) {
        int t2[];
        int j;

        t2 = new int[t1.length - 2];
        j = 0;
        for (int i = t1.length - 1; i >= 0; i--) {
            if (t1[i] % 3 == 0) {
                t2[j] = t1[i];
                j++;
            } else
                System.out.print(t1[i] + ", ");
        }
        t1[0] = 66;
        System.out.println();
        return t2;
    }

    private void trace() {
        int tA[] = { 9, -3, 0, 2, 17 };
        int tB[];

        tB = traceTableau(tA);

        System.out.print("tA[] : ");
        for (int i = 0; i < tA.length; i++) {
            System.out.print(tA[i] + ", ");
        }
        System.out.print("\ntB[] : ");
        for (int i = 0; i < tB.length; i++) {
            System.out.print(tB[i] + ", ");
        }
    }

    // 4 //////////////////////////////////////////////////////////////////
    private void testerGetNbValeursPositives() {

        int t1[] = { 1, -1, 0, 7 };
        int tVide[] = {};

        System.out.println("\ntesterGetNbValeursPositives()");
        System.out.println(getNbValeursPositives(t1) == 3);
        System.out.println(getNbValeursPositives(tVide) == 0);
    }

    private int getNbValeursPositives(int[] tableau) {
        int retNbValeursPositives = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] >= 0)
                retNbValeursPositives++;
        }
        return retNbValeursPositives;
    }

    // 5 //////////////////////////////////////////////////////////////////
    private void testerTrouverIndice() {
        int t1[] = { 1, -1, 1, 7 };
        int tVide[] = {};

        System.out.println("testerTrouverIndice()");
        System.out.println(trouverIndice(t1, -1) == 1);
        System.out.println(trouverIndice(t1, 1) == 0);
        System.out.println(trouverIndice(t1, 7) == 3);
        System.out.println(trouverIndice(t1, -2) == -1);
        System.out.println(trouverIndice(tVide, 7) == -1);
    }

    private int trouverIndice(int[] tableau, int valeurCherche) {
        int indice = -1;
        boolean indiceTrouve = false;

        for (int i = 0; i < tableau.length && !indiceTrouve; i++) {
            if (tableau[i] == valeurCherche) {
                indiceTrouve = true;
                indice = i;
            }
        }
        return indice;
    }

    // 6 //////////////////////////////////////////////////////////////////
    private void testerSontDesTableauxEgaux() {
        int t1[] = { 1, -1, 2, 7 };
        int t2[] = { 1, -1, 2, 7 };
        int t3[] = { 1, -1, 2, 8 };
        int t4[] = { 1, -1 };
        int tVide[] = {};

        System.out.println("testerSontDesTableauxEgaux()");
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t3) == false);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t4) == false);
        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private boolean sontDesTableauxEgaux(int[] tableau1, int[] tableau2) {
        boolean estPareil = true;

        if (tableau1.length != tableau2.length) {
            estPareil = false;
        } else
            for (int i = 0; i < tableau1.length && estPareil; i++) {
                if (tableau1[i] != tableau2[i]) {
                    estPareil = false;
                }
            }

        return estPareil;
    }

    // 7 //////////////////////////////////////////////////////////////////
    private void testerRemplacerValeur() {
        int t1[] = { 1, -1, 2, 7, 2 };
        int t2[] = { 1, -1, 3, 7, 3 };
        int t3[] = { 1, -1, 3, 7, 3 };
        int t4[] = { 1, -1 };
        int tVide[] = {};

        System.out.println("testerRemplacerValeur()");
        System.out.println(sontDesTableauxEgaux(t1, t2) == false);
        remplacerValeur(t1, 2, 3);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);

        System.out.println(sontDesTableauxEgaux(t2, t3) == true);
        remplacerValeur(t1, -99, 55);
        System.out.println(sontDesTableauxEgaux(t2, t3) == true);

        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private void remplacerValeur(int[] tableau, int vOld, int vNew) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == vOld) {
                tableau[i] = vNew;
            }
        }
    }

    // 8 //////////////////////////////////////////////////////////////////
    private void testerSortirLesNombresPositifs() {
        int t1[] = { 1, -1, 0, 7, -2 };
        int t1Copie[] = { 1, -1, 0, 7, -2 };
        int t1Rep[] = { 1, 0, 7 };
        int t2[] = { 1, 2, 7, 2 };
        int tVide[] = {};
        int tRep[];

        System.out.println("testerSortirLesNombresPositifs()");
        tRep = sortirLesNombresPositifs(t1);
        System.out.println(sontDesTableauxEgaux(tRep, t1Rep) == true);
        System.out.println(sontDesTableauxEgaux(t1, t1Copie) == true);

        tRep = sortirLesNombresPositifs(t2);
        System.out.println(sontDesTableauxEgaux(tRep, t2) == true);

        tRep = sortirLesNombresPositifs(tVide);
        System.out.println(sontDesTableauxEgaux(tRep, tVide) == true);
    }

    private int[] sortirLesNombresPositifs(int[] tableau) {
        int tabNbPositif[];
        int nbValeurPositive;
        int j;

        nbValeurPositive = getNbValeursPositives(tableau);
        tabNbPositif = new int[nbValeurPositive];

        j = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] >= 0) {
                tabNbPositif[j] = tableau[i];
                j++;
            }
        }
        return tabNbPositif;
    }
    // 9 ///////////////////////////////////////////////////////////////////

    private void testerFindLargestNbs() {
        System.out.println("testerFindLargestNbs()");

        int[][] tab2D1 = {{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}};
        int[][] tab2D2 = {{}, {20, 70, 40, 90}, {1, 2, 0}};
        int[][] tab2D3 = {{}, {20, 70, 40, 90}, {1, 2, 0}, {-10}};
        int[] largestNbs;

        largestNbs = findLargestNbs(tab2D1);
        afficherTableau(largestNbs);
        largestNbs = findLargestNbs(tab2D2);
        afficherTableau(largestNbs);
        largestNbs = findLargestNbs(tab2D3);
        afficherTableau(largestNbs);
    }

    private int[] findLargestNbs(int[][] tab2D) {
        int[] largestNbs = new int[tab2D.length];

        for (int i = 0; i < tab2D.length; i++) {
            largestNbs[i] = maxVal(tab2D[i]);
        }

        return largestNbs;
    }

    private int maxVal(int[] tab) {
        int max = tab.length == 0 ? 0 : tab[0];
        for (int i = 1; i < tab.length; i++) {
            max = max > tab[i] ? max : tab[i];
        }
        return max;
    }

////////////////////////////////////////////////////////////////////
    private void afficherTableau(int[] tableau) {
        System.out.print("{");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tableau[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        new Formatif6TableauEtu();
    }
}
