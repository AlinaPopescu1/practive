package Wrapper_Class_Object;

public class User {
    String name;
    String gender;
    int age;
    String address;
    String phoneNumber;
    static String membership;


    public void setInfo(String userName, String userGender, int userAge,
                        String userAddress, String userPhoneNumber, String membership) {

        this.name = userName;
        this.gender = userGender;
        this.age = userAge;
        this.address = userAddress;
        this.phoneNumber = userPhoneNumber;
        this.membership = membership;

        //this.-->is used for addressing to instance members.

    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", membership='" + membership + '\'' +
                '}';
    }
}

