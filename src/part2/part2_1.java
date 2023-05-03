package part2;

import java.util.ArrayList;
import java.util.List;

public class part2_1 {
    public static void main(String[] args){
        ArrayList strings = new ArrayList();
        String[] array = {"banana", "cat", "apple", "assignment", "book", "door", "zebra"};
        strings.addAll(List.of(array));

        int index = recLinearSearch(strings, "apple", 1, 4);

        if (index != -1){
            System.out.println("String at index: " + index +  " == " + strings.get(index));

        } else {
            System.out.println("Element not found!");
        }

    }

    public static int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx){
        if (list.isEmpty() || beginIdx > endIdx){
            return -1;
        }

        else if (list.get(beginIdx).equals(key)){
            return beginIdx;
        }

        else {
            return recLinearSearch(list, key, beginIdx + 1, endIdx);
        }
    }
}
