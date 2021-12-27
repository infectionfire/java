package Clone;

public class SafeClone {
    private static void preparation(Student student) {
        try {
            student = (Student) student.clone(); // cloning
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        student.setId(1000);
        System.out.println("->id = " + student.getId());
    }
    public static void main(String[] args) {
        Student ob = new Student();
        ob.setId(71);
        System.out.println("id = " + ob.getId());
        preparation(ob);
        System.out.println("id = " + ob.getId());
    }
}
