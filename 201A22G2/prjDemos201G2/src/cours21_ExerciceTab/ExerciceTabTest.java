package cours21_ExerciceTab;

import util.Utility;

public class ExerciceTabTest {
    public ExerciceTabTest() {
        insererTableauTest();
    }

    private void insererTableauTest() {
        int[] tab1 = {10, 11, 12};
        int[] tab2 = {20, 21};
        int[] tabFusion;
        Utility.afficherTableau(tab1);
        Utility.afficherTableau(tab2);
        tabFusion = ExerciceTab.insererTableau(tab1,tab2, 0);
        Utility.afficherTableau(tabFusion);

        for (int i = 1; i <= tab1.length+1; i++) {
            System.out.println("Insérer à " + i);
            tabFusion = ExerciceTab.insererTableau(tab1,tab2, i);
            Utility.afficherTableau(tabFusion);
        }
    }

    public static void main(String[] args) {
        new ExerciceTabTest();
    }
}
