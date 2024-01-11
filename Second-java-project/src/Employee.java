import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int employeeId;
    private String name;
    private String position;
    private double basicSalary;
    private double overtimeHours;
    private double bonus;
    private double deductions;
    private List<Payment> paymentHistory;

    public Employee(int employeeId, String name, String position, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.paymentHistory = new ArrayList<>();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateTotalSalary() {
        double totalSalary = basicSalary + calculateOvertimePay() + bonus - deductions;
        return totalSalary;
    }

    public double getOvertimeHours() {
        return overtimeHours;

    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    private double calculateOvertimePay() {
        double overtimeRate = 1.5;
        return overtimeHours * (basicSalary / 1000) * overtimeRate;

    }

    public void addPayment(double amount, String paymentMethod) {
        Payment payment = new Payment(amount, paymentMethod);
        paymentHistory.add(payment);
    }

    public List<Payment> getPaymentHistory() {
        return paymentHistory;
    }

    @Override
    public String toString() {
        return "Employee:\nEmployee ID = " + employeeId + "\nname = " + name + "\nposition = "
                + position
                + "\nbasicSalary = "
                + basicSalary + "\novertimeHours = " + overtimeHours + "\nbonus = " + bonus + "\ndeductios = "
                + deductions;
    }
}
