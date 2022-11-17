package paquet;
import java.util.Arrays;

/**
 * Classe de testes de la classe Carte
 * @version 201A22 - V1
 * @author Robert Aubé
 */
public class CarteTest {
    private boolean testReussi;
    private String descriptionTest;

    public CarteTest() {
        tester_constantesDeClasse();
        tester_ValiderCouleur();
        tester_ValiderValeur();
        tester_Constructeurs();
        tester_MutateursEtAccesseur_couleur();
        tester_MutateursEtAccesseur_valeur();
        tester_toString();
        tester_equals();
    }

    private void tester_constantesDeClasse() {
        descriptionTest = "La contante de classe COULEURS_CAR est bien déclaré.";
        testReussi = Arrays.toString(Carte.COULEURS_CAR).equals("[♠, ♣, ♦, ❤]");

        descriptionTest = "La contante de classe COULEURS_VALIDES est bien déclaré.";
        testReussi = Arrays.toString(Carte.COULEURS_VALIDES).equals("[pique, trèfle, carreau, coeur]");
    }

    private void afficherResultatDuTest() {
        String str;
        str = testReussi ? "Ok: " : "XXXX - Le test ne passe pas: ";
        str += descriptionTest;
        System.out.println(str);
    }

    private void tester_ValiderCouleur() {
        String[] couleursValides = {"pique", "trèfle", "carreau", "coeur"};
        String[] couleursInValides = {"", "trefle", "careau", "chat"};

        System.out.println("testerValiderCouleur()");

        descriptionTest = "Toutes les couleurs valides passent en minuscule.";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi; i++) {
            testReussi = Carte.couleurEstValide(couleursValides[i]);
        }
        afficherResultatDuTest();

