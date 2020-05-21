package Practice;

import java.util.ArrayList;
import java.util.List;

public class ForeachForLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("q");
        list.add("e");
        list.add("h");

        for (String s : list) {
            System.out.println("s = " + s);
        }        
    }
}
