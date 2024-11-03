
public class Datatype {

    public static class Student {
        String name;
        int rollno;
        double percent;
    }

    public static void student(Student s) {
        System.out.println(s.name+" "+s.rollno +" "+ s.percent);
    }

    public static void main(String args[]) {

        // It is also valid but the scope of this class will be limited inside this main function
        // public static class Student {
        //     String name;
        //     int rollno;
        //     double percent;
        // }


        Student x = new Student();  // Declaration
        x.name = "Chhatish"; // Initialization
        x.rollno = 24;
        x.percent = 80;

        // Classes are passes by references
        student(x);

        // It can be updated
        // x.name = "Radhe";
        // System.out.println(x.name) // output - Radhe


        // System.out.println(x); //output - Datatype$Student@4c9f8c13


        // System.out.println(x.name);
        // System.out.println(x.rollno);
        // System.out.println(x.percent);
    }
}