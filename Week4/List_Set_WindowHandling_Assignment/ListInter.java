package list.set.window.assign;

import java.util.ArrayList;
import java.util.List;

public class ListInter {
    public static void main(String[] args) {

        
        int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};

    
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i : array1) {
            list1.add(i);
        }

        for (int i : array2) {
            list2.add(i);
        }

        
        System.out.println("Intersection values are:");
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
        }
    }
}
