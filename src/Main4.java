import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cycle = scanner.nextInt();
        for (int sum = cycle; sum < 5; sum++) {
            if (sum == 3) {
                System.out.println("This number is:" + sum);
                break;
            }

            System.out.println("This cycle has:" + sum);

        }
    }
}
