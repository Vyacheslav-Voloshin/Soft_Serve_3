package Java_kurs.HomeWork3;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lynx[] lynx = {
                new Lynx("Barsik", 15),
                new Lynx("Tuzik", 15),
                new Lynx("Myrchik", 2)};
        System.out.println("������� ����� ������");
        for (Lynx aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();
        // ��������� ����� ������� ����������
        Lynx[] lynxClone = lynx.clone();
        System.out.println("�������� ������");
        for (Lynx aaa : lynxClone) {
            System.out.println(aaa);
        }
        System.out.println();
        // ���������� ������ �� ���� �������
        Arrays.sort(lynx);
        System.out.println("���������� ������ �� ���� �������");
        for (Lynx aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();
        // ���������� ������ �� ��� �������
        Arrays.sort(lynx, new LynxAgeComparator());
        System.out.println("���������� ������ �� ��� �������");
        for (Lynx aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();
        // ��������� ����������� ����������
        System.out.println("��������� ����������� ����������");
        for (Lynx aaa:lynxClone) {
            aaa.eat();
            aaa.run();
        }
        System.out.println("ʳ������ ���������� ����� ���� Lynx -"+ Lynx.getCount());
    }
}


