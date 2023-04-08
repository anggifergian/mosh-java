public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(1000);
        employee.setHourlyRate(100);
        var wage = employee.calculateWage(3);
        System.out.println(wage);
    }


}