package getterandsetter;

public class Q4_Car {
    /*
    4. Write a Java program to create a class called Car with private instance variables
company_name, model_name, year, and mileage. Provide public getter and setter
methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.
     */

    private String company_name;
    private String model_name;
    private int year;
    private int mileage;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public static void main(String[] args) {
        Q4_Car c = new Q4_Car();
        c.setCompany_name("K_Company");
        c.setModel_name("BMW");
        c.setYear(2020);
        System.out.println(c.getCompany_name());
        System.out.println(c.getModel_name());
        System.out.println(c.getYear());
        System.out.println(c.getMileage());
    }

}
