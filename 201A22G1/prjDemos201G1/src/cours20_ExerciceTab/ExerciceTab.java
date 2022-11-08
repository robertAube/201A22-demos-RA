package cours20_ExerciceTab;

public class ExerciceTab {
    public static int[] insererTableau(int[] tab1, int[] tab2, int insertAt) {
        int[] tabOut;
        int iTab1;
        int iTabOut;

        if (insertAt < 0 || insertAt > tab1.length) {
            throw new IndexOutOfBoundsException("Indice invalide : " + insertAt);
        }

        tabOut = new int[tab1.length + tab2.length];

        iTabOut = 0;
        for (iTab1 = 0; iTab1 < insertAt; iTab1++) {
            tabOut[iTabOut++]= tab1[iTab1];
        }

        for (int iTab2 = 0; iTab2 < tab2.length; iTab2++) {
            tabOut[iTabOut++]= tab2[iTab2];
        }

        for (; iTab1 < tab1.length; iTab1++) {
            tabOut[iTabOut++]= tab1[iTab1];
        }

        return tabOut;
    }

    public static int[] insererTableauV2(int[] tab1, int[] tab2, int indInsert) {
        int[] tabOut;
        int tab1I;

        //Option : mais si on veut avoir un message précis et adapté à la situation
        if (indInsert < 0 || indInsert >= tab1.length + 1)
            throw new IndexOutOfBoundsException("Indice invalide : " + indInsert);

        tabOut = new int[tab1.length + tab2.length];
        tab1I = 0;
        for (int tabOutInd = 0; tabOutInd < tabOut.length;) {
            if (tabOutInd == indInsert) {
                for (int tab2I = 0; tab2I < tab2.length; tab2I++) {
                    tabOut[tabOutInd++] = tab2[tab2I];
                }
            } else {
                tabOut[tabOutInd++] = tab1[tab1I++];
            }
        }

        return tabOut;
    }

    public static int[] insererTableauV3(int[] tab1, int[] tab2, int indInsert) {
        int[] tabOut;
        int k;
        boolean estCopie = false;

        if (indInsert < 0 || indInsert >= tab1.length + 1)
            throw new IndexOutOfBoundsException("Indice invalide : " + indInsert);

        tabOut = new int[tab1.length + tab2.length];
        k = 0;
        for (int tab1I = 0; tab1I < tab1.length; ) {
            if (tab1I == indInsert && !estCopie) {
                for (int tab2I = 0; tab2I < tab2.length; tab2I++) {
                    tabOut[k++] = tab2[tab2I];
                }
                estCopie = true;
            } else {
                tabOut[k++] = tab1[tab1I++];
            }
        }

        if (estCopie == false) {
            for (int tab2I = 0; tab2I < tab2.length; tab2I++) {
                tabOut[k++] = tab2[tab2I];
            }
        }

        return tabOut;
    }
}
