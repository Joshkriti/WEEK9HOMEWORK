package getterandsetter;

public class Q1_SubClass {
    public static void main(String [] args){
    Q1_SubClass s = new Q1_SubClass();
    s.employeeDetails();



}

   public void employeeDetails() {
       Q1_BaseClass b = new Q1_BaseClass();
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
