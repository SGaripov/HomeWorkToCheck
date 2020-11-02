package lesson4;

import java.util.Random;

// Задание 1

public class Employee {
    String Name;
    String Position;
    int phoneNumber;
    int salary;
    int age;

    void printOut() {
        System.out.println("Name:  "+Name + "  Position:  "+Position+ "  Phone number:  "+phoneNumber+ "  Salary:  "+ salary+"  Age:  "+age +"\n");
    }

// Задание 2 (конструктор)

    Employee(String Name, String Position, int phoneNumber, int salary, int age) {
        this.Name = Name;
        this.Position = Position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
// Здание 3

 public String getName() {
        return Name;
 }
 public String getPosition() {
        return Position;
 }
 int getPhoneNumber () {
        return phoneNumber;
 }
 int getSalary () {
        return salary;
 }
 public int getAge() {
        return age;
    }

// Задание 6

    int setSalary () {
        return getSalary()+5000;

    }

    // Задание 7
    // Random без static не работает, а при static выдает только одинаковое число. Так и не понял как делать.

    static class UniqueNumber {
        static Random random = new Random();
        static int uniqueNumber = random.nextInt(100);

    }
}