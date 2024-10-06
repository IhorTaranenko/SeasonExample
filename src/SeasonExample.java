import java.util.Scanner;

public class SeasonExample {
    public enum Season{
        WINTER, SPRING, SUMMER, AUTUMN
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.next();
        sc.close();
        switch (season.toLowerCase()) {
            case"december":
            case"january":
            case"february":
                System.out.println(Season.WINTER);
                break;
            case"march":
            case"april":
            case"may":
                System.out.println(Season.SPRING);
                break;
            case"june":
            case"july":
            case"august":
                System.out.println(Season.SUMMER);
                break;
            case"september":
            case"october":
            case"november":
                System.out.println(Season.AUTUMN);
                break;
            default:
                System.out.println("No valid month entered!");
        }
    }
}
