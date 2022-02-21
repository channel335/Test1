package TestTest1;


public class testtest {

    String numberModelTelephone;
    int yearTelephone;
    public String markaTelephona;
    public double priceTelephone;

    public void showInfoTelephone() {
        System.out.println("Модель телефона: " + numberModelTelephone + "Марка телефона: " + markaTelephona);

    }

    testtest(int yearTelephone2) {
        this.yearTelephone = yearTelephone2;
    }

    testtest(String numberModelTelephone2, int yearTelephone2) {
        this.numberModelTelephone = numberModelTelephone2;
        this.yearTelephone = yearTelephone2;
    }

    public testtest(double priceTelephone2) {
        this.priceTelephone = priceTelephone2;
    }

    public testtest(String markaTelephona2){
        this.markaTelephona = markaTelephona2;
    }


}

class testtesttest {

    public static void main(String[] args) {
//        testtest t1 = new testtest();
//        t1.numberModelTelephone = "T600";
//        t1.yearTelephone = 2022;
//        t1.markaTelephona = "Lenovo";
//        t1.priceTelephone = 18000;

        testtest t2 = new testtest(2019);
        System.out.println(t2.yearTelephone);

        testtest t3 = new testtest("LN500", 2015);
        System.out.println(t3.numberModelTelephone);
        System.out.println(t3.yearTelephone);

        testtest t4 = new testtest(18000.5);
        System.out.println(t4.priceTelephone);

        testtest t5 = new testtest("Samsung");
        System.out.println(t5.markaTelephona);

    }
}