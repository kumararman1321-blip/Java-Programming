import java.util.*;

class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, num;
        int even = 0, odd = 0;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even numbers = " + even);
        System.out.println("Number of odd numbers = " + odd);
        sc.close(); 
    }
}