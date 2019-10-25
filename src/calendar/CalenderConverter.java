package calendar;

public class CalenderConverter {
    public static final int MONDAY      =1;
    public static final int TUESDAY     =2;
    public static final int WEDNESDAY   =3;
    public static final int THURSDAY    =4;
    public static final int FRIDAY      =5;
    public static final int SATURDAY    =6;
    public static final int SUNDAY      =7;

    public static String convertDayToString(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return "Poniedzialek";
            case 2:
                return "Wtorek";
            case 3:
                return "Środa";
            case 4:
                return "Czwartek";
            case 5:
                return "Piątek";
            case 6:
                return "Sobota";
            case 7:
                return "Niedziela";
            default:
                return "Błąd podaj dzień tygodnia z przedziału 1-7";
        }
    }
}
