package TallerPractico;

import java.util.ArrayList;
import java.util.List;

public class SistemaControlTeleferico {

    private List<Cabina> cabinas;
    private List<Usuario> usuarios;

    public SistemaControlTeleferico() {
        this.cabinas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void crearCabina(int id, int capacidadMaxima) {
        Cabina cabina = new Cabina(id, capacidadMaxima);
        cabinas.add(cabina);
        System.out.println("-----------------------------------------");
        System.out.println("Se ha creado la cabina con el ID: " + id + " con capacidad máxima de " + capacidadMaxima + " personas");
    }

    public void eliminarCabina(Cabina cabina) {
        cabinas.remove(cabina);
        cabina.eliminar();
    }

    public void moverCabina(Cabina cabinaOrigen, Cabina cabinaDestino) {
        System.out.println("-----------------------------------------");
        cabinaOrigen.cambiarEstado("en movimiento");
        cabinaDestino.cambiarEstado("en movimiento");
        System.out.println("La cabina con el ID: " + cabinaOrigen.getId() + " se mueve hacia la cabina con el ID: " + cabinaDestino.getId());
    }

    public void solicitarViaje(Usuario usuario, Cabina cabina) {
        System.out.println("-----------------------------------------");
        System.out.println("El usuario " + usuario.getNombre() + " solicita un viaje en la cabina con el ID: " + cabina.getId());
    }

    public boolean verificarDisponibilidadCabina(Cabina cabina) {
        // Verificar si la cabina está detenida y no está llena
        return cabina.getEstado().equals("detenida") && !cabina.isLlena();
    }




    public List<Cabina> getCabinas() {
        return cabinas;
    }

    public void setCabinas(List<Cabina> cabinas) {
        this.cabinas = cabinas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    // Getters and setters
}
