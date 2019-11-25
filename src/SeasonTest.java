import java.util.Arrays;
import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        String data = enterData();
        String[] seasonMonths = Season.getSeason(data);
        System.out.println(Arrays.toString(seasonMonths));
    }

        private static String enterData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź porę roku");
        String data = input.nextLine();
        input.close();
        return data;
    }
}