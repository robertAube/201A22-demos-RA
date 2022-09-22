//FORMATIF 3
//Cours : 420-201 – Introduction à la programmation
//Groupe : 1
//Nom : Aubé
//Prénom : Robert
//DA : 1234567
//Date : (2022-09-12)

public class Cours07_bool_si {
    public Cours07_bool_si() {
          testerBoolean();
  //      testerLeSi();
//        testerTypeBoolean();
    }

    private void testerTypeBoolean() {
        boolean estUnSucces;

        int note = 65;

        estUnSucces = note > 60;

        System.out.println(estUnSucces);
    }

    private void testerLeSi() {
//        afficherSiUnNbEstPositif(5);
//        afficherSiUnNbEstPositif(0);
//        afficherSiUnNbEstPositif(1);
//        afficherSiUnNbEstPositif(-1);

        afficherSiUnNbEstPositifOuNegatifV3(0);
        afficherSiUnNbEstPositifOuNegatifV3(1);
        afficherSiUnNbEstPositifOuNegatifV3(-1);
    }

    private void afficherSiUnNbEstPositif(int nombre) {
        if (nombre >= 0) {
            System.out.println(nombre + " est positif.");
        }
    }

    private void afficherSiUnNbEstPositifOuNegatif(int nombre) {
        if (nombre >= 0) {
            System.out.println(nombre + " est positif.");
        } else {
            System.out.println(nombre + " est négatif.");
        }
    }


    private void afficherSiUnNbEstPositifOuNegatifV2(int nombre) {
        System.out.print(nombre);
        if (nombre >= 0) {
            System.out.println(" est positif.");
        } else {
            System.out.println(" est négatif.");
        }

        System.out.println("Méthode terminée");
    }

    private void afficherSiUnNbEstPositifOuNegatifV3(int nombre) {
        System.out.print(nombre);
        if (nombre > 0) {
            System.out.println(" est positif.");
        } else if (nombre < 0) {
            System.out.println(" est négatif.");
        } else {
            System.out.println(" est ni négatif, ni positif.");
        }

        System.out.println("Méthode terminée");
    }

    private void testerBoolean() {
        System.out.println("true -> " + true);
        System.out.println("false -> " + false);
        System.out.println("2 < 3 -> " + (2 < 3));
        System.out.println("2 > 3 -> " + (2 > 3));
        System.out.println("2 == 3 -> " + (2 == 3));
        System.out.println("2 == 3 -> " + (2 == 3));
        System.out.println("2 <= 3 -> " + (2 <= 3));
        System.out.println("2 >= 3 -> " + (2 >= 3));
        System.out.println("2 <= 3 && 3 < 4 -> " + (2 <= 3 && 3 < 4));
        System.out.println("2 <= 3 && 3 > 4 -> " + (2 <= 3 && 3 > 4));
        System.out.println("2 <= 3 || 3 < 4 -> " + (2 <= 3 || 3 < 4));
        System.out.println("2 <= 3 || 3 > 4 -> " + (2 <= 3 || 3 > 4));

        System.out.println("2 != 3 -> " + (2 != 3));
        System.out.println("3 != 3 -> " + (3 != 3));

        System.out.println("!true -> " + !true);
        System.out.println("!false -> " + !false);
        System.out.println("!(3 == 3) -> " + !(3 == 3));
    }

    public static void main(String[] args) {
        new Cours07_bool_si();
    }
}
