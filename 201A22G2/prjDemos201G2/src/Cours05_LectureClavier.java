import java.util.Scanner;

public class Cours05_LectureClavier {
    public Cours05_LectureClavier() {
//        lireEtAfficherMot();

        jouerAvecOperateurAffectation();
    }

    private void jouerAvecOperateurAffectation() {
        int a = 0;

        System.out.println("a = " + a);
        a += 2; // a = a + 2
        System.out.println("a = " + a);
        a -= 1; // a = a - 1
        System.out.println("a = " + a);
        a *= 10; // a = a * 10
        System.out.println("a = " + a);
        a /= 2; // a = a / 2
        System.out.println("a = " + a);
    }

    private void lireEtAfficherMot() {
        //lire au clavier
        Scanner scanner; //Instance de l'utilitaire de lecture
        String mot;

        System.out.print("Entrez un mot : "); //print sans ln pour que la saisie se fasse sur la même ligne
        scanner = new Scanner(System.in); //Création de l'instance de l'utlitaire de lecture

        mot = scanner.nextLine();

        mot = mot.trim();
        mot = mot.toUpperCase();
        mot = mot.replace(" ", "");

        System.out.println("\"" + mot + "\""); // le \ est un caractère de ctrl qui me permet de faire suivre le "
    }

    public static void main(String[] args) {
        //Appel du constructeur
        //Crée une nouvelle instance (objet) de LectureClavier()
        new Cours05_LectureClavier();

    }
}
