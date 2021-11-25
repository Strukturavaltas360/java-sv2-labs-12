package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    List<FamilyMember> familyMemberList;

    public Family(List<FamilyMember> familyMemberList) {
        this.familyMemberList = familyMemberList;
    }

    public List<FamilyMember> getFamilyMemberList() {
        return familyMemberList;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMemberList.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        List<Integer> familyAges = new ArrayList<>();
        for (FamilyMember actual: familyMemberList) {
            if (actual.getName().contains(name)) {
                familyAges.add(actual.getAge());
            }
        }
        return familyAges;
    }
}