        descriptionTest = "Toutes les couleurs valides passent en majuscule.";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi; i++) {
            testReussi = Carte.couleurEstValide(couleursValides[i].toUpperCase());
        }
        afficherResultatDuTest();

        descriptionTest = "Toutes les couleurs invalides ne passent pas.";
        testReussi = true;
        for (int i = 0; i < couleursInValides.length && testReussi; i++) {
            testReussi = !Carte.couleurEstValide(couleursInValides[i].toUpperCase());
        }
        afficherResultatDuTest();
    }


    private void tester_ValiderValeur() {
        System.out.println("testerValiderValeur()");
        descriptionTest = "Les valeurs entre 1 et 13 sont valides.";
        testReussi = true;
        for (int valeur = 1; valeur <= 13 && testReussi; valeur++) {
            testReussi = Carte.valeurEstValide(valeur);
        }
        afficherResultatDuTest();

        descriptionTest = "Les valeurs inférieures à 1 sont invalides.";
        for (int valeur = -20; valeur <= 0 && testReussi; valeur++) {
            testReussi = !Carte.valeurEstValide(valeur);
        }
        afficherResultatDuTest();

        descriptionTest = "Les valeurs inférieures à 13 sont invalides.";
        for (int valeur = 14; valeur <= 60 && testReussi; valeur++) {
            testReussi = !Carte.valeurEstValide(valeur);
        }
        afficherResultatDuTest();
    }


    private void tester_MutateursEtAccesseur_couleur() {
        String[] couleursValides = {"pique", "trèfle", "carreau", "coeur"};
        Carte carte;

        System.out.println("testerMutateursEtAccesseur_couleur()");

        carte = new Carte(1, "coeur");

        descriptionTest = "Mutateur de couleur";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi; i++) {
            carte.setCouleur(couleursValides[i]);
            testReussi = carte.getCouleur().equals(couleursValides[i]);
        }
        afficherResultatDuTest();

        descriptionTest = "Mutateur de couleur accepte aussi les majuscules, mais retourne toujours en minuscule.";
        testReussi = true;
        for (int i = 0; i < couleursValides.length && testReussi; i++) {
            carte.setCouleur(couleursValides[i].toUpperCase());
            testReussi = carte.getCouleur().equals(couleursValides[i]);
        }
        afficherResultatDuTest();
    }

    private void tester_MutateursEtAccesseur_valeur() {
        Carte carte;

        System.out.println("testerMutateursEtAccesseur_valeur()");

        carte = new Carte(1, "coeur");

        descriptionTest = "Mutateur de couleur";
        testReussi = true;
        for (int valeur = 1; valeur <= 13 && testReussi; valeur++) {
            carte.setValeur(valeur);
            testReussi = carte.getValeur() == valeur;
        }
        afficherResultatDuTest();

        descriptionTest = "Les valeurs inférieures à 1 lancent une exception.";
        for (int valeur = -20; valeur <= 0 && testReussi; valeur++) {
            testReussi = false;
            try {
                carte.setValeur(valeur);
            } catch (IllegalArgumentException e) {
                testReussi = true;
            }
        }
        afficherResultatDuTest();

        descriptionTest = "Les valeurs supérieures à 13 lancent une exception.";
        for (int valeur = 14; valeur <= 60 && testReussi; valeur++) {
            testReussi = false;
            try {
                carte.setValeur(valeur);
            } catch (IllegalArgumentException e) {
                testReussi = true;
            }
        }
        afficherResultatDuTest();
    }


    private void tester_Constructeurs() {
        Carte carte;

        System.out.println("testerConstructeurs()");

        carte = new Carte(1, "coeur");

        descriptionTest = "Le constructeur place la bonne valeur de carte.";
        testReussi = (carte.getValeur() == 1);
        afficherResultatDuTest();

        descriptionTest = "Le constructeur place la bonne couleur de carte.";
        testReussi = carte.getCouleur().equals("coeur");
        afficherResultatDuTest();

        descriptionTest = "Une valeur invalide lance une exception";
        testReussi = false;
        try {
            new Carte(-1, "coeur");
        } catch (IllegalArgumentException e) {
            testReussi = true;
        }
        afficherResultatDuTest();

        descriptionTest = "Une couleur invalide lance une exception.";
        testReussi = false;
        try {
            new Carte(1, "ccoeur");
        } catch (IllegalArgumentException e) {
            testReussi = true;
        }
        afficherResultatDuTest();
    }

    private void tester_toString() {
        Carte[] tabCarte = {new Carte(1, "pique"), new Carte(10, "trèfle"), new Carte(13, "carreau"), new Carte(2, "coeur")};
        String[] strAttendu = {"1 de pique (\u2660)", "10 de trèfle (\u2663)", "13 de carreau (\u2666)", "2 de coeur (\u2764)"};
        String retourToString;

        System.out.println("tester_toString()");

        descriptionTest = "La carte retourne la bonne chaîne.";
        testReussi = true;
        for (int i = 0; i < tabCarte.length && testReussi; i++) {
            retourToString = tabCarte[i].toString();
            testReussi = retourToString.equals(strAttendu[i]);
        }
        afficherResultatDuTest();
    }

    private void tester_equals() {
        Carte c2pi = new Carte(2, "pique");
        Carte c1pi = new Carte(1, "pique");
        Carte c2co = new Carte(2, "coeur");
        Carte c2piV2 = new Carte(2, "pique");
        Carte cNull = null;

        System.out.println("tester_equals()");
        descriptionTest = "equals : la comparaison de la même instance de carte retourne true";
        testReussi = c2pi.equals(c2pi);
        afficherResultatDuTest();

        descriptionTest = "equals : la comparaison avec une carte null retourne false";
        testReussi = !c2pi.equals(cNull);
        afficherResultatDuTest();

        descriptionTest = "equals : la comparaison d'une variable de types différents retourne false";
        testReussi = !c2pi.equals("chat");
        afficherResultatDuTest();

        descriptionTest = "equals : la comparaison de 2 cartes de valeurs différentes retourne false";
        testReussi = !c2pi.equals(c1pi);
        afficherResultatDuTest();

        descriptionTest = "equals : la comparaison de 2 cartes de couleurs différentes retourne false";
        testReussi = !c2pi.equals(c2co);
        afficherResultatDuTest();

        descriptionTest = "equals : la comparaison de 2 cartes de même couleur, de même valeur et d'instances différentes retourne true.";
        testReussi = c2pi.equals(c2piV2);
        afficherResultatDuTest();
    }

    public static void main(String[] args) {
        new CarteTest();
    }
}