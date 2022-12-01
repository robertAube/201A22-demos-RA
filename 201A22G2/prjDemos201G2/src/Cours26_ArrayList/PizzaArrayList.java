package Cours26_ArrayList;

import java.util.ArrayList;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2022-11-29)
 */
public class PizzaArrayList {
    private ArrayList<Pizza> listPizza;

    @Override
    public String toString() {
        return "PizzaArrayList{" +
                "listPizza=" + listPizza.toString() +
                '}';
    }

    public PizzaArrayList() {
        ArrayList<Integer> listInt;
        listInt = new ArrayList<>();
        listInt.add(2);

        listPizza = new ArrayList<>();

    }

    public void ajouterPizza(Pizza p) {
        listPizza.add(p);
    }

    public Pizza getPizza(int i) {
        return listPizza.get(i);
    }

    public Pizza enleverPizza(int i) {
        return listPizza.remove(i);
    }

    public void enleverPizza(Pizza p) {
        listPizza.remove(p);
    }

    public void viderLesPizzas() {
        listPizza.clear();
    }
    public void avancerToutesLesPizzas() {
        for (int i = 0; i < listPizza.size(); i++) {
            listPizza.get(i).avancerX();
        }
    }
}
