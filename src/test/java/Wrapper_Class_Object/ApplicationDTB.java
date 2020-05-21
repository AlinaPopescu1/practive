package Wrapper_Class_Object;

public class  ApplicationDTB{
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();


        user1.setInfo("Dave Mevrick", "M", 35,
                "9766 Frederick Ave,Los Angeles, CA, 90032",
                "442-455-2222", "AM765123");

        user2.setInfo("Jahangir Majidov", "M", 27,
                "4832 Owl Hway, Fairfax, VA, 38422","443-677-221",
                "JM34948");
//
//        System.out.println("User1 address is:" + user1.address);
//        System.out.println(user2.phoneNumber);
//
//        user2.address = "132 Columbus Hwy";
//        System.out.println("user2.address = " + user2.address);
//        user2.age = 33;
//
//        //System.out.println(user1.toString());
        System.out.println(user1);
        System.out.println(user2);
    }
}
