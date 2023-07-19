package poly_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(new A().m2());
        System.out.println(new B().m2());
        System.out.println(new C().m2());
        System.out.println(new C().m2(new B()));
    }
}
