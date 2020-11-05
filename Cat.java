package lesson5.HomeWork5;


public class Cat extends Animal {

    public Cat(int run, int swim, double jump) {
        super(200, 0, 2);
    }

    // Задание 2

    void customRun(int j) {
        if (j > run) {
            System.out.println("Кот может пробегать не более " + run);
        } else System.out.println("Кот бежит  " + j);
    }

    void customSwim(int j) {
        if (j > 0) {
            System.out.println("Кот не умеет плавать :(");
        }
    }

    void customJump(double j) {
        if (j > jump) {
            System.out.println("Кот может прыгать не более " + jump);
        } else System.out.println("Кот прыгает  " + j);
    }
}

