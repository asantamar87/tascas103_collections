package santamaria.aldo.nivell1_ex1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"};

        for (String monthName : monthNames) {
            months.add(new Month(monthName));
        }

        months.add(7, new Month("Agost"));

        System.out.println("Using ArrayList:");
        months.forEach(month -> {
            System.out.println(month.getName());
        });

        System.out.println("From Arraylist to HashSet");

        Set<Month> monthSet = new HashSet<>(months);

        Iterator<Month> iterator = monthSet.iterator();

        System.out.println("Llista ordenada d'HashSet amb iterador :");

        for (Month month : monthSet) {
            System.out.println(month.getName());
        }

        System.out.println("Llista");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }


    }
}
