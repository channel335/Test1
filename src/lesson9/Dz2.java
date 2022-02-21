package lesson9;

public class Dz2 {
    int a=1;
    static int b=2;
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Dz2.b);
    }

    public static void main(String[] args) {
    Dz2 dz2 = new Dz2();
    dz2.abc(4);
    }
}

