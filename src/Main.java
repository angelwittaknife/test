//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tester.printHello();
        Tester t = new Tester();
        System.out.println(t.calculateSalary());
        System.out.println(t.calculateSalary(200));
        System.out.println(t.calculateSalary(150,3));
    }
}