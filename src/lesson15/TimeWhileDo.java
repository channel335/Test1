package lesson15;

public class TimeWhileDo {

    static void TimeMethod2() {
        int chas = 0;
        OUTER:
        while (chas < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;

                if (chas > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * chas > minute) {
                        continue MIDDLE;
                    }

                    System.out.println(chas + ":" + minute + ":" + second);
                    second++;
                }
            } while (minute < 59);
            chas++;
        }
    }

    public static void main(String[] args) {
        TimeWhileDo.TimeMethod2();
    }
}


