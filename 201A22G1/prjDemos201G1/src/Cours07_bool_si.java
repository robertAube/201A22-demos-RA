//Cours : 420-201 – Introduction à la programmation
//Groupe : 1
//Nom : Aubé
//Prénom : Robert
//DA : 1234567
//Date : (2022-09-15)

public class Cours07_bool_si {
    public Cours07_bool_si() {
        testerBoolean();
        //testerSi();
        //testerAfficherNoteEstReussite();
    }

    private void testerSi() {
        afficherSiUnNombreEstPositif(5);
        afficherSiUnNombreEstPositif(-5);
    }

    private void testerAfficherNoteEstReussite() {
        afficherNoteEstReussite(50);
        afficherNoteEstReussite(59);
        afficherNoteEstReussite(59.999f);
        afficherNoteEstReussite(60);
        afficherNoteEstReussite(61);
        afficherNoteEstReussite(100);
    }

    private void afficherNoteEstReussite(float note) {
        boolean estUnSucces;

        estUnSucces = note >= 60;

        if (estUnSucces) {
            System.out.println("La note " + note + " est une réussite." );
        } else {
            System.out.println("La note " + note + " est un échec.");
        }
    }


    private void afficherSiUnNombreEstPositif(int nombre) {
        System.out.print(nombre);
        if (nombre >= 0) {
            System.out.println(" est un nombre positif.");
        } else {
            System.out.println(" est un nombre négatif.");
        }
        System.out.println("méthode terminée");
    }

    private void testerBoolean() {
        int i = 0;
        System.out.println("true -> " + true);
        System.out.println("false -> " + false);
        System.out.println("2 < 3 -> " + (2 < 3));
        System.out.println("2 > 3 -> " + (2 > 3));
        System.out.println("2 == 3 -> " + (2 == 3));
        System.out.println("3 == 3 -> " + (3 == 3));
        System.out.println("2 >= 3 -> " + (2 >= 3));
        System.out.println("3 >= 3 -> " + (3 >= 3));
        System.out.println("2 <= 3 && 3 < 4 -> " + (2 <= 3 && 3 < 4));
        System.out.println("i <= 3 && i < 4 -> " + (i <= 3 && i < 4));
        System.out.println("2 == 3 && 2 < 4) -> " + (2 == 3 && 2 < 4));
        System.out.println("2 == 3 || 2 < 4 -> " + (2 == 3 || 2 < 4));


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
