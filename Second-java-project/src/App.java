import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Employee employee = new Employee(1, "Ahmad", "Fursa tech trainee", 3000);
        Employee employee2 = new Employee(2, "Osama", "PMO", 5000);
        List<Payment> paymentHistory = employee.getPaymentHistory();
        for (Payment payment : paymentHistory) {
            System.out.println(payment);
        }

        // employee

        employee.setOvertimeHours(10);
        employee.setBonus(0.15);
        employee.setDeductions(30);
        employee.addPayment(200, "gift");
        // Second employee (employee2)
        employee2.setOvertimeHours(10);
        employee2.setBonus(0.15);
        employee2.setDeductions(30);
        employee2.addPayment(300, "hadya");

        System.out.println(employee);
        System.out.println("Total Salary: $" + employee.calculateTotalSalary());
        System.out.println(employee.getPaymentHistory());
        System.out.println("--------------------------------------------------------");
        System.out.println(employee2);
        System.out.println("Total Salary: $" + employee2.calculateTotalSalary());
        System.out.println(employee2.getPaymentHistory());

    }
}
