package Practice.ReBootcamp;
import java.util.*;

public class FindUniquesCollections {

    public static void list2(){
        List<String> initialList = Arrays.asList("eBay", "paypal", "google", "eBay", "google", "paypal");
        System.out.printf("\nInitial list: %s%n", initialList);
        sortList(initialList);
    }

    public static void sortList (List<String> myList){
        Set<String> hashsetList = new HashSet<String>(myList);
        System.out.printf("\nUnique values using HashSet: %s%n", hashsetList);

        Set<String> treesetList = new TreeSet<String>(myList);
        System.out.printf("\nUnique values using TreeSet - Sorted order: %s%n", treesetList);
    }

    public static void javaCount(String str){
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {

            if (str.substring(i, i+4).equalsIgnoreCase("java")){
                count++;
            }
        }
            System.out.println(count);
        }
        public static int countOf(String str, String word){
        int count = str.split(word).length-1;
            System.out.println(count);
            return count;
    }


    public static void main(String[] args) {
        //FindUniquesCollections.javaCount("javaabdjavaoopjavaeed");
       // FindUniquesCollections.countOf("javaisfunNomatterwhatjava", "java");

        //approach 2
        String str = "javakfkrorjavajdorfjava";
        int java = 0;
        str = str.toLowerCase();
        while(str.contains("java")){
            java++;
            str = str.replaceFirst("java", "");
//str = str.substring(str.indexOf("java")+4);
        }
        System.out.println("java was found "+java);
    }

}

