import java.util.Scanner;
public class MaxMin{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 1st three digit number");
                int a = sc.nextInt();
                System.out.println("Enter 2nd three digit number");
                int b = sc.nextInt();
                System.out.println("Enter 3rd three digit number");
                int c = sc.nextInt();
                System.out.println("Enter 4th three digit number");
                int d = sc.nextInt();
                System.out.println("Enter 5th three digit number");
                int e = sc.nextInt();
		System.out.println("Maximun number is "+max);
                int max = Math.max(Math.max(Math.max(a,b), Math.max(c,d)),e);
		System.out.println("Minimum number is "+ min);
		int min = Math.min(Math.min(Math.min(a,b), Math.min(c,d)),e);
	}
}











