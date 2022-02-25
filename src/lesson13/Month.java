package lesson13;

public class Month {

    public static void Months (int monthNumber) {
        switch (monthNumber) {
            case 1 -> System.out.println("В январе 31 день");
            case 2 -> System.out.println("В феврале 28 дней");
            case 3 -> System.out.println("В марте 31 день");
            case 4 -> System.out.println("В апреле 30 дней");
            case 5 -> System.out.println("В мае 31 день");
            case 6 -> System.out.println("В июне 30 дней");
            case 7 -> System.out.println("В июле 31 день");
            case 8 -> System.out.println("В августе 31 день");
            case 9 -> System.out.println("В сентябре 30 дней");
            case 10 -> System.out.println("В октябре 31 день");
            case 11 -> System.out.println("В ноябре 30 дней");
            case 12 -> System.out.println("В декабре 31 день");
            default -> System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        Months(2);

    }
}
