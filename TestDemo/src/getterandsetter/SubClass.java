package getterandsetter;

public class SubClass {
    public static void main(String [] args){
    SubClass s = new SubClass();
    s.employeeDetails();



}

   public void employeeDetails() {
       BaseClass b = new BaseClass();
       b.setName("Kriti");
       b.setAge(25);
       b.setCountry("India");
       System.out.println(b.getName());
       System.out.println(b.getAge());
       System.out.println(b.getCountry());
       b.setName("Krish");
       b.setAge(23);
       b.setCountry("England");
       System.out.println(b.getName());
       System.out.println(b.getAge());
       System.out.println(b.getCountry());
   }

}
