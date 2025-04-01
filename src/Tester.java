import javax.lang.model.element.Name;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;


    public Tester()
    {
        this("Alex","Alexovich");
    }

    public Tester(String name,String surname)
    {
        this(name,surname,3,"A1",1500);
    }


    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public double calculateSalary()
    {
        return salary;
    }
    public double calculateSalary(double p)
    {
        return salary * p/100;
    }
    public double calculateSalary(double p, int m)
    {
        return salary * p /100 * m;
    }

    public static void printHello()
    {
        System.out.println("Hello Tester!");
    }


}
