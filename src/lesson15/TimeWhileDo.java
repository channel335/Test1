package lesson15;

public class TimeWhileDo {

    static void TimeMethod2 () {
        int chas = 0;
        int minute = 0;
        int second = 0;

        OUTER:
        while (chas < 6) {
            MIDDLE:
                do
                {
                    System.out.println(chas + ":" + minute + ":" + second);
                }
                while(chas>1 && minute%10==0 && second*chas>minute);
                chas++;
                        }

        }
    }


//    public static void main(String[] args) {
//        TimeMethod2();
//    }
//
//}


