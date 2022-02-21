package lesson10.p4;

import lesson10.p1.A;
import lesson10.p1.p2.B;
import lesson10.p1.p2.p3.C;
import static lesson10.p1.p2.B.bbb1;
import static lesson10.p1.p2.B.bbb2;
import lesson10.p4.p5.*;

public class D {

    int ddd1 = 42;
    int ddd2 = 12;

}
    class DTest {

        public static void main(String[] args) {
////          DTest dt1 = new DTest();
//            System.out.println(A.aaa1 +ccc1);
            D d1 = new D();
            System.out.println(d1.ddd1 +d1.ddd2);
            A a1 = new A();
            C c1 = new C();
            System.out.println(c1.ccc1 +a1.aaa1);
            E e1 = new E();
            System.out.println(e1.eee1 * a1.aaa2);
            B b1 = new B();
            System.out.println(e1.eee2 * bbb1 / bbb2);

        }

}
