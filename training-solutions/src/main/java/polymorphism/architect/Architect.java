package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {

        Plan plan1 = new SketchPlan(5,"kisház");
        Plan plan2 = new PermitPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2");
        Plan plan3 = new ConstructionPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2",2);

        SketchPlan sPlan1 = new SketchPlan(5,"kisház");
        SketchPlan sPlan2 = new PermitPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2");
        SketchPlan sPlan3 = new ConstructionPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2",2);

        Header header1 = new PermitPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2");
        Header header2 = new ConstructionPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2",2);

        PermitPlan pPlan1 = new PermitPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2");
        PermitPlan pPlan2 = new ConstructionPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2",2);

        ConstructionPlan cPlan = new ConstructionPlan(5,"kisház","Magyar Béla","Szentlőrinc, Fő u. 2",2);

        System.out.println(plan1.getPagesOfDocumentation());
        System.out.println(plan2.getPagesOfDocumentation());
        System.out.println(plan3.getPagesOfDocumentation());

        System.out.println(sPlan1.getPagesOfDocumentation()+" | "+sPlan1.getTitle());
        System.out.println(sPlan2.getPagesOfDocumentation()+" | "+sPlan2.getTitle());
        System.out.println(sPlan3.getPagesOfDocumentation()+" | "+sPlan3.getTitle());

        System.out.println(header1.getNameOfClient()+" | "+header1.getAddressOfBuilding());
        System.out.println(header2.getNameOfClient()+" | "+header2.getAddressOfBuilding());

        System.out.println(pPlan1.getHeader());
        System.out.println(pPlan1.getAddressOfBuilding());
        System.out.println(pPlan1.getTitle());
        System.out.println(pPlan1.getNameOfClient());
        System.out.println(pPlan1.getPagesOfDocumentation());

        System.out.println(pPlan2.getHeader());
        System.out.println(pPlan2.getAddressOfBuilding());
        System.out.println(pPlan2.getTitle());
        System.out.println(pPlan2.getNameOfClient());
        System.out.println(pPlan2.getPagesOfDocumentation());

        System.out.println(cPlan.getHeader());
        System.out.println(cPlan.getAddressOfBuilding());
        System.out.println(cPlan.getTitle());
        System.out.println(cPlan.getNameOfClient());
        System.out.println(cPlan.getPagesOfDocumentation());
        System.out.println(cPlan.getSheetsOfConstructionDrawings());

    }
}
