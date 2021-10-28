package compositionlist.computer;

public class PersonalComputerMain {


public static void main(String[] args) {
        Cpu cpu1 = new Cpu("i5",6.8);
        Cpu cpu2 = new Cpu("i8",4.6);

        PersonalComputer pc1 = new PersonalComputer(cpu1);
        PersonalComputer pc2 = new PersonalComputer(cpu2);

        Software software1 = new Software("Adobe Acrobat Reader",7.0);
        Software software2 = new Software("IntelliJ IDEA",11.012);
        Hardware monitor1 = new Hardware("Asus", "be4594598");
        Hardware printer1 = new Hardware("Minolta", "bh 4500");

        System.out.println(pc1);
        System.out.println(pc2);

        pc1.addSoftware(software1);
        pc1.addHardware(monitor1);
        pc1.addHardware(printer1);

        System.out.println(pc1);
        System.out.println(pc1.getHardwares());
        System.out.println(pc1.getSoftwares());
        System.out.println(pc2.getCpu());

        Cpu cpu3 = new Cpu("i7",9.4);
        System.out.println(cpu3.toString());
        cpu3.setModel("i5");
        cpu3.setClockSignal(9.8);
        System.out.println(cpu3.toString());
        PersonalComputer pc3 = new PersonalComputer(cpu3);
        pc3.addHardware(monitor1);
        pc3.addSoftware(software2);
        System.out.println(pc3.getSoftwares());

    }
    
}
