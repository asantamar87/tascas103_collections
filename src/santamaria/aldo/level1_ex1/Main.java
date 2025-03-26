package santamaria.aldo.level1_ex1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));


        System.out.println("_______________________________ ");
        System.out.println("********** ARRAYLIST **********");
        System.out.println("_______________________________ ");

        System.out.println(months.size() + " months added to the list");
        System.out.println(months);

        months.add(7, new Month("Agost"));

        System.out.println("Agost added to the list in the 8th position, the list has now " + months.size() + " months");
        System.out.println(months);


        System.out.println("______________________________________________________ ");
        System.out.println("********** ARRAYLIST TO HASHSET **********");
        System.out.println("______________________________________________________ ");

        HashSet<Month> hashSet = new HashSet<>(months);

        System.out.println("\nHashSet (no duplicate):");
        for (Month month : hashSet) {
            System.out.println(month);
        }

        System.out.println("\nUsing for loop:");
        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }



}
