//FORMATIF 3
//Cours : 420-201 – Introduction à la programmation
//Groupe : 1
//Nom : Aubé
//Prénom : Robert
//DA : 1234567
//Date : (2022-09-12)

public class Cours07_bool_si {
    public Cours07_bool_si() {
      //  testerBoolean();
//        testerLeSi();
        testerTypeBoolean();
    }

    private void testerTypeBoolean() {
        boolean estUnSucces;

        int note = 65;

        estUnSucces = note > 60;

        System.out.println(estUnSucces);
    }

    private void testerLeSi() {
        afficherSiUnNbEstPositif(5);
        afficherSiUnNbEstPositif(0);
        afficherSiUnNbEstPositif(1);
        afficherSiUnNbEstPositif(-1);

        afficherSiUnNbEstPositifOuNegatif(0);
        afficherSiUnNbEstPositifOuNegatif(1);
        afficherSiUnNbEstPositifOuNegatif(-1);
    }

    private void afficherSiUnNbEstPositif(int nombre) {
        if (nombre >= 0) {
            System.out.println(nombre + " est positif.");
        }
    }

    private void afficherSiUnNbEstPositifOuNegatif(int nombre) {
        if (nombre >= 0) {
            System.out.println(nombre + " est positif.");
        }
        else {
            System.out.println(nombre + " est négatif.");
        }
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
    }

    public static void main(String[] args) {
        new Cours07_bool_si();
    }
}
