package lesson8;

public class FinalStatic1Zaur {

    static double Multiply (double a, double b, double c) {
        return a * b * c;
    }

    static void Division (int a, int b) {
        System.out.println("Целый остаток от деления равен: " + a/b);
        System.out.println("Остаток от деления равен: " + a % b);
    }

}

class FinalStatic1ZaurTest {
    public static void main(String[] args) {
        FinalStatic1.Division(15,4);
        FinalStatic1.Division(9,2);
        System.out.print("Результат умножения трех чисел равен: ");
        System.out.println(FinalStatic1Zaur.Multiply(2,3,4));
        System.out.print("Результат умножения трех чисел равен: ");
        System.out.println(FinalStatic1Zaur.Multiply(2.5,3.5,4));
    }
}
