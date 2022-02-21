package TestTest1;

class testtest2Test {

    public static void main(String[] args) {

        testtest2 tom = new testtest2();
        testtest2 bob = new testtest2();
        tom.displayId();    // Id = 105
        bob.displayId();    // Id = 106
    }
}

public class testtest2{

    private int id;
    static int counter;

    static{
        counter = 105;
        System.out.println("Static initializer");}

    testtest2(){
        id=counter++;
        System.out.println("Constructor");}

    public void displayId(){
        System.out.printf("Id: %d \n", id);}
}