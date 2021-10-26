package attributes.bill;

public class Bill {
    public static void main(String[] args) {

        BillItem item = new BillItem("Szekrény",20000, 5,27);
        System.out.println(item.getProduct()+"  | Nettó egységár: "+item.getPrice()+"  | Mennyiség: "+item.getQuantity()+
                "  |ÁFA mértéke : "+item.getVatPercent()+"%  | Bruttó érték: " + item.calculateTotalPrice());

    }
}
