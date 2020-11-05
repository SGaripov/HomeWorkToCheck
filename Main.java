package lesson5.HomeWork5;


public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(200, 0, 2);
        Dog dog = new Dog(500, 10, 0.5);
        Horse horse = new Horse(1500, 100, 3);
        Bird bird = new Bird(5, 0, 0.2);

        // Вывод На консоль

        bird.customJump(0.1);
        horse.customSwim(20);
        bird.customSwim(3);
        bird.customJump(0.1);
        cat.customJump(100);
        cat.customSwim(2);

        Animal[] zoo = {cat, dog, horse, bird};

    }


}


