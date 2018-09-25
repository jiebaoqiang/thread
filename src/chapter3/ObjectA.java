package chapter3;

/**
 * 2018/6/7.
 */
public class ObjectA {

    {
        System.out.print("H");
    }

    static {
        System.out.print("I");
    }


    public ObjectA(){
        System.out.println("B");
    }
    public static void printA(){
        System.out.println("A");
    }
    public  void print(){
        System.out.println("C");
    }

    public void print(String a){
        System.out.println(a);
    }
}
