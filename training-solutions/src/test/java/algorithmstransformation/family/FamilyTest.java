package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    List<FamilyMember> familyMemberList = new ArrayList(Arrays.asList(
            new FamilyMember("Kovács Edit", 45),
            new FamilyMember("Nagy Ferenc", 39)));
    Family family = new Family(familyMemberList);

    @Test
    void testCreateFamily() {

        assertEquals(45,family.getFamilyMemberList().get(0).getAge());
        assertEquals("Nagy Ferenc", family.getFamilyMemberList().get(1).getName());
    }

    @Test
    void testAddFamilyMember() {
        family.addFamilyMember(new FamilyMember("Kiss Beatrix", 26));
        assertEquals(3,family.getFamilyMemberList().size());
        assertEquals("Kiss Beatrix",family.getFamilyMemberList().get(2).getName());
    }

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven() {
        family.addFamilyMember(new FamilyMember("Kiss Beatrix", 26));
        family.addFamilyMember(new FamilyMember("Molnár Edit", 71));
        family.addFamilyMember(new FamilyMember("Molnár Edit Ilona", 56));
        List<Integer> ages = family.getAgesOfFamilyMembersWithNameGiven("Edit");

        assertEquals(3,ages.size());
        assertEquals(56,ages.get(2));
    }

}