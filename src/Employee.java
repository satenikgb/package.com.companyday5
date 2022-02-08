public class Employee {
    long id;
    String name;
    String department;
    int age;
    char gender;

    public Employee(long id, String name, String department, int age, char gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;

    }

    public Employee(String department, char gender) {
        this.gender = gender;
        this.department = department;
    }

}
