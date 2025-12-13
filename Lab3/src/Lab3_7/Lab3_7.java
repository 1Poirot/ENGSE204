package Lab3_7;
import java.util.Scanner;

public class Lab3_7 {
    private String employeeId;
    private String department;

    public Lab3_7(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }
    
    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter ID: ");
        String id = input.nextLine();
        
        System.out.print("Enter the department : ");
        String dept = input.nextLine();
        
        System.out.print("Enter the new department : ");
        String newdept = input.nextLine();

        Lab3_7 emp = new Lab3_7(id, dept);
        emp.setDepartment(newdept);

        System.out.println("ID:"+emp.getEmployeeId());
        System.out.println("new department:"+emp.getDepartment());
    }
}
