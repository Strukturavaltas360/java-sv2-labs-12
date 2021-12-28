package interfacedependencyinversion;

public class CourierCompany {

    public static void main(String[] args) {
        Box small = new SmallBox();
        Box medium = new MediumBox();
        Box large = new LargeBox();
        Box extra = new ExtraLargeBox();

        System.out.println(small.getSize() + " size box costs: " + small.getPrice());
        System.out.println(medium.getSize() + " size box costs: " + medium.getPrice());
        System.out.println(large.getSize() + " size box costs: " + large.getPrice());
        System.out.println(extra.getSize() + " size box costs: " + extra.getPrice());

    }
}
