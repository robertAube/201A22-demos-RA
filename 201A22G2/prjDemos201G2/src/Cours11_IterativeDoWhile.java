//Cours : 420-201 – Introduction à la programmation
//Nom : Aubé
//Prénom : Robert
//Date : 2022-09-26

import java.util.Scanner;

public class Cours11_IterativeDoWhile {
    public Cours11_IterativeDoWhile() {
        appuyerSurEspacePuisEnterSVP_While();
        //    testerMelangerStr();
        //    jouerAvecLEgaliteDesStrings();
    }

    // A NE PAS FAIRE!!!!!!!!!!!!!!!!!!!
    private void appuyerSurEspacePuisEnterSVP_While() {
        String strSaisie;

        strSaisie = lireString("SVP Appuyer sur la barre d'espacement puis sur Enter : ");
        //  System.out.println("[" + strSaisie + "]");
        while (!strSaisie.equals(" ")) {
            strSaisie = lireString("SVP Appuyer sur la barre d'espacement puis sur Enter : ");
        }
        System.out.println("Bravo d'avoir appuyé sur l'espace!");
    }

    private void appuyerSurEspacePuisEnterSVP_DoWhile() {
        String strSaisie;

        do { //pas de test : on exécute au moins une fois la boucle
            strSaisie = lireString("SVP Appuyer sur la barre d'espacement puis sur Enter : ");
        } while (!strSaisie.equals(" "));

        System.out.println("Bravo d'avoir appuyé sur l'espace!");
    }

    private String lireString(String question) {
        String reponse;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.print(question);
        reponse = sc.nextLine();

        return reponse;
    }

    private void jouerAvecLEgaliteDesStrings() {
        String str;

        str = "abc";
        System.out.println(str.equals("abc") == true);
        str = "aBc";
        System.out.println(str.equals("abc") == false);
        str = "aBc";
        System.out.println(str.equalsIgnoreCase("abc") == true);
        str = "";
        System.out.println(str.equals("") == true);
        str = "abc ";
        System.out.println(str.equals("abc") == false);
    }

    private void testerMelangerStr() {
        System.out.println(melangerStr("abcde").equals("acebd"));
        System.out.println(melangerStr("abcdefg").equals("acegbdf"));
        System.out.println(melangerStr("123456789").equals("135792468"));
        System.out.println(melangerStr("ben voyons!").equals("bnvyn!e oos"));
        System.out.println(melangerStr("aujourd'hui").equals("ajudhiuor'u"));
        System.out.println(melangerStr("").equals(""));
        System.out.println(melangerStr("1").equals("1"));
    }

    public String melangerStr(String str) {
        String strMelange;
        String strPair = "";
        String strImpair = "";

        for (int index = 0; index < str.length(); index++) {
            if (index % 2 == 0) {
                strPair += str.charAt(index);
            } else {
                strImpair += str.charAt(index);
            }
            //          System.out.println(index + " = " + str.charAt(index) + " - " + (index % 2));
        }
        strMelange = strPair + strImpair;
        return strMelange;
    }

    public static void main(String[] args) {
        new Cours11_IterativeDoWhile();
    }
}
