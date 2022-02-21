package lesson8;
public class FinalStatic2 {

    static final double pi = 3.14;
    int r;

    public static double PloshadKruga (double pi, int r)
    {   double result = pi*r*r;
        return result; }

    public static double DlinaOkruzhnosti (double pi, int r)
    {   double result = 2 *pi*r;
        return result; }

    public static void ShowInfo (int r)
    {   System.out.println("Длина радиуса составляет: " + r);
        System.out.println("Площадь круга составляет: " + PloshadKruga(FinalStatic2.pi, r));
        System.out.println("Длина окружности составляет: " + FinalStatic2.DlinaOkruzhnosti(FinalStatic2.pi, r));}
}

class FinalStatic2Test {
    public static void main(String[] args) {
    FinalStatic2 FinSt = new FinalStatic2();
    FinSt.r = 11;
    lesson8.FinalStatic2.ShowInfo(FinSt.r);
    //System.out.println("Площадь круга составляет: " + FinSt.PloshadKruga(FinalStatic2.pi, FinSt.r));
    //System.out.println("Длина окружности составляет: " + FinalStatic2.DlinaOkruzhnosti(FinalStatic2.pi, FinSt.r));
    }
}