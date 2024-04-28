package getterandsetter;

public class Q3_Employee {
    /*
    3. Write a Java program to create a class called Employee with private instance variables
employee_id, employee_name, and employee_salary. Provide public getter and setter
methods to access and modify the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.
     */

    private int employee_id;
    private String employee_name;
    private int employee_salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }


    public static void main(String[] args) {
        Q3_Employee e = new Q3_Employee();
        e.setEmployee_id(235678);
        e.setEmployee_name("Josh");
        System.out.println(e.getEmployee_id());
        System.out.println(e.getEmployee_name());

        String text = (String.valueOf(2000));
        System.out.println(text);


    }




}
