package lesson5.HomeWork5;


public class Horse extends Animal {

    public Horse(int run, int swim, double jump) {
        super(1500, 100, 3);
    }

    void customRun(int j) {
        if (j > run) {
            System.out.println("Лошадь может пробегать не более " + run);
        } else System.out.println("Лошадь бежит  " + j);
    }

    void customSwim(int j) {
        if (j > swim) {
            System.out.println("Лошадь может плыть не более " + swim);
        } else System.out.println("Лошадь плывет  " + j);
    }

    void customJump(double j) {
        if (j > jump) {
            System.out.println("Лошадь может прыгать не более " + jump);
        } else System.out.println("Лошадь прыгает  " + j);
    }
}

