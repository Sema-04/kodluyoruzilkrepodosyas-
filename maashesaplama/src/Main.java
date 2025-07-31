public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal Dursun", 2000.0, 45, 1985);
        System.out.println(employee.toString());
        Employee employee1= new Employee("Ayşe Yılmaz", 950.0, 35, 2018);
        System.out.println(employee1.toString());
        Employee employee2= new Employee("Can Demir", 3500.0, 50, 2010);
        System.out.println(employee2.toString());
    }
}