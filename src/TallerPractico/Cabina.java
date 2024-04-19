package TallerPractico;

public class Cabina {

    private int id;
    private int capacidadMaxima;
    private String estado;
    private int pasajerosActuales;
    public Cabina(int id, int capacidadMaxima) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.estado = "detenida";
        this.pasajerosActuales = 0;
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
        System.out.println("-----------------------------------------");
        System.out.println("La cabina con el ID: " + id + " ahora está " + estado);
    }

    public void eliminar() {
        System.out.println("-----------------------------------------");
        System.out.println("Cabina con el ID: " + id + " eliminada del sistema");
    }

    public boolean isLlena() {
        return pasajerosActuales >= capacidadMaxima;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        this.pasajerosActuales = pasajerosActuales;
    }
}
