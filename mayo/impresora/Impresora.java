import java.util.ArrayList;

public class Impresora {
    private static Impresora instance;
    private int ip;
    private String modelo;
    private ArrayList<Impresion> impresiones;
    private ArrayList<Dispositivo> dispositivos;

    private Impresora() {
        this.ip = 0;
        this.modelo = null;
        this.impresiones = new ArrayList<>();
        this.dispositivos = new ArrayList<>();
    }

    public int getIp() {
        return ip;
    }
    public String getModelo() {
        return modelo;
    }
    public ArrayList<Impresion> getImpresiones() {
        return impresiones;
    }
    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static Impresora getInstance() {
        if (instance == null) instance = new Impresora();
        return instance;
    }
}
