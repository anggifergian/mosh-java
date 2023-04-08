public class Main {
    public static void main(String[] args) {
        var employee = new Employee(1000, 100);
        var wage = employee.calculateWage(3);
        System.out.println(wage);
    }
}