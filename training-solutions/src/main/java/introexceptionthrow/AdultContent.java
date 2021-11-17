package introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {
        Adult adult1 = new Adult("József",34);
        Adult adult2 = new Adult("Anita",32);
        System.out.println(adult1.getName()+" | "+ adult1.getAge());
        System.out.println(adult2.getName()+" | "+ adult2.getAge());

        Adult adult3 = new Adult("Huba",16);

        System.out.println(adult3.getName());
    }
}
