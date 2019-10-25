package calendar;

public class ConverterTest {
    public static void main(String[] args) {
        for (int i = 1; i <=7 ; i++) {
            System.out.println("Dzień: " + i + " to " + CalenderConverter.convertDayToString(i));
        }
    }
}
