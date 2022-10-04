//Cours : 420-201 – Introduction à la programmation
//Nom : Aubé
//Prénom : Robert
//Date : 2022-09-29

import java.util.Scanner;

public class Cours11_doWhile {
    public Cours11_doWhile() {
        appuyerSurEspaceEtEnterPourContinuer_while();
        appuyerSurEspaceEtEnterPourContinuer_doWhile();
        jouerAvecLEgaliteDesStrings();
//        testerInverserStr();
    }

    private void appuyerSurEspaceEtEnterPourContinuer_doWhile() {
        String strSaisie;

        do { //passe au moins 1 X dans la boucle
            strSaisie = lireString("SVP appuyer sur la barre d'espacement puis sur Enter : ");
        } while (!strSaisie.equals(" "));
        System.out.println("Bravo d'avoir appuyé sur l'espace");
    }

    private void appuyerSurEspaceEtEnterPourContinuer_while() {
        String strSaisie;

        strSaisie = lireString("SVP appuyer sur la barre d'espacement puis sur Enter : ");
        //      System.out.println("[" + strSaisie + "]");
        while (!strSaisie.equals(" ")) {
            strSaisie = lireString("SVP appuyer sur la barre d'espacement puis sur Enter : ");
        }
        System.out.println("Bravo d'avoir appuyé sur l'espace");
    }

    private void jouerAvecLEgaliteDesStrings() {
        String str1, str2;

        str1 = "abc";
        System.out.println(str1.equals("abc") == true);
        str1 = "abc";
        System.out.println(str1.equals("aBc") == false);
        str1 = "abc";
        System.out.println(str1.equalsIgnoreCase("aBc") == true);
        str1 = "abc";
        str2 = "abc";
        System.out.println(str1.equals(str2) == true);
        str1 = "";
        System.out.println(str1.equals("") == true);
        str1 = "abc ";
        System.out.println(str1.equals("abc") == false);
        str1 = "abc ";
        str1 = str1.trim();
        System.out.println(str1.equals("abc") == true);
    }

    private void testerInverserStr() {
        System.out.println(inverserStr("abcd"));
        System.out.println(inverserStr(""));
        System.out.println(inverserStr("12("));
    }

    private String inverserStr(String str) {
        String strInverse = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            strInverse += str.charAt(index);
        }

        return strInverse;
    }

    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    /*
    méthode qui reçoit en argument une chaine de caractères. Et retourne, la chaine inversée. Exemples:
	"abcd" ➞ "dcba"

     */
    public static void main(String[] args) {
        new Cours11_doWhile();
    }
}
