package santamaria.aldo.level2_ex2;


import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

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
