package enumtype.position;

public enum Position {SENOR_BRAND_MANAGER(960000,"Life insurance, Health Insurance, Paid Vacation"),
    BUSINESS_ANALYST(980000,"Life insurance, Health Insurance, Paid Vacation, Fitness"),
    CONTROLLING_MANAGER(660000, "Life insurance, Health Insurance, Fitness"),
    JUNIOR_IT_ARCHITECT(620000,"Health Insurance, Paid Vacation");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
