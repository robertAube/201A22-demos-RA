package Cours26_ArrayList;

import java.util.ArrayList;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-11-29)
 */
public class PizzaArrayList {
    private ArrayList<Pizza> listPizza;
    private ArrayList<Integer> listEntier;

    public PizzaArrayList() {
        this.listPizza = new ArrayList<Pizza>();
    }

    public void ajouterPizza(Pizza p) {
        listPizza.add(p);
    }


    public void enleverPizza(int i) {
        listPizza.remove(i);
    }
    public void enleverPizza(Pizza p) {
        listPizza.remove(p);
    }
    public void avancerToutesLesPizzas() {
        for (int i = 0; i < listPizza.size(); i++) {
            listPizza.get(i).avancerX();
        }
    }

    @Override
    public String toString() {
        return "PizzaArrayList{" +
                "listPizza=" + listPizza +
                '}';
    }
}
