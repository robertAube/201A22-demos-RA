//Cours : 420-201 – Introduction à la programmation
//Nom : Aubé
//Prénom : Robert
//DA : 1234567
//Date : (2022-09-19)

public class Cours09_IterativeWhile {
    public Cours09_IterativeWhile() {
           jouerAvecChar();
//        jouerAvecStringCharAt();
//        jouerAvecModulo();
 //       testerCompterDe1AN();
    }

    private void testerCompterDe1AN() {
        compterDe1ANV2(5);
        compterDe1ANV2(1);
        compterDe1ANV2(0);
        compterDe1ANV2(-1);
    }

    private void compterDe1AN(int nbLimite) {
        int compteur = 1;
        System.out.println("\nCompter de 1 a " + nbLimite + ":");
        while (compteur <= nbLimite) {
            System.out.print(compteur);
            if (compteur < nbLimite) {
                System.out.print(", ");
            }
            compteur += 1;
        }
    }

    private void compterDe1ANV2(int nbLimite) {
        int compteur = 1;
        System.out.println("\nCompter de 1 a " + nbLimite + ":");
        while (compteur <= nbLimite) {
            System.out.print(compteur);
            System.out.print(compteur < nbLimite ? ", " : "");
            compteur++; //ajouter 1 au compteur
        }
    }

    private void jouerAvecModulo() {
        int dividente;
        int diviseur;

        dividente = 6;
        diviseur = 2;
        System.out.print(dividente + " / " + diviseur + " = " + dividente / diviseur);
        System.out.println(" reste = " + dividente % diviseur);

        dividente = 7;
        diviseur = 2;
        System.out.print(dividente + " / " + diviseur + " = " + dividente / diviseur);
        System.out.println(" reste = " + dividente % diviseur);

        dividente = 13;
        diviseur = 5;
        System.out.print(dividente + " / " + diviseur + " = " + dividente / diviseur);
        System.out.println(" reste = " + dividente % diviseur);
    }

    private void jouerAvecStringCharAt() {
        String str = "Allo";
        char premiereLettre;
        char derniereLettre;

        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);

        premiereLettre = str.charAt(0);

        System.out.println("La premiere lettre de " + str + " est " + premiereLettre + ".");

//        derniereLettre = str.charAt(6);
//        System.out.println("La derniere lettre de " + str + " est " + derniereLettre +".");

        System.out.println("Il y a " + str.length() + " caracteres dans le mot " + str);

        derniereLettre = str.charAt(str.length() - 1);

        System.out.println("La derniere lettre de " + str + " est " + derniereLettre + ".");
    }

    private void jouerAvecChar() {
        char lettre;
        String mot = "aloh";

        // lettre = "a"; //On ne peut pas mettre une chaine de caractères dans un char

        lettre = 'a'; //constante char

        System.out.println(lettre);
        System.out.println((char)(lettre + 1));

        lettre = 68; //an ne pas faire
        lettre = 'D';
        System.out.println(lettre);

        System.out.println("Canad" + lettre);

        mot += lettre;

        System.out.println(mot);
    }

    public static void main(String[] args) {
        new Cours09_IterativeWhile();
    }
}
