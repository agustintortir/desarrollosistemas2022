import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UnidadDeNegocioReal a = new UnidadDeNegocioReal("a", 2, 132.5f, 8, 4);
        UnidadDeNegocioReal b = new UnidadDeNegocioReal("b", 3, 132.5f, 4, 2);

        ArrayList<UnidadDeNegocio> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        UnidadDeNegocioConjunta c = new UnidadDeNegocioConjunta("c", arr);

        System.out.println(c.getContratosPorSemana());
    }
}
