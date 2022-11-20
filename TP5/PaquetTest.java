package tp5Enseignant.paquet;//420-201 – tp4 - Jeu de carte
//Nom : Aubé
//Prénom : Robert

/**
 * Classe de test de la classe Paquet
 * Pour Fonctionner :
 * 1 - PaquetTest doit préalablement passer tous les tests sur votre classe Paquet.
 * 2 - Vous devez respecter les noms de méthodes données dans ce travail.
 * @version 201A21 - V1
 * @author Robert Aubé
 */
 public class PaquetTest {
    Paquet p;
    private boolean testReussi;
    private String descriptionTest;

    public PaquetTest() {
        explicationsDesTests();

        tester_unPaquetA52Cartes();
        tester_unPaquetOrdonneEstOrdonne();
        tester_onPeutPigerSeulement52CartesPeuImporteLeTypeDePaquet();
        tester_onNAPas2CartesPareillesDansUnPaquetMelange(10);
        tester_unPaquetMelangeEstBienMelange(10);
        tester_toStringRetouneUneStrDesCartesDuPaquet();
    }

    /**
     * Vide le paquet en pigean exactement 52 cartes et
     * Retroune faux s'il n'y a pas 52 cartes
     * @return faux s'il n'y a pas 52 cartes
     */
    private boolean vider52CartesDuPaquet(Paquet paquet) {
        Carte c;
        boolean carteANull = false;
        for (int cpt = 1; cpt <= 52 && !carteANull; cpt++) {
            c = paquet.piger();
            if (c == null)
                carteANull = true;
        }
        return !carteANull;
    }

    private void tester_toStringRetouneUneStrDesCartesDuPaquet() {
        System.out.println("tester_toStringRetouneUneStrDesCartesDuPaquet()");
        String paquetOrdonneValeurCouleur = "1 de pique (♠)1 de trèfle (♣)1 de carreau (♦)1 de coeur (❤)2 de pique (♠)2 de trèfle (♣)2 de carreau (♦)2 de coeur (❤)3 de pique (♠)3 de trèfle (♣)3 de carreau (♦)3 de coeur (❤)4 de pique (♠)4 de trèfle (♣)4 de carreau (♦)4 de coeur (❤)5 de pique (♠)5 de trèfle (♣)5 de carreau (♦)5 de coeur (❤)6 de pique (♠)6 de trèfle (♣)6 de carreau (♦)6 de coeur (❤)7 de pique (♠)7 de trèfle (♣)7 de carreau (♦)7 de coeur (❤)8 de pique (♠)8 de trèfle (♣)8 de carreau (♦)8 de coeur (❤)9 de pique (♠)9 de trèfle (♣)9 de carreau (♦)9 de coeur (❤)10 de pique (♠)10 de trèfle (♣)10 de carreau (♦)10 de coeur (❤)11 de pique (♠)11 de trèfle (♣)11 de carreau (♦)11 de coeur (❤)12 de pique (♠)12 de trèfle (♣)12 de carreau (♦)12 de coeur (❤)13 de pique (♠)13 de trèfle (♣)13 de carreau (♦)13 de coeur (❤)";
        String paquetOrdonneCouleurValeur = "1 de pique (♠)2 de pique (♠)3 de pique (♠)4 de pique (♠)5 de pique (♠)6 de pique (♠)7 de pique (♠)8 de pique (♠)9 de pique (♠)10 de pique (♠)11 de pique (♠)12 de pique (♠)13 de pique (♠)1 de trèfle (♣)2 de trèfle (♣)3 de trèfle (♣)4 de trèfle (♣)5 de trèfle (♣)6 de trèfle (♣)7 de trèfle (♣)8 de trèfle (♣)9 de trèfle (♣)10 de trèfle (♣)11 de trèfle (♣)12 de trèfle (♣)13 de trèfle (♣)1 de carreau (♦)2 de carreau (♦)3 de carreau (♦)4 de carreau (♦)5 de carreau (♦)6 de carreau (♦)7 de carreau (♦)8 de carreau (♦)9 de carreau (♦)10 de carreau (♦)11 de carreau (♦)12 de carreau (♦)13 de carreau (♦)1 de coeur (❤)2 de coeur (❤)3 de coeur (❤)4 de coeur (❤)5 de coeur (❤)6 de coeur (❤)7 de coeur (❤)8 de coeur (❤)9 de coeur (❤)10 de coeur (❤)11 de coeur (❤)12 de coeur (❤)13 de coeur (❤)";
        Paquet pOrdononne = new Paquet(false);
        Paquet pVide = new Paquet(true);

        descriptionTest = "Un paquet ordonne retourne un toString des 52 cartes au départ.";
        testReussi = pOrdononne.toString().equalsIgnoreCase(paquetOrdonneCouleurValeur) || pOrdononne.toString().equalsIgnoreCase(paquetOrdonneValeurCouleur);
        afficherResultatDuTest();

        descriptionTest = "Un paquet vide retourne toString vide.";
        vider52CartesDuPaquet(pVide);
        testReussi = pVide.toString().equals("") || pVide.toString().equals("");
        afficherResultatDuTest();
    }


    private void tester_unPaquetA52Cartes() {
        System.out.println("tester_unPaquetA52Cartes()");
        Paquet pMelange = new Paquet(true);
        Paquet pOrdononne = new Paquet(false);

        descriptionTest = "Un paquet mélangé ou un paquet non mélangé ont 52 cartes au départ.";
        testReussi = pMelange.getNombreDeCartes() == 52 && pOrdononne.getNombreDeCartes() == 52;
        afficherResultatDuTest();
    }

    private void tester_onPeutPigerSeulement52CartesPeuImporteLeTypeDePaquet() {
        System.out.println("tester_onPeutPigerSeulement52CartesPeuImporteLeTypeDePaquet()");
        Paquet pMelange = new Paquet(true);
        Paquet pOrdononne = new Paquet(false);
        onPeutPigerSeulement52Cartes("mélangé", pMelange);
        onPeutPigerSeulement52Cartes("ordonné", pOrdononne);
    }

    private void onPeutPigerSeulement52Cartes(String typePaquet, Paquet paquet) {
        Carte c;

        descriptionTest = "Il est possible de piger 52 cartes dans le paquet " + typePaquet + ".";
        testReussi = vider52CartesDuPaquet(paquet);
        afficherResultatDuTest();

        if (testReussi) {
            descriptionTest = "Il est impossible de piger plus de 52 cartes dans le paquet " + typePaquet + ". Si on pige au delà de 52 cartes, piger doit retourner null.";
            testReussi = true;
            c = paquet.piger();
            if (c != null)
                testReussi = false;
            afficherResultatDuTest();
        }
    }

    private void tester_unPaquetOrdonneEstOrdonne() {
        System.out.println("tester_unPaquetOrdonneEstOrdonne()");
        String paquetOrdonneValeurCouleur = "1 de pique (♠)1 de trèfle (♣)1 de carreau (♦)1 de coeur (❤)2 de pique (♠)2 de trèfle (♣)2 de carreau (♦)2 de coeur (❤)3 de pique (♠)3 de trèfle (♣)3 de carreau (♦)3 de coeur (❤)4 de pique (♠)4 de trèfle (♣)4 de carreau (♦)4 de coeur (❤)5 de pique (♠)5 de trèfle (♣)5 de carreau (♦)5 de coeur (❤)6 de pique (♠)6 de trèfle (♣)6 de carreau (♦)6 de coeur (❤)7 de pique (♠)7 de trèfle (♣)7 de carreau (♦)7 de coeur (❤)8 de pique (♠)8 de trèfle (♣)8 de carreau (♦)8 de coeur (❤)9 de pique (♠)9 de trèfle (♣)9 de carreau (♦)9 de coeur (❤)10 de pique (♠)10 de trèfle (♣)10 de carreau (♦)10 de coeur (❤)11 de pique (♠)11 de trèfle (♣)11 de carreau (♦)11 de coeur (❤)12 de pique (♠)12 de trèfle (♣)12 de carreau (♦)12 de coeur (❤)13 de pique (♠)13 de trèfle (♣)13 de carreau (♦)13 de coeur (❤)";
        String paquetOrdonneCouleurValeur = "1 de pique (♠)2 de pique (♠)3 de pique (♠)4 de pique (♠)5 de pique (♠)6 de pique (♠)7 de pique (♠)8 de pique (♠)9 de pique (♠)10 de pique (♠)11 de pique (♠)12 de pique (♠)13 de pique (♠)1 de trèfle (♣)2 de trèfle (♣)3 de trèfle (♣)4 de trèfle (♣)5 de trèfle (♣)6 de trèfle (♣)7 de trèfle (♣)8 de trèfle (♣)9 de trèfle (♣)10 de trèfle (♣)11 de trèfle (♣)12 de trèfle (♣)13 de trèfle (♣)1 de carreau (♦)2 de carreau (♦)3 de carreau (♦)4 de carreau (♦)5 de carreau (♦)6 de carreau (♦)7 de carreau (♦)8 de carreau (♦)9 de carreau (♦)10 de carreau (♦)11 de carreau (♦)12 de carreau (♦)13 de carreau (♦)1 de coeur (❤)2 de coeur (❤)3 de coeur (❤)4 de coeur (❤)5 de coeur (❤)6 de coeur (❤)7 de coeur (❤)8 de coeur (❤)9 de coeur (❤)10 de coeur (❤)11 de coeur (❤)12 de coeur (❤)13 de coeur (❤)";
        String strPaquetOrdonne;
        Paquet pOrdononne = new Paquet(false);

        descriptionTest = "Votre paquet contient l'ensemble des cartes d'un paquet ordonnée";
        strPaquetOrdonne = paquetToString(pOrdononne);
        testReussi = strPaquetOrdonne.equalsIgnoreCase(paquetOrdonneCouleurValeur) || strPaquetOrdonne.equalsIgnoreCase(paquetOrdonneValeurCouleur);
        afficherResultatDuTest();
    }

    private void tester_unPaquetMelangeEstBienMelange(int nbPaquet) {
        System.out.println("tester_unPaquetMelangeEstBienMelange(int nbPaquet)");
        String tabStrPaquet[] = new String[nbPaquet];
        Paquet p;

        if (nbPaquet < 2) {
            descriptionTest = "Pour être significatif le test paquets unPaquetMelangeEstMelange() doit avoir plus d'un paquet à comparer.";
            testReussi = false;
        } else {
            descriptionTest = nbPaquet + " paquets mélangés sont différents.";
            testReussi = true;
            for (int i = 0; i < tabStrPaquet.length && testReussi; i++) {
                p = new Paquet(true);
                tabStrPaquet[i] = paquetToString(p);
                for (int j = 0; j < i && testReussi; j++) {
                    testReussi = !tabStrPaquet[j].equalsIgnoreCase(tabStrPaquet[i]);
                }
            }
        }
        afficherResultatDuTest();
    }

    private String paquetToString(Paquet paquet) {
        String strPaquet;
        Carte c;

        strPaquet = "";
        for (int cpt = 1; cpt <= 52; cpt++) {
            c = paquet.piger();
            strPaquet += c.toString();
        }

        return strPaquet;
    }

    private void tester_onNAPas2CartesPareillesDansUnPaquetMelange(int nbTeste) {
        System.out.println("tester_onNAPas2CartesPareillesDansUnPaquetMelange(int nbTeste)");
        testReussi = true;
        descriptionTest = "Un paquet mélangé n'a jamais 2 cartes pareilles.";
        for (int i = 0; i < nbTeste && testReussi; i++) {
            testReussi = onNAPas2CartePareilDansUnPaquetMelange();
        }
        afficherResultatDuTest();
    }

    private boolean onNAPas2CartePareilDansUnPaquetMelange() {
        Paquet pMelange = new Paquet(true);
        Carte[] paquetTest = getCartesFromPaquet(pMelange);

        testReussi = true;
        for (int i = 0; i < pMelange.getNombreDeCartes() && testReussi; i++) {
            for (int j = 0; j < pMelange.getNombreDeCartes() && testReussi; j++) {
                if (i != j) {
                    if (paquetTest[i].toString().equals(paquetTest[j])) {
                        testReussi = false;
                    }
                }
            }
        }
        return testReussi;
    }

    private Carte[] getCartesFromPaquet(Paquet paquet) {
        Carte c;
        Carte[] tabPaquet = new Carte[52];

        for (int i = 0; !paquet.estVide(); i++) {
            c = paquet.piger();
            tabPaquet[i] = c;
        }
        return tabPaquet;
    }

//méthodes utilitaires pour faire les tests

    public void explicationsDesTests() {
        String s;
        s = "Pour Fonctionner :";
        s += "\n1 - CarteTestTp4b doit préalablement passer tous les tests sur votre classe Paquet.";
        s += "\n2 - Vous devez respecter les noms de méthodes données dans ce travail.";

        System.out.println(s);
    }

    private void afficherResultatDuTest() {
        String str;
        str = testReussi ? "Ok: " : "XXXX - Le test ne passe pas: ";
        str += descriptionTest;
        System.out.println(str);
    }

    public static void main(String[] args) {
        new PaquetTest();
    }
}
