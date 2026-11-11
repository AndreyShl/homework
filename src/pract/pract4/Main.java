package pract.pract4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jonn", "Smith");
        User user2 = new User("Jonn", "Smith");
        Set<User> userSet = new HashSet<>();
        System.out.println(userSet);
        userSet.add(user1);
        userSet.add(user2);
        System.out.println(userSet);


    }
}
