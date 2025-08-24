package prototype_ex;

public class Main {
    public static void main(String[] args) {
        StudentPrototype s1 = new StudentPrototype("XYZ", 000, 0.0);
        TeacherPrototype t1 = new TeacherPrototype("XYZ", 00, 10000);

        StudentPrototype s2 = s1.Clone();
        TeacherPrototype t2 = t1.Clone();

        System.out.println("Original Prototype:");
        System.out.println(s1);
        System.out.println(t1);

        // s2.name = "Viraj";
        // s2.s_id = 101;
        // s2.cgpa = 8.3;

        // t2.name = "Man";
        // t2.e_id = 1001;
        // t2.salary = 80000;

        // Using setters instead of direct access
        s2.setName("Viraj");
        s2.setS_id(101);
        s2.setCgpa(8.3);

        t2.setName("Man");
        t2.setE_id(1001);
        t2.setSalary(80000);

        System.out.println("Prototype taken with changed values:");
        System.out.println(s2);
        System.out.println(t2);
        

    }
}
