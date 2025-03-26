package santamaria.aldo.level1_ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex2 {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            firstList.add(i);
        }

        List<Integer> secondList = new LinkedList<>();

        int index= firstList.size();
        ListIterator<Integer> iterator = firstList.listIterator(index);

        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous());
        }

        System.out.println("➡️ Primera llista (ordre original): " + firstList);
        System.out.println("⬅️ Segona llista (ordre invers): " + secondList);

    }
}
