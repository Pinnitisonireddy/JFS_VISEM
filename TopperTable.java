import java.util.Scanner;

public class TopperTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 10;
        int subjects = 3;

        int[][] marks = new int[students][subjects];
        int[] total = new int[students];

        
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
                total[i] = total[i] + marks[i][j];
            }
        }

       
        System.out.println("\n---------------------------------------------");
        System.out.println("Student\tSub1\tSub2\tSub3\tTotal");
        System.out.println("---------------------------------------------");

        // Print table rows
        for (int i = 0; i < students; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                total[i]
            );
        }

        System.out.println("---------------------------------------------");


        int topper = 0;
        for (int i = 1; i < students; i++) {
            if (total[i] > total[topper]) {
                topper = i;
            }
        }

        
        System.out.println("\nTopper : Student " + (topper + 1));
        System.out.println("Highest Total Marks : " + total[topper]);

        sc.close();
    }
}
