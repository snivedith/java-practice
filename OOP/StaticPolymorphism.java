class Multiply {
    void mul(int a, int b) {
        System.out.println("Product of two: " + (a * b));
    }
    void mul(int a, int b, int c) {
        System.out.println("Product of three: " + (a * b * c));
    }
}
public class StaticPolymorphism {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        m.mul(6, 10);
        m.mul(10, 6, 5);
    }
}