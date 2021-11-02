package person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person();
        Address address = new Address("Hungary","Budapest","Váci utca 7","1052");

        person.correctData("Hajós Éva","344534535");
        System.out.println(person.personToString());

        person.moveTo(address);
        System.out.println("After moveTo:  | " + person.personToString() +"  | "+ person.getAddress().addressToString());

        person.correctData("Hajós Béla","656565656");
        System.out.println("After correct person data:   | " + person.personToString() +"  | "+ person.getAddress().addressToString());

        person.address.correctData("Hungary","Budapest","Etele", "1119");
        System.out.println("After correct address data:  | " + person.personToString() +"  | "+ person.getAddress().addressToString());

    }
}
