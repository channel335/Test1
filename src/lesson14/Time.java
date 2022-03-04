package lesson14;

public class Time {

    static void TimeMethod () {

        OUTER:
        for (int chas=0; chas<6; chas++) {
            MIDDLE:
            for (int minute=0; minute <60; minute++) {
                if (chas>1 && minute%10==0) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second <60; second++) {
                    if (second*chas>minute) {
                        continue MIDDLE;
                    }

                    System.out.println(chas + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
    TimeMethod();
    }

}



