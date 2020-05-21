package Practice.ReBootcamp.Day2_Classes_Objects;
//prime number is divisible by itself and 1 only
public class Prime {
    public static void main(String[] args) {
        PrintAllTo(100);
    }
    public static void PrintAllTo(int num){
        for (int i = 2; i <= num ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        //check if is not prime to return boolean
        for (int j = 2; j < num ; j++) {
            if(num%j == 0) return false;
        }
        return true;
    }
}
