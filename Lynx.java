package Java_kurs.HomeWork3;

public class Lynx implements Runnable,Eating,Comparable<Lynx> {
 private static int count = 0;
    private String name;
    private int age;

    public Lynx(String name){
        this.name = name;
    }

    public Lynx(String name, int age) {
        this.name = name;
        this.age = age;
        new Counter().setCount();
    }

    public static int getCount() {
        return count;
    }

    public  String getName() {
        return name;
    }
    public void setName(String value){
        name = value;
    }

    public int getAge(){ return age; }
    public void setAge(int number) {age = number;}

   public String toString(){
        return "Lynx name: "+getName()+", age:" + getAge();
   }
   public void eat(){
       System.out.println("Lynx "+ getName()+" wants eating");
   }
    public void run(){
        System.out.println("Lynx "+ getName()+" starts running");
    }
   @Override
   public int compareTo (Lynx lynx){
        if (this.getName().compareTo(lynx.getName())!=0)
            return this.getName().compareTo(lynx.getName());
        else return Integer.compare(this.age, lynx.age);
   }
   private static class Counter{
        public void setCount(){
            count ++;
        }
   }
}
