package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person p1;
        Person p2;

        Person person1 = new Person("László", 44);
        p1 = person1;
        p2 = p1;
        p2.name ="József";
        System.out.println(p2.name+" "+ p2.age);
        System.out.println(p1.name+" "+ p1.age);

        int a;
        int b;

        a = 24;
        b = a;
        b ++;
        System.out.println(a +" < "+b);

        Person person2 = new Person("Géza", 25);
        p1 = person2;

        System.out.println(p1.name+" "+p1.age);
        System.out.println(p2.name+" "+p2.age);

    }
}
