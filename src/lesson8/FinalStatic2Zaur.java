package lesson8;

public class FinalStatic2Zaur {

    public static final double pi = 3.14;

    public double PloshadKruga (double r) {
        double result = pi*r*r;
        return result;
    }

    public static double DlinaOkruzhnosti (double r) {
        double result = 2*pi*r;
        return result;
    }

    public void ShowInfo (double r)
    {   System.out.println("Длина радиуса составляет: " + r);
        System.out.println("Площадь круга составляет: " + PloshadKruga(r));
        System.out.println("Длина окружности составляет: " + DlinaOkruzhnosti(r));}
}

class FinalStatic2ZaurTest {
    public static void main(String[] args) {
        FinalStatic2Zaur FinSt = new FinalStatic2Zaur();
        FinSt.DlinaOkruzhnosti(5.3);
        FinalStatic2Zaur.DlinaOkruzhnosti(11);
        FinSt.ShowInfo(11);

    }
}
