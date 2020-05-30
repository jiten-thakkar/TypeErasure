package typerasure;

public class Test<T> {
    private T a;
    public Test(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}