package pract.pract17;

import java.util.List;

public class pract5 {
    public static void main(String[] args) {

        Employee pers1 = new Employee("Jake", 22);
        Employee pers2 = new Employee("Mike", 32);
        Employee pers3 = new Employee("Alice", 19);
        List<Employee> employeeList = List.of(pers1, pers2, pers3);
        employeeList.forEach(System.out::println);
    }
}
