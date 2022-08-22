public class PremierPgm { //La classe doit avoir exactement le même nom que le fichier
    //Appuyer sur ALT-Insert pour créer le constructeur
    public PremierPgm() { //Constructeur - a exactement le même nom que la classe et que le fichier
        System.out.println("Je suis dans contructeur");

        afficherBonjourLeMonde();

        System.out.println("Bonjour le monde 1"); //affiche une chaine de caractères
        System.out.println("Bonjour le monde 2"); //affiche une chaine de caractères
    }

    private void afficherBonjourLeMonde() {
        System.out.println("Bonjour le monde");
    }


    public static void main(String[] args) {
        System.out.println("Je suis dans le main()");
        new PremierPgm(); //Appeler le constructeur de la classe PremierPgm
    }
}




