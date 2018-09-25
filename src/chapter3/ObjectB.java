package chapter3;

/**
 * 2018/6/7.
 */
public class ObjectB extends ObjectA{

    {
        System.out.print("J");
    }

    static {
        System.out.print("K");
    }

    public ObjectB(){
        System.out.print("E");
    }

    public static void ObjectB(){
        System.out.print("D");
    }

    public void print(){
        System.out.print("F");
    }

    public void print(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ObjectA objectA = new ObjectB();
        objectA.print();
        objectA.print("A");
    }
}
