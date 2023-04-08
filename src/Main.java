public class Main {
    public static void main(String[] args) {
        var employee = new Employee(1000);
        var wage = employee.calculateWage();
        System.out.println(wage);
    }
}