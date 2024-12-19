public enum Days {
//    MONDAY(true),
//    TUESDAY(true),
//    WEDNESDAY(true),
//    THURSDAY(true),
//    FRIDAY(true),
//    SATURDAY(false),
//    SUNDAY(false);

//    private final boolean isWeekday;
//
//    Days(boolean isWeekday) {
//        this.isWeekday = isWeekday;
//    }
//
//    public boolean isWeekday() {
//        return isWeekday;
//    }

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}
