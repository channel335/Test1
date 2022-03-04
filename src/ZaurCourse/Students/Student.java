package ZaurCourse.Students;

public class Student {

    int StudentID;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;


    Student(int StudentID2, String name2, String surname2, int course2, double mathAverageGrade2, double economicsAverageGrade2, double foreignLanguageAverageGrade2) {
        StudentID = StudentID2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicsAverageGrade = economicsAverageGrade2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }

    Student(int StudentID3, String name3, String surname3, int course3) {
        this(StudentID3, name3, surname3, course3, 0, 0, 0);
    }

    public Student() {
        }
}

class StudentTest {

        double SredArifm(Student st) {
            double SredOtsenka = (st.mathAverageGrade + st.economicsAverageGrade+ st.foreignLanguageAverageGrade) / 3;
            System.out.println("Cредняя арифмитическая оценка студента: " + st.name + " " + st.surname + " " + "=" + " " + SredOtsenka);
            return SredOtsenka;
        }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.StudentID = 1;
        st1.name = "Николай";
        st1.surname = "Иванов";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade = 9.2;
        st1.foreignLanguageAverageGrade = 8.8;

        Student st2 = new Student();
        st2.StudentID = 2;
        st2.name = "Алексей";
        st2.surname = "Петров";
        st2.course = 1;
        st2.mathAverageGrade = 6.3;
        st2.economicsAverageGrade = 9;
        st2.foreignLanguageAverageGrade = 8.1;

//        Student st3 = new Student();
//        st3.StudentID = 2;
//        st3.name = "Антон";
//        st3.surname = "Сидоров";
//        st3.course = 4;
//        st3.mathAverageGrade = 9.1;
//        st3.economicsAverageGrade = 9;
//        st3.foreignLanguageAverageGrade = 9.8;

        Student st3 = new Student(2, "Антон", "Сидоров",4, 9.1, 9, 9.8);

//        System.out.println("Cредняя арифмитическая оценка студента " + st1.name + " " + st1.surname + "=" +
//                (st1.mathAverageGrade + st1.economicsAverageGrade+ st1.foreignLanguageAverageGrade)/3);
//        System.out.println("Cредняя арифмитическая оценка студента " + st2.name + " " + st2.surname + "=" +
//                (st2.mathAverageGrade + st2.economicsAverageGrade+ st2.foreignLanguageAverageGrade)/3);
//        System.out.println("Cредняя арифмитическая оценка студента " + st3.name + " " + st3.surname + "=" +
//                (st3.mathAverageGrade + st3.economicsAverageGrade+ st3.foreignLanguageAverageGrade)/3);

        Student st4 = new Student(3, "Oleg", "Olegov", 5);
        System.out.println(st4.name);
        System.out.println(st4.surname);


        StudentTest sTest = new StudentTest();
        sTest.SredArifm(st1);
        sTest.SredArifm(st2);
        sTest.SredArifm(st3);


//        TestTest1.testtest ttt1 = new TestTest1.testtest("RealMe");
//        System.out.println(ttt1.markaTelephona);
//
//        TestTest1.testtest ttt2 = new TestTest1.testtest(888.8);
//        System.out.println(ttt2.priceTelephone);
    }
}


