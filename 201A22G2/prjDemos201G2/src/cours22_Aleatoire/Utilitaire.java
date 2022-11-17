package cours22_Aleatoire;

import java.util.Random;

public class Utilitaire {
    private static Random random = null;

    public static int getNombreAleatoireEntreBorneV1(int min, int max) {
        int nb;
        if (random == null) {
            random = new Random();
        }
        if (min > max) {
            throw new IllegalArgumentException("min doit être inférieur à max");
        }
        nb = min + random.nextInt(max - min + 1);
        return nb;
    }

    public static int getNombreAleatoireEntreBorneV2(int min, int max) {
        int nb;
        Random random = new Random();
        if (min > max) {
            throw new IllegalArgumentException("min doit être inférieur à max");
        }
        nb = min + random.nextInt(max - min + 1);
        return nb;
    }

    public static void afficherTableau(int[] tabNb) {
        System.out.print("{");
        for (int i = 0; i < tabNb.length; i++) {
            System.out.print((i == 0 ? "" : ", ") + tabNb[i]);
        }
        System.out.println("}");
    }

    public static int[] initialiserTableau (int longueur, int valeurInit) {
        int [] tabRetour;
        tabRetour = new int[longueur];
        for (int i = 0; i < tabRetour.length; i++) {
            tabRetour[i] = valeurInit;
        }

        return tabRetour;
    }
}
