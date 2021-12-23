package schoolrecords;

public enum MarkType {
    A(5, "excellent"), 
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"), 
    F(1, "fail");


    private final String markName;
    private final int mark;

    MarkType(int mark, String markName) {
        this.mark = mark;
        this.markName = markName;
    }

    public String getMarkName() {
        return markName;
    }

    public int getMark() {
        return mark;
    }
}
