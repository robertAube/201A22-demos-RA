import java.util.Scanner;

public class LectureClavier {
    public LectureClavier() {
        // lireAuClavierEtAfficherMot();

        jouerAvecOperateurAffectation();


    }

    private void jouerAvecOperateurAffectation() {

        int a = 0;

        System.out.println("a = " + a); // a = 0
        a += 2; //a = a + 2
        System.out.println("a = " + a); // a = 2
        a -= 1; //a = a - 1
        System.out.println("a = " + a); // a = 1
        a += 2 + a ; //a = a + 2 + a
        System.out.println("a = " + a); // a = 4
        a *= 2; //a = a * 2
        System.out.println("a = " + a); // a = 8
        a /= 2; //a = a / 2
        System.out.println("a = " + a); // a = 4
    }

    private void lireAuClavierEtAfficherMot() {
        //lire au clavier
        Scanner scanner;
        String mot;

        scanner = new Scanner(System.in); //Instanciation de l'utilitaire de lecture. Créer un objet

        System.out.print("SVP Entrez un mot : ");
        mot = scanner.nextLine();

        mot = mot.trim();
        mot = mot.toUpperCase();
        mot = mot.replace(" ", "");

        System.out.println("\"" + mot + "\"");
    }

    public static void main(String[] args) {
        new LectureClavier();
    }
}
