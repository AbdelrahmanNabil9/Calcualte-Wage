public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployee;

    public Employee(int baseSalary){
       this(baseSalary,0);
    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }

    public int calculateWage(int extraHours){
        return baseSalary+ getHourlyRate() *extraHours;
    }
    public int calculateWage(){
        return calculateWage();
    }
    private void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("salary");
        this.baseSalary=baseSalary;
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<0)
            throw new IllegalArgumentException("hourly rate can not be 0 or -ve");
        this.hourlyRate = hourlyRate;
    }
}
