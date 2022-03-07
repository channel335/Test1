package TestTest1;

public class TestTest1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = sb1;

        System.out.println(sb1.equals(sb2));


    }
}