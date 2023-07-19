package poly_2;

public class C extends A {
    public String m1() {
        return "m1 in C";
    }

    public String m2(A a) {
        return "m2 in C " + a.m1();
    }
}
