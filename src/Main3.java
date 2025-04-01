import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please write numbers for summing (zero for leave");
        int number;
        while((number = scanner.nextInt()) !=0 ) {
            sum += number;
            System.out.println("Sum for this moment:" + sum);}
        System.out.println("Final sum:" + sum );
        scanner.close();

        }

    }

