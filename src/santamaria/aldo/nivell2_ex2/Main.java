package santamaria.aldo.nivell2_ex2;

import santamaria.aldo.nivell2_ex1.Restaurant;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //Utilitzant la classe del programa anterior,
        // crea la implementació necessària perquè els objectes de la classe Restaurant estiguin ordenats per nom i per puntuació en ordre descendent.

        Set<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("Restaurant A", 8));
        restaurants.add(new Restaurant("Restaurant A", 7));
        restaurants.add(new Restaurant("Restaurant B", 9));
        restaurants.add(new Restaurant("Restaurant B", 5));
        restaurants.add(new Restaurant("Restaurant C", 10));
        restaurants.add(new Restaurant("Restaurant C", 10));

        for (Restaurant r : restaurants) {
            System.out.println(r);
        }

    }
}
