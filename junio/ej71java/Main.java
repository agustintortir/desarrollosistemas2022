import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FicheroNormal a = new FicheroNormal("a", 45);
        FicheroNormal b = new FicheroNormal("b", 60);

        Link c = new Link("c", b);
        System.out.println(c.getTamano());

        ArrayList<Fichero> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        Directorio d = new Directorio("d", arr);
        System.out.println(d.getTamano());
    }
}
