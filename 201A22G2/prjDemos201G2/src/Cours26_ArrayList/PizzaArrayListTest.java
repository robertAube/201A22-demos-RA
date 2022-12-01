package Cours26_ArrayList;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-11-29)
 */
public class PizzaArrayListTest {
    private PizzaArrayList listPizza;
    public PizzaArrayListTest() {
        listPizza = new PizzaArrayList();
        ajouterDesPizzas();
        afficherDesPizzas();
        avancerDesPizzas();;
        afficherDesPizzas();
        testerRetirerPizza();
    }

    private void ajouterDesPizzas() {
        listPizza.ajouterPizza(new Pizza(1,1,"bleu", 4));
        listPizza.ajouterPizza(new Pizza(1,1,"rouge", 4));
        listPizza.ajouterPizza(new Pizza(1,1,"jaune", 4));
        listPizza.ajouterPizza(new Pizza(1,1,"verte", 4));
        listPizza.ajouterPizza(new Pizza(1,1,"mauve", 4));
    }
    private void afficherDesPizzas() {
        System.out.println(listPizza.toString());
    }
    private void avancerDesPizzas() {
        listPizza.avancerToutesLesPizzas();
    }

    private void testerRetirerPizza() {
        listPizza.enleverPizza(0);
        afficherDesPizzas();
        listPizza.enleverPizza(new Pizza(5,1,"verte", 4));
        System.out.println("tester retire objet : " + listPizza.toString());
    }

    public static void main(String[] args) {
        new PizzaArrayListTest();
    }
}
