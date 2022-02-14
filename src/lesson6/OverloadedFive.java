package lesson6;

public class OverloadedFive {

    int summa () {
        int result = 0;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int summa (int a) {
        int result1 = a;
        System.out.println("Сумма всех чисел: " + result1);
        return result1;
    }

    int summa (int b, int c) {
        int result2 = b +c;
        System.out.println("Сумма всех чисел: " + result2);
        return result2;
    }

    int summa (int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Сумма всех чисел: " + result3);
        return result3;
    }

    int summa (int g, int h, int i, int j) {
        int result4 = g + h + i +j;
        System.out.println("Сумма всех чисел: " + result4);
        return result4;
    }
}

class OverloadedFiveTest {

    public static void main(String[] args) {
        OverloadedFive OF5 = new OverloadedFive();
        System.out.println(OF5.summa(1, 2, 99));
    }

}