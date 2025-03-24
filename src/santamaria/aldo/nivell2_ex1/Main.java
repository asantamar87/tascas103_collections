package santamaria.aldo.nivell2_ex1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {


        //Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació
        // en un HashSet creat en el main() de l’aplicació.

        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(new Restaurant("Can Pep", 5));
        restaurants.add(new Restaurant("Can Pep", 5));
        restaurants.add(new Restaurant("Can Pep", 4));
        restaurants.add(new Restaurant("Can Pep", 4));
        restaurants.add(new Restaurant("Can Pep", 3));
        restaurants.add(new Restaurant("Can Pep", 3));


        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant: " + restaurant.getName() + ", Score: " + restaurant.getScore());
        }
    }


}
