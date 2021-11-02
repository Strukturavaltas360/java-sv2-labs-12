package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println(b);

        int intvaltozo = 2;
        System.out.println(intvaltozo);

        int i= 3;
        int j = 4;
        int k;

        k = i;

        System.out.println(i+" " +j+" "+k);

        String s;
        s = "Hello World!";
        System.out.println(s);

        String t = s;
        System.out.println(t);

        int a = 7;

        {
        int x = 0;
        System.out.println(x);
        System.out.println(a);
        }

    }
}
