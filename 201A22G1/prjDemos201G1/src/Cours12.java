public class Cours12 {
    public Cours12() {
        //    testStrMelanger();
        texterGetStringCarre();
    }


    private void testStrMelanger() {
        System.out.println(strMelanger("abcd"));
        System.out.println(strMelanger("").equals(""));
        System.out.println(strMelanger("aujourd'hui").equals("ajudhiuor'u"));
    }

    private void texterGetStringCarre() {
        System.out.println(getStringCarre(1));
        System.out.println(getStringCarre(2));
        System.out.println(getStringCarre(3));
    }

    /*
o	Écrire une méthode getStringCarre  dont le teste suivant…
private void textergetStringCarre() {
System.out.println(getStringCarre(1));
System.out.println(getStringCarre(2));
System.out.println(getStringCarre(3));
}
affiche…
11

11 21
12 22

11 21 31
12 22 32
13 23 33

 */
    private String getStringCarre(int limite) {
        String str = "";

        for (int ligne = 1; ligne <= limite; ligne++) {  //boucle imbriquée
            for (int colonne = 1; colonne <= limite; colonne++) {
                str += colonne + "" + ligne + " ";
            }
            str += "\n";
        }

        return str;
    }


    /*
        o	Écrivez une méthode qui reçoit en argument une chaine de caractères.
        La méthode récupère tous les caractères indexés pairs, puis impairs de cette chaîne et les concatène pour les retourner.
        L’index 0 est le premier caractère de la chaine et est considéré pair.
        Exemples :
        	"abcd" ➞ "acbd"
        	"abcdefg" ➞ "acegbdf"
        	"123456789" ➞ "135792468"
        	"ben voyons!" ➞ "bnvyn!e oos"
        	"aujourd’hui" ➞ "ajudhiuor'u"
     */
    private String strMelanger(String str) {
        char c;
        String debut, fin;

        debut = "";
        fin = "";
        for (int index = 0; index < str.length(); index++) {
            c = str.charAt(index);

            if (index % 2 == 0) { // pair
                debut += c;
            } else {
                fin += c;
            }
        }
        return debut + fin;
    }


    public static void main(String[] args) {
        new Cours12();
    }
}
