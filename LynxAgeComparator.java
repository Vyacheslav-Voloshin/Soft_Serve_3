package Java_kurs.HomeWork3;

import java.util.Comparator;

public class LynxAgeComparator implements Comparator<Lynx> {

    @Override
    public int compare (Lynx l1, Lynx l2){
        if (l1.getAge()!= l2.getAge())
            return Integer.compare(l1.getAge(), l2.getAge());
        else return l1.getName().compareTo(l2.getName());
    }
}
