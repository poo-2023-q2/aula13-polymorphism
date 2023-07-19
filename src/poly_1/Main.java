package poly_1;
public class Main {
    public static void printValue(A x) {
        System.out.println(x.m1());
    }
    public static void main(String[] args) {
        printValue(new A());
        printValue(new B());
        printValue(new C());
    }
}