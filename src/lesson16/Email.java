package lesson16;

public class Email {

    public static void ThatEmail() {
        String s1 = "ya@yahoo.com; on@mail.ru;  ona@gmail.com;";
        char c1;

        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            if (c1 == ';') {
                System.out.print(c1);
                System.out.println();
                continue;
            }
            System.out.print(c1);
        }

//        if
    }
}



class EmailTest {

    public static void main(String[] args) {
        Email.ThatEmail();
    }
}