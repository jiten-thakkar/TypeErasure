package main2;

import typerasure.MyTest;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            // create class object
            Class classobj = MyTest.class;

            // get list of methods
            Method[] methods = classobj.getMethods();

            // get the name of every method present in the list
            for (Method method : methods) {

                String methodName = method.getName();
                if (methodName.equals("setA")) {
                    System.out.println("Class " + classobj.getName() +" Contains"
                            + " Method whose name is "
                            + methodName);
                    System.out.println("This method has parameters whose types are:");
                    for(Class c : method.getParameterTypes()) {
                        System.out.println(c.getName());
                    }
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
