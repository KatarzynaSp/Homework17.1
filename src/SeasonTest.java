import java.util.Arrays;
import java.util.Scanner;

public class SeasonTest {
    public static void main(String[] args) {
        String data = enterData();
        getSeason(data);
    }

    private static void getSeason(String data) {
        switch (data.toUpperCase()){
            case "WIOSNA":
               System.out.println(Arrays.toString(Season.SPRING.getMonths()));
               break;
            case "LATO":
                System.out.println(Arrays.toString(Season.SUMMER.getMonths()));
                break;
            case "JESIEŃ":
                System.out.println(Arrays.toString(Season.AUTUMN.getMonths()));
                break;
            case "ZIMA":
                System.out.println(Arrays.toString(Season.WINTER.getMonths()));
                break;
            default:
                System.out.println("Nie ma takiej pory roku.");
        }
    }

    private static String enterData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź porę roku");
        String data = input.nextLine();
        input.close();;
        return data;
    }
}
