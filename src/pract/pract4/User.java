package pract.pract4;

import java.util.Objects;
import java.util.UUID;

//
//Создать класс User с полями firstName lastName.
//
//Добавить getters/setters
//
//Реализовать методы equals & hashCode
//
//Создавать два экземпляра User, оба с именем John Smith
//
//Добавить оба экземпляра в HashSet (без перезаписи)
public class User {
    private String firstName;
    private String lastName;
    private UUID userId;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId=UUID.randomUUID();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userId=" + userId +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }


}
