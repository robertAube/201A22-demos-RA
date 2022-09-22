//Cours : 420-201 – Introduction à la programmation
//Groupe : 1
//Nom : Aubé
//Prénom : Robert
//DA : 1234567
//Date : (2022-09-22)

public class Cours09_while {
    public Cours09_while() {
        // jouerAvecChar();
        // jouerCharAt();
        // jouerAvecModulo();
        testerCompterDe1AN();
    }

    private void testerCompterDe1AN() {
        compterDe1ANV1(3);
        compterDe1ANV1(5);
        compterDe1ANV1(0);
        compterDe1ANV1(1);
    }

    private void compterDe1ANV1(int nbLimite) {
        int compteur;

        compteur = 1;
        while (compteur <= nbLimite) {
            System.out.print(compteur);
            if (compteur < nbLimite) {
                System.out.print(", ");
            }
            compteur += 1;
        }
        System.out.println();
    }

    private void compterDe1ANV2(int nbLimite) {
        int compteur;

        compteur = 1;
        while (compteur <= nbLimite) {
            System.out.print(compteur);
            System.out.print((compteur < nbLimite) ? ", " : "");
            compteur += 1;
        }
        System.out.println();
    }


    private void jouerAvecModulo() {
        double dividente;
        double diviseur;

        dividente = 6;
        diviseur = 2;
        System.out.print(dividente + " / " + diviseur + " = " + dividente / diviseur);
        System.out.println("; reste = " + dividente % diviseur);

        dividente = 7;
        diviseur = 2;
        System.out.print(dividente + " / " + diviseur + " = " + dividente / diviseur);
        System.out.println("; reste = " + dividente % diviseur);

        dividente = 13;
        diviseur = 5;
        System.out.print(dividente + " / " + diviseur + " = " + dividente / diviseur);
        System.out.println("; reste = " + dividente % diviseur);
    }

    private void jouerCharAt() {
        int longueurStr;
        String str = "Bonjour le monde#";
        char premiereLettre;
        char derniereLettre;

        System.out.println(str);

        premiereLettre = str.charAt(0);

        System.out.println("La première lettre de " + str + " est " + premiereLettre + ".");

//        derniereLettre = str.charAt(3); // va chercher la 4ième lettre

        longueurStr = str.length();

        derniereLettre = str.charAt(longueurStr - 1); // va chercher la 4ième lettre

        System.out.println("La longueur de " + str + " est " + longueurStr + ".");

        System.out.println("La dernière lettre de " + str + " est " + derniereLettre + ".");

    }


    private void jouerAvecChar() {
        char lettre;
        String mot = "Aloh";

        //lettre = "a"; //On ne peut pas mettre une chaine de caractère dans un char
        lettre = 'a'; //constante char a

        System.out.println(lettre);

        System.out.println("Canad" + lettre);

        System.out.println((char) (lettre + 1));
        System.out.println((char) 98);
        System.out.println((char) 0x062);

        mot += lettre;
        System.out.println(mot);
    }

    public static void main(String[] args) {
        new Cours09_while();
    }
}
