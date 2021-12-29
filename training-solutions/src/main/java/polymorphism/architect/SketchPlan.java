package polymorphism.architect;

public class SketchPlan extends Plan {

    protected String title;

    public SketchPlan(int pagesOfDocumentation, String title) {
        super(pagesOfDocumentation);
        this.title = title;
    }

    @Override
    int getPagesOfDocumentation() {
        return pagesOfDocumentation;
    }

    public String getTitle() {
        return title;
    }
}
