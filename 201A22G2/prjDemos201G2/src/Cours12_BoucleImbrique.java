public class Cours12_BoucleImbrique {
    public Cours12_BoucleImbrique() {

        testerInverserString();
//        textergetStringCarre();
    }

    public void testerInverserString() {
        System.out.println(inverserString("abc").equals("cba"));
        System.out.println(inverserString("").equals(""));
        System.out.println(inverserString("54321 $%?").equals("?%$ 12345"));
    }

    private void textergetStringCarre() {
        System.out.println(getStringCarre(1));
        System.out.println(getStringCarre(2));
        System.out.println(getStringCarre(3));
    }

    public String getStringCarre(int limite) {
        String str = ""; //"\n"

        //Boucle imbriquée
        for (int ligne = 1 ; ligne <= limite; ligne++) {
            for (int colonne = 1; colonne <= limite; colonne++) {
                str += " " + colonne + ligne;
            }
            str += "\n";
        }

        return str;
    }



    private String inverserString(String str) {
        String strInverse = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            strInverse += str.charAt(index);
        }

        return strInverse;
    }

    /*
    •	Écrivez une méthode qui reçoit en argument une chaine de caractères. Et retourne, la chaine inversée. Exemples:
        	"abcd" ➞ "dcba"
        	"abcdefg" ➞ "gfedcba"
        	"" ➞ ""
     */

    public static void main(String[] args) {
        new Cours12_BoucleImbrique();
    }
}
