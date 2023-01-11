public class Main {
    public static void main(String[] args) {
       new Employee(10_000,10);
       var employee= new  Employee(50_000,20);
        System.out.println(Employee.numberOfEmployee);
      int wage= employee.calculateWage(10);
        System.out.println(wage);
    }

}