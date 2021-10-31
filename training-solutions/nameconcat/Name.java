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
        String fullname="";

        if (title != null) {
            fullname = title.getTitle();
            fullname = fullname.concat(" ");
        }
        fullname = fullname.concat(givenName);
        fullname = fullname.concat(" ");
        if ((middleName != null) && (!"".equals(middleName))) {
            fullname = fullname.concat(middleName);
            fullname = fullname.concat(" ");
        }
        fullname = fullname.concat(familyName);
        return fullname ;

    }

    public String concatNameHungarianStyle(){
        String fullname="";

        if (title != null) {
            fullname = title.getTitle();
            fullname +=" ";
        }
        fullname += familyName;
        fullname += " ";
            if ((middleName != null) && (!"".equals(middleName))) {
                fullname += middleName;
                fullname += " ";
            }
            fullname += givenName;
        return fullname ;


    }
}
