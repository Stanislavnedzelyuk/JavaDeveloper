package homework;

public class honework1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void task2 () {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog*4;
        cat = cat*4;
        paper = paper*4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = (int) (dog-3.5);
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}