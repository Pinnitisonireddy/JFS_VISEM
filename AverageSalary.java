
import java.util.ArrayList;
import java.util.Scanner;

public class AverageSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        ArrayList<Integer> salary = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int total = 0;

   
        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary: ");
            int s = sc.nextInt();
            salary.add(s);   
            total += s;      
        }

     
        double average = (double) total / n;

   
        System.out.println("\nEmployee Salaries: " + salary);
        System.out.println("Average Salary: " + average);
    }
}


