import java.util.Arrays;

enum Season {

    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String plName;
    private final String[] months;

    Season(String plName, String[] months) {
        this.plName = plName;
        this.months = months;
    }

    public String getPlName() {
        return plName;
    }

    public String[] getMonths() {
        return months;
    }

    static void showInfo(String[] seasonMonths) {
        if (seasonMonths != null) {
            System.out.println(Arrays.toString(seasonMonths));
        } else {
            System.out.println("Nie ma takiej pory roku.");
        }
    }

    static String[] getSeason(String data) {
        switch (data.toUpperCase()) {
            case "WIOSNA":
                return Season.SPRING.getMonths();
            case "LATO":
                return Season.SUMMER.getMonths();
            case "JESIEŃ":
                return Season.AUTUMN.getMonths();
            case "ZIMA":
                return Season.WINTER.getMonths();
            default:
                return null;
        }
    }
}