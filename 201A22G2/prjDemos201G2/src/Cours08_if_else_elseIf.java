//Cours : 420-201 – Introduction à la programmation
//Groupe : 1
//Nom : Aubé
//Prénom : Robert
//DA : 1234567
//Date : (2022-09-15)

public class Cours08_if_else_elseIf {
    public Cours08_if_else_elseIf() {
//        testerAfficherRabais();
        testerCalculerRabais();
    }

    private void testerAfficherRabais() {
        afficherRabais(0);
        afficherRabais(99.99f);
        afficherRabais(100);
        afficherRabais(100.01f);
        afficherRabais(101);
        afficherRabais(499.99f);
        afficherRabais(500);
        afficherRabais(500.01f);
        afficherRabais(999.99f);
        afficherRabais(1000);
        afficherRabais(1999.99f);
        afficherRabais(2000);
    }

    private void testerCalculerRabais() {
        System.out.println(calculerRabais(0) == 0);
        System.out.println(calculerRabais(99.99f) == 0);
        System.out.println(calculerRabais(100) == .02f);
        System.out.println(calculerRabais(499.99f) == .02f);
        System.out.println(calculerRabais(500) == .03f);
    }

    private void afficherRabais(float montant) {
        String str;

        str = "Pour un montant de " + montant;
        str += ", vous avez un rabais de " + calculerRabais(montant) + "%";

        System.out.println(str);
    }


    /**
     * Faire une méthode qui calcule (il fait juste le calculer et ne l’affiche pas)
     * un rabais en fonction d'un montant reçu en argument. (calculerRabais)
     * o	-infini, 100[ -> 0
     * o	[100, 500[ -> 2%
     * o	[500, 1000[ -> 3%
     * o	[1000, 2000[ -> 4%
     * o	[2000, infini -> 5%
     *
     * @param montant montant de l'achat avant taxes
     * @return % de rabais en $
     */
    private float calculerRabais(float montant) {
        float rabais;

        if (montant < 100) {
            rabais = 0;
        } else if (montant < 500) {
            rabais = (float) 2 / 100;
        } else if (montant < 1000) {
            rabais = (float) 3 / 100;
        } else if (montant < 2000)
            rabais = (float) 4 / 100;
        else
            rabais = (float) 5 / 100;

        return rabais;
    }


    public static void main(String[] args) {
        new Cours08_if_else_elseIf();
    }

}
