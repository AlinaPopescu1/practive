package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByDecreasingOrder {

    public static String frequencySort(String s) {
        String result = "";
        int count = 0;
        //tree
        Map<Character, Integer> map = new HashMap<>();
        for (char each : s.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        //List with all keys from our map
        // t,r,e
        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((i, j) -> map.get(j) - map.get(i));
        //e,t,r
        int c=0;
        for (Character each : list) {
            while (c!=map.get(each)) {
                result+=each;
                c++;
            }
            c=0;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}