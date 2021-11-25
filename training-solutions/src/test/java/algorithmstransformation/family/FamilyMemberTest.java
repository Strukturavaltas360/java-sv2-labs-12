package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void testCreateFamilyMember() {
        FamilyMember familyMember = new FamilyMember("Nagy Edit", 45);
        assertEquals(45, familyMember.getAge());
        assertEquals("Nagy Edit", familyMember.getName());
    }
}