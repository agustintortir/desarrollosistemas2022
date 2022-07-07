import java.util.ArrayList;

public class Directorio extends Fichero {
    private ArrayList<Fichero> ficheros;

    public Directorio(String nombre, ArrayList<Fichero> ficheros) {
        super(nombre);
        this.ficheros = ficheros;
    }

    public int getTamano() {
        int total = 0;
        for (Fichero f : ficheros) {
            total += f.getTamano();
        }
        return total;
    }
}
