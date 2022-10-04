public class Cours12 {
    public Cours12() {
        testStrMelanger();

    }

    private void testStrMelanger() {
        System.out.println(strMelanger("abcd"));
        System.out.println(strMelanger("").equals(""));
        System.out.println(strMelanger("aujourd'hui").equals("ajudhiuor'u"));
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
        for (int index = 0 ; index < str.length(); index++) {
            c = str.charAt(index);

            if (index % 2 == 0) { // pair
                debut += c;
            } else {
                fin += c;
            }
        }
        return debut + "\n" + fin;
    }

    public static void main(String[] args) {
        new Cours12();
    }
}
