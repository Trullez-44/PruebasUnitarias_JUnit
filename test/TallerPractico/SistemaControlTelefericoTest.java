package TallerPractico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaControlTelefericoTest {
    @Test
    void testCrearCabina() {
        SistemaControlTeleferico sistema = new SistemaControlTeleferico();
        sistema.crearCabina(1, 8);

        assertEquals(1, sistema.getCabinas().size());
        assertEquals(1, sistema.getCabinas().get(0).getId());
        assertEquals(8, sistema.getCabinas().get(0).getCapacidadMaxima());
    }

    @Test
    void testEliminarCabina() {
        SistemaControlTeleferico sistema = new SistemaControlTeleferico();
        sistema.crearCabina(1, 8);
        sistema.crearCabina(2, 10);

        assertEquals(2, sistema.getCabinas().size());

        Cabina cabinaAEliminar = sistema.getCabinas().get(0);
        sistema.eliminarCabina(cabinaAEliminar);

        assertEquals(1, sistema.getCabinas().size());
        assertFalse(sistema.getCabinas().contains(cabinaAEliminar));
    }

    @Test
    void testMoverCabina() {
        SistemaControlTeleferico sistema = new SistemaControlTeleferico();
        sistema.crearCabina(1, 8);
        sistema.crearCabina(2, 10);

        Cabina cabinaOrigen = sistema.getCabinas().get(0);
        Cabina cabinaDestino = sistema.getCabinas().get(1);

        sistema.moverCabina(cabinaOrigen, cabinaDestino);

        assertEquals("en movimiento", cabinaOrigen.getEstado());
        assertEquals("en movimiento", cabinaDestino.getEstado());
    }

    @Test
    void testSolicitarViaje() {
        SistemaControlTeleferico sistema = new SistemaControlTeleferico();
        sistema.crearCabina(1, 8);
        Usuario usuario = new Usuario("Juan", 30);

        sistema.solicitarViaje(usuario, sistema.getCabinas().get(0));

        // Verificar que el usuario haya solicitado el viaje en la cabina
        // Esto dependerá de cómo implementes el método solicitarViaje en Usuario
        // Puedes agregar aserciones adicionales según sea necesario
    }
    @Test
    void testVerificarDisponibilidadCabinas() {
        // Paso 1: Crear una instancia del sistema de control del teleférico
        SistemaControlTeleferico sistema = new SistemaControlTeleferico();

        // Paso 2: Crear dos cabinas
        sistema.crearCabina(1, 8);
        sistema.crearCabina(2, 10);

        // Paso 3: Verificar la disponibilidad de cabinas para un viaje
        assertTrue(sistema.verificarDisponibilidadCabina());
        sistema.getCabinas().get(0).setPasajerosActuales(8);
        assertFalse(sistema.verificarDisponibilidadCabina());
    }



}