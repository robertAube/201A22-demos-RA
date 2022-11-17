package cours22_Aleatoire;

public class UtilitaireTest {
    public UtilitaireTest() {
        //     getNombreAleatoireEntreBorneTest1();
    }

    private void getNombreAleatoireEntreBorneTestPerfo() {
        long start, end;
        long total = 0;
        for (int i = 0; i < 10; i++) {
            start = System.nanoTime();
            getNombreAleatoireEntreBorneTestV2();
            end = System.nanoTime();
            System.out.println("Temps nano seconds: " + (end - start));
            total += end - start;
        }
        System.out.println("Temps total : " + total);
    }

    private void getNombreAleatoireEntreBorneTestV2() {
        int min = 1;
        int max = 10;
        int valAlea;
        int[] tabNbFois = Utilitaire.initialiserTableau(max - min + 1, 0);
        for (int i = 0; i < 1000; i++) {
            valAlea = Utilitaire.getNombreAleatoireEntreBorneV1(min, max);
            tabNbFois[valAlea - min]++;
        }
        Utilitaire.afficherTableau(tabNbFois);
    }

    private void getNombreAleatoireEntreBorneTestV1() {
        int min = 0;
        int max = 10;
        int valAlea;
        for (int i = 0; i < 100; i++) {
            valAlea = Utilitaire.getNombreAleatoireEntreBorneV1(min, max);
            System.out.println(valAlea);
        }
        Utilitaire.getNombreAleatoireEntreBorneV1(1, 0);
    }

    public static void main(String[] args) {
        new UtilitaireTest();
    }
}
