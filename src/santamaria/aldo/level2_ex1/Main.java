package santamaria.aldo.level2_ex1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(new Restaurant("Can Pep", 5));
        restaurants.add(new Restaurant("Can Pep", 5));
        restaurants.add(new Restaurant("Can Aep", 4));
        restaurants.add(new Restaurant("Can Pep", 4));
        restaurants.add(new Restaurant("Can Pep", 3));
        restaurants.add(new Restaurant("Can Pep", 3));


        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant: " + restaurant.getName() + ", Score: " + restaurant.getScore());
        }
    }


}
