package lesson12;

public class Students {

    String name;
    int course;
    double grade;

    Students (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Students st1, Students st2) {
        Students st3 = st1;
        st1 = st2;
        st2 = st3;}

    public static void main(String[] args) {
        Students st1 = new Students("Petr", 1, 9.5);
        Students st2 = new Students("Petr", 1, 9.5);
//        swap(st1, st2);
//        System.out.println(st1.name);
//        System.out.println(st2.name);

       StudentTest.Sravnenie1(st1, st2);
       StudentTest.SravnenieVse(st1,st2);
        }
    }

class StudentTest {

    static void Sravnenie1 (Students st1, Students st2) {
        if (st1.name.equals(st2.name) == true && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты различаются");
        }
    }

    static void SravnenieVse(Students st1, Students st2) {

        if (st1.name.equals(st2.name) == true && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Имена студентов, их курсов (факультетов) и их оценки полностью совпадают");
        } if (st1.course != st2.course) {
            System.out.println("Курсы студентов отличаются! Курс 1-го студента: " + st1.course + " , а курс 2-го студента: " + st2.course);
        } if (st1.grade != st2.grade) {
            System.out.println("Оценки студентов отличаются! Оценка 1-го студента: " + st1.grade + " , а оценка 2-го студента: " + st2.grade);
        } if (st1.name.equals(st2.name) != true) {
            System.out.println("Имена студентов отличаются! Имя 1-го студента: " + st1.name + " , а имя 2-го студента: " + st2.name);
        }

    }
}
