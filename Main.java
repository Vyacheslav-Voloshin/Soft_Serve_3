package Java_kurs.HomeWork3;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lynx[] lynx = {
                new Lynx("Barsik", 15),
                new Lynx("Tuzik", 15),
                new Lynx("Myrchik", 2)};
        System.out.println("Базовий масив тварин");
        for (Lynx aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();
        // створення обєкту методом клонування
        Lynx[] lynxClone = lynx.clone();
        System.out.println("Клоновий массив");
        for (Lynx aaa : lynxClone) {
            System.out.println(aaa);
        }
        System.out.println();
        // сортування масиву по імені тварини
        Arrays.sort(lynx);
        System.out.println("сортування масиву по імені тварини");
        for (Lynx aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();
        // сортування масиву по віку тварини
        Arrays.sort(lynx, new LynxAgeComparator());
        System.out.println("сортування масиву по віку тварини");
        for (Lynx aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();
        // Реалізація поліморфізму інтерфейсів
        System.out.println("Реалізація поліморфізму інтерфейсів");
        for (Lynx aaa:lynxClone) {
            aaa.eat();
            aaa.run();
        }
        System.out.println("Кількість створенних обєктів типу Lynx -"+ Lynx.getCount());
    }
}


