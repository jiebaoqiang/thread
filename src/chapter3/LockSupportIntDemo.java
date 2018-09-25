package chapter3;

import java.util.*;
import java.util.concurrent.locks.LockSupport;

/**
 * Created by 13 on 2017/5/5.
 */
public class LockSupportIntDemo {
    public static Object u = new Object();
    static ChangeObjectThread t1 = new ChangeObjectThread("t1");
    static ChangeObjectThread t2 = new ChangeObjectThread("t2");

    public static class ChangeObjectThread extends Thread {
        public ChangeObjectThread(String name) {
            super.setName(name);
        }

        public void run() {
            synchronized (u) {
                System.out.println("in " + getName());
                LockSupport.park();
                if (Thread.interrupted()) {
                }
                System.out.println(getName() + "被中断");
            }
            System.out.println(getName() + "继续执行");
        }
    }


    public static void main(String args[]) throws InterruptedException {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        int total = 2;
        for (int i = 0; i<list.size()/total;i++){
           List a =  list.subList(i*total,total*(i+1));
            System.out.println(a);
        }

    }

}
