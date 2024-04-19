package TallerPractico;

public class Usuario {

    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void solicitarViaje(Cabina cabina) {
        System.out.println("-----------------------------------------");
        System.out.println("El usuario " + nombre + " solicita un viaje en la cabina con el ID: " + cabina.getId());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
