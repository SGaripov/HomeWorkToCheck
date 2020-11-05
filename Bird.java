package lesson5.HomeWork5;


public class Bird extends Animal {

    public Bird(int run, int swim, double jump) {
        super(5, 0, 0.2);
    }

    void customRun(int j) {
        if (j > run) {
            System.out.println("Птица может пробегать не более " + run);
        } else System.out.println("Птица бежит  " + j);
    }

    void customSwim(int j) {
        if (j > 0) {
            System.out.println("Птица не умеет плавать :(");
        }
    }

    void customJump(double j) {
        if (j > jump) {
            System.out.println("Птица может прыгать не более " + jump);
        } else System.out.println("Птица прыгает  " + j);
    }
}

