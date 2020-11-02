package lesson4;

public class HomeWork4 {

    // Часть заданий в классе "Employee"

    public static void main(String[] args) {

        System.out.println("\n Задание 2: \n");

// Задание 2
        Employee employee1 = new Employee("Petrov", "security", 2341243, 30000, 47);
        Employee employee2 = new Employee("Sidorov", "director", 9482384, 50000, 35);
        Employee employee3 = new Employee("Ivanova", "bookkeeper", 5323492, 40000, 29);
        Employee employee4 = new Employee("Shpak", "janitor", 4723923, 25000, 55);
        Employee employee5 = new Employee("Pupkin", "helper", 5932093, 35000, 25);

        employee1.printOut();
        employee2.printOut();
        employee3.printOut();
        employee4.printOut();
        employee5.printOut();

        System.out.println("\n Задание 4: \n");
// Задание 4

        System.out.println(employee1.getName() + "\t" + employee1.getPosition());
        System.out.println(employee2.getName() + "\t" + employee2.getPosition());
        System.out.println(employee3.getName() + "\t" + employee3.getPosition());

        System.out.println("\n Задание 5: \n");
// Задание 5
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Petrov", "security", 2341243, 30000, 47);
        persArray[1] = new Employee("Sidorov", "director", 9482384, 50000, 35);
        persArray[2] = new Employee("Ivanova", "bookkeeper", 5323492, 40000, 29);
        persArray[3] = new Employee("Shpak", "janitor", 4723923, 25000, 55);
        persArray[4] = new Employee("Pupkin", "helper", 5932093, 35000, 25);

        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge()>40) {
                System.out.println("Этот сотрудник старше 40 лет:  "+persArray[i].getName());
            }
        }
        System.out.println("\n Задание 6: \n");
// Задание 6

        for (int i = 0; i < 5; i++) {
            if (persArray[i].age > 45) {
                System.out.println("Этому сотруднику повышена ЗП т.к. он старше 45 лет:  " + persArray[i].getName() + " его ЗП стала " + persArray[i].setSalary());
            }
        }

        System.out.println("\n Задание 7: \n");

// Задание 7

        // Так и не смог разобраться( Пояснения в классе "Employee"

        Employee.UniqueNumber uniqueNumber=new Employee.UniqueNumber();
        for (int i = 0; i < 5; i++) {
                System.out.println("Уникальный номер сотрудника:  "+ persArray[i].Name + "\t"+Employee.UniqueNumber.uniqueNumber );
        }
    }
}