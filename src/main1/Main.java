package main1;

import typerasure.MyTest;
import typerasure.Test;

public class Main {

    public static void main(String[] args) {
        Test t = new MyTest(10);
        int a = (Integer) t.getA() + 10;
        System.out.println(a);
    }
}
