package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {

        Verb verb = new PhrasalVerb("fut","el");
        System.out.println(verb.getWord());

        System.out.println();

        Verb verb2 = new PhrasalVerbWithSuffix("fut","el","ás");
        System.out.println(verb2.getWord());

        System.out.println();

        Preposition preposition = new PhrasalVerb("fut","el");
        System.out.println(preposition.getPreposition());
        System.out.println(preposition.getWholeWord());

        System.out.println();

        Preposition preposition2 = new PhrasalVerbWithSuffix("fut","el","ás");
        System.out.println(preposition2.getPreposition());
        System.out.println(preposition2.getWholeWord());

        System.out.println();

        PhrasalVerb phrasalVerb = new PhrasalVerb("fut","el");
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getPreposition());
        System.out.println(phrasalVerb.getWholeWord());

        System.out.println();

        PhrasalVerb phrasalVerb2 = new PhrasalVerbWithSuffix("fut","el","ás");
        System.out.println(phrasalVerb2.getWord());
        System.out.println(preposition2.getPreposition());
        System.out.println(preposition2.getWholeWord());

        System.out.println();

        Suffix suffix = new PhrasalVerbWithSuffix("fut","el","ás");
        System.out.println(suffix.getSuffix());

        System.out.println();

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("fut","el","ás");
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
