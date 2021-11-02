package realestate;


public class RealEstateDotCom {

    public static void main(String[] args) {
        Address address = new Address("Pécs", "7621", "Jókai", 2);
        Details details = new Details("Ékszerdoboz a város szívében", address,34,0);
        RealEstate realEstate = new RealEstate("Lakás a belvárosban",9620000, details);

        System.out.println(realEstate);

        Address address2 = new Address("Pécs", "7621", "Király", 31);
        RealEstate realEstate2 = new RealEstate("Családi fészek a belvárosban",7660666, details);
        System.out.println(realEstate2.getDetails());
        System.out.println(realEstate2.getDetails().getAddress().street);

        realEstate.getDetails().setAddress(address2);
        System.out.println(details.getAddress().street);


    }
}
