package santamaria.aldo.nivwll1_ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        for (int contador = 0; contador < 20; contador++) {
            list1.add(contador);
        }

        List<Integer> list2 = new LinkedList<>();

        for (int contador = list1.size() - 1; contador >= 0; contador--) {
            list2.add(list1.get(contador));
        }

        ListIterator<Integer> listIterator = list1.listIterator();
        while (listIterator.hasPrevious()) {
            list2.add(listIterator.previous());
        }

        System.out.println("List reversed with ListIterator");
        for (Integer integer : list2) {
            System.out.println(integer);
        }

    }
}
