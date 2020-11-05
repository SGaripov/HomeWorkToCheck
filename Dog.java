package lesson5.HomeWork5;


public class Dog extends Animal {

    public Dog(int run, int swim, double jump) {
        super(500, 10, 0.5);
    }

    void customRun(int j) {
        if (j > run) {
            System.out.println("Собака может пробегать не более " + run);
        } else System.out.println("Собака бежит  " + j);
    }

    void customSwim(int j) {
        if (j > swim) {
            System.out.println("Собака может плыть не более " + swim);
        } else System.out.println("Собака плывет  " + j);
    }

    void customJump(double j) {
        if (j > jump) {
            System.out.println("Собака может прыгать не более " + jump);
        } else System.out.println("Собака прыгает  " + j);
    }
}

