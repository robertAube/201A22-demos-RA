/*
Le nom de la classe est toujours le même que le nom du fichier.
Le nom doit commencer par une majuscule
*/
public class DeuxiemeCours {

    //La méthode Constructeur a toujours le même nome que la classe et du fichier
    public DeuxiemeCours() {  //Pour créer le constructeur de la classe je fais ALT-Insert

        System.out.println("Je suis dans le constructeur.");
        afficherBonjourLeMonde();
        faireOperationMathematique();
        faireOperationArithmetique();
        faireUneAdditionV1(2, 3);
        faireUneAdditionV1(5, 3);
        faireUneAdditionV1(0, 0);
        faireUneAdditionV1(0, -3);

        faireUneAdditionV2(2, 3);

        faireLaSoustraction(4, 1); // Affiche 4 - 1 = 1

        faireLaDivision(4, 1);
        faireLaDivision(3, 2);
        faireLaDivision(7, 2);
    }

    private void faireLaDivision(int numerateur, int denominateur) {
        System.out.println("faireLaDivision(int numerateur, int denominateur)");
        double quotien;

        quotien = (double) numerateur / denominateur; //On doit dire que la division des 2 entiers doit se faire comme des réels - on fait un cast

        System.out.println(numerateur + " / " + denominateur + " = " + quotien);

    }

    private void faireLaSoustraction(int nb1, int nb2) {
        System.out.println("faireLaSoustraction(int nb1, int nb2)");

        int reponse = nb1 - nb2;

        System.out.println(nb1 + " - " + nb2 + " = " + reponse);
    }

    private void faireUneAdditionV2(int nb1, int nb2) {
        System.out.println("faireUneAdditionV2(int nb1, int nb2)");
        int reponse; //déclaration d'une variable local

        reponse = nb1 + nb2; //affectation de la variable réponse avec le résultat de l'addition.

        System.out.println(nb1 + " + " + nb2 + " = " + reponse);
    }

    private void faireUneAdditionV1(int nb1, int nb2) { //cette méthode recoit en argument (ou paramètre 2 valeurs qui sont placé dans les variables nb1 et nb2.
        System.out.println("faireUneAdditionV1(int nb1, int nb2)");
        System.out.println(nb1 + " + " + nb2 + " = " + (nb1 + nb2));
    }

    private void faireOperationArithmetique() {
        System.out.println("faireOperationArithmetique()");
        System.out.println("2 + 4 = " + (2 + 4));
        System.out.println("2 x 4 = " + (2 * 4));
        System.out.println("2 - 4 = " + (2 - 4));
        System.out.println("8 / 4 = " + (8 / 4));
        System.out.println("2 / 4 = " + (2 / 4));
        System.out.println("3 / 2 = " + (3 / 2));
        System.out.println("2 + 4 * 5 = " + (2 + 4 * 5));
        System.out.println("2 + (4 * 5) = " + (2 + (4 * 5)));
    }

    private void faireOperationMathematique() {
        System.out.println("faireOperationMathematique()");
        System.out.println("2 + 4 = " + "6"); //le + fait une concaténation des 2 chaines de caractères
        System.out.println(2 + 4);
        System.out.println("2 + 4 = " + 2 + 4); //le + fait une concaténation des 2 et 4 convertis en caine de caractère
        System.out.println("2 + 4 = " + (2 + 4)); // ici 2 + 4 est calculé avant
    }

    private void afficherBonjourLeMonde() {
        System.out.println("Bonjour le monde");
    }

    public static void main(String[] args) {
        System.out.println("Je suis dans le main().");
        new DeuxiemeCours(); //Appelle la méthode constructeur de ma classe
    }
}
