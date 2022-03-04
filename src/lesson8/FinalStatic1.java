package lesson8;

class FinalStatic1 {

    int a;
    int b;
    int c;

   public static int Multiply (int a, int b, int c) {
       return a * b * c;

   }

    public static void Division (int a, int b) {
        System.out.println("Целый остаток от деления равен: " + a/b);
        System.out.println("Остаток от деления равен: " + a % b);
    }

}

class FinalStatic1Test {
    public static void main(String[] args) {
    FinalStatic1.Division(14,3);
    FinalStatic1.Division(25,3);
    System.out.print("Результат умножения трех чисел равен: ");
    System.out.println(FinalStatic1.Multiply(4,6,8));
    System.out.print("Результат умножения трех чисел равен: ");
    System.out.println(FinalStatic1.Multiply(2,6,7));
    }
}