package nameconcat;

public class Name {

    String familyName;
    String middleName;
    String givenName;
    Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        return title.title+" "+givenName+" "+middleName+" "+ familyName;
    }
    public String concatNameHungarianStyle(){
        return title.title+" "+familyName+" "+middleName+" "+ givenName;

    }
}
