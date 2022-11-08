package util;

public class Utility {
    //	Recevoir un tableau en argument d’une méthode
    public static void afficherTableau(int[] tabNb) {
        //	Parcourir un tableau
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println();
    }
}
