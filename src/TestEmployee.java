public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(145685, "Satenik", "Javabootcamp", 30, 'f');
        Employee employee1 = new Employee("javabootcamp", 'f');
        Employee employee2 = new Employee("javabootcamp", 'f');
        Employee employee3 = new Employee(null, 'm');
        Employee employee4 = new Employee("javabootcamp", 'm');
        Employee employee5 = new Employee(null, 'm');
        System.out.println("ID:" + employee.id + " " + "Name:" + employee.name + " " +
                "Department:" + employee.department + " " + "Age:" + employee.age + " " + "Gender:" + employee.gender);
        ;
        System.out.println("Department" + employee1.department + " " + "Gender" + employee1.gender);
        System.out.println("Department" + employee2.department + " " + "Gender" + employee2.gender);
        System.out.println("Department" + employee3.department + " " + "Gender" + employee3.gender);
        System.out.println("Department" + employee4.department + " " + "Gender" + employee4.gender);
        System.out.println("Department" + employee5.department + " " + "Gender" + employee5.gender);
    }
}
