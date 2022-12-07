package pages;


import java.util.*;
import java.util.stream.Collectors;

public class TaskOne {
    public static void main(String[] args) {

        List<Integer> listOne =  List.of(-1, 2, 3, 4, 5, 6, 1, 0, 2 ,3);
        List<Integer> listTwo = List.of(-1, 2, 3, 4, 5, 6, 1, 0, 2 ,3, 11);
        getNumber(listOne, listTwo);
        System.out.println(getNumber(listOne, listTwo));

    }

    public static Set<Integer> getNumber(List<Integer> list1, List<Integer> list2) {
       // Set<Integer> set2 = new HashSet<>();
       /* for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
               if (list2.contains(list1.get(i))) {
                    set2.add(list1.get(i));
                }
            }
       }*/
        return list1.stream().filter(n -> list2.contains(n)).collect(Collectors.toSet());
    }
}





