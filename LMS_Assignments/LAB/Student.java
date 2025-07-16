public class Student {
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {

        Student s = new Student("Abhinav", 20, "Computer Engineering");

        System.out.println("Initial Student Details:");
        System.out.println("Name      : " + s.getName());
        System.out.println("Age       : " + s.getAge());
        System.out.println("Department: " + s.getDepartment());

        s.setName("Sharad");
        s.setAge(21);
        s.setDepartment("Information Technology");

        System.out.println("\nUpdated Student Details:");
        System.out.println("Name      : " + s.getName());
        System.out.println("Age       : " + s.getAge());
        System.out.println("Department: " + s.getDepartment());
    }
}
