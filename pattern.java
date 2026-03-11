/*import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) + " ");
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((i + j) + " ");
            }

            System.out.println();
        }
    }
}
//output
Enter n: 5
1
2 3 2
3 4 5 4 3
4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5*/




/*import java.util.Scanner;

public class Pattern {
    public static void main(String args[]) {

        int n = 5;
        int i, j, ctr;
        int left, right;

        for (i = 1; i <= n; i++) {

            ctr = i;
            int arr[] = new int[2 * i - 1];

            left = 0;
            right = arr.length - 1;

            while (left < right) {
                arr[left] = ctr;
                arr[right] = ctr;
                ctr++;
                left++;
                right--;
            }

            arr[left] = ctr;
            for(j=0; j<n-i; j++){
System.out.print("  ");
}
            for (j = 0; j < arr.length; j++) {
                System.out.print( arr[j] +" ");
            }

            System.out.println();
        }
    }
}*/


public class Pattern {
    public static void main(String args[]) {

        int n = 7;

        for (int i = 0; i < n; i++) {

            int num = 1;
	 for (int j = 0; j <n- i; j++) {
                System.out.printf("   ");
	}
           
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d %3c",num,' ');
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

// dynamic approach 
pascal triangle