package Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ListMap {
    public ListMap() {
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();

        map.put("employeeID", "101");
        map.put("first_name", "Mida");
        map.put("last_name", "Peetr");
        map.put("email", "dwk@gmail.com");

        System.out.println(map);

        List<String> emp = Files.readAllLines(Paths.get("employee2"));
        Map<String, String> e3 = new LinkedHashMap<>();
        for (String each:emp) {
            System.out.println("each = " + each);
            String [] arr = each.split("=");
            e3.put(arr[0], arr[1]);
        }

    }
}
