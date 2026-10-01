package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReservaTest {

    Reserva reserva;

    @BeforeEach
    public void setUp() {
        reserva = new Reserva();
    }

    // Reserva confirmada

    @Test
    public void naoDeveConfirmarReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void deveRealizarCheckOutReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.realizarCheckOut());
        assertEquals(ReservaEstadoCheckOut.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveSuspenderReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.suspender());
        assertEquals(ReservaEstadoPendente.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveArquivarReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.arquivar());
        assertEquals(ReservaEstadoArquivada.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveCancelarReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.cancelar());
        assertEquals(ReservaEstadoCancelada.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveTransferirReservaConfirmada() {
        reserva.setEstado(ReservaEstadoConfirmada.getInstance());
        assertTrue(reserva.transferir());
        assertEquals(ReservaEstadoTransferida.getInstance(), reserva.getEstado());
    }

    // Reserva pendente

    @Test
    public void deveConfirmarReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertTrue(reserva.confirmar());
        assertEquals(ReservaEstadoConfirmada.getInstance(), reserva.getEstado());
    }

    @Test
    public void naoDeveRealizarCheckOutReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertFalse(reserva.realizarCheckOut());
    }

    @Test
    public void naoDeveSuspenderReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertFalse(reserva.suspender());
    }

    @Test
    public void deveArquivarReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertTrue(reserva.arquivar());
        assertEquals(ReservaEstadoArquivada.getInstance(), reserva.getEstado());
    }

    @Test
    public void deveCancelarReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertTrue(reserva.cancelar());
        assertEquals(ReservaEstadoCancelada.getInstance(), reserva.getEstado());
    }

    @Test
    public void naoDeveTransferirReservaPendente() {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        assertFalse(reserva.transferir());
    }

    // Reserva checkout

    @Test
    public void naoDeveConfirmarReservaCheckOut() {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void naoDeveRealizarCheckOutReservaCheckOut() {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        assertFalse(reserva.realizarCheckOut());
    }

    @Test
    public void naoDeveSuspenderReservaCheckOut() {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        assertFalse(reserva.suspender());
    }

    @Test
    public void naoDeveArquivarReservaCheckOut() {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        assertFalse(reserva.arquivar());
    }

    @Test
    public void naoDeveCancelarReservaCheckOut() {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        assertFalse(reserva.cancelar());
    }

    @Test
    public void naoDeveTransferirReservaCheckOut() {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        assertFalse(reserva.transferir());
    }

    // Reserva arquivada

    @Test
    public void naoDeveConfirmarReservaArquivada() {
        reserva.setEstado(ReservaEstadoArquivada.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void naoDeveRealizarCheckOutReservaArquivada() {
        reserva.setEstado(ReservaEstadoArquivada.getInstance());
        assertFalse(reserva.realizarCheckOut());
    }

    @Test
    public void naoDeveSuspenderReservaArquivada() {
        reserva.setEstado(ReservaEstadoArquivada.getInstance());
        assertFalse(reserva.suspender());
    }

    @Test
    public void naoDeveArquivarReservaArquivada() {
        reserva.setEstado(ReservaEstadoArquivada.getInstance());
        assertFalse(reserva.arquivar());
    }

    @Test
    public void naoDeveCancelarReservaArquivada() {
        reserva.setEstado(ReservaEstadoArquivada.getInstance());
        assertFalse(reserva.cancelar());
    }

    @Test
    public void naoDeveTransferirReservaArquivada() {
        reserva.setEstado(ReservaEstadoArquivada.getInstance());
        assertFalse(reserva.transferir());
    }

    // Reserva cancelada

    @Test
    public void naoDeveConfirmarReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void naoDeveRealizarCheckOutReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.realizarCheckOut());
    }

    @Test
    public void naoDeveSuspenderReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.suspender());
    }

    @Test
    public void deveArquivarReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertTrue(reserva.arquivar());
        assertEquals(ReservaEstadoArquivada.getInstance(), reserva.getEstado());
    }

    @Test
    public void naoDeveCancelarReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.cancelar());
    }

    @Test
    public void naoDeveTransferirReservaCancelada() {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        assertFalse(reserva.transferir());
    }

    // Reserva transferida

    @Test
    public void naoDeveConfirmarReservaTransferida() {
        reserva.setEstado(ReservaEstadoTransferida.getInstance());
        assertFalse(reserva.confirmar());
    }

    @Test
    public void naoDeveRealizarCheckOutReservaTransferida() {
        reserva.setEstado(ReservaEstadoTransferida.getInstance());
        assertFalse(reserva.realizarCheckOut());
    }

    @Test
    public void naoDeveSuspenderReservaTransferida() {
        reserva.setEstado(ReservaEstadoTransferida.getInstance());
        assertFalse(reserva.suspender());
    }

    @Test
    public void naoDeveArquivarReservaTransferida() {
        reserva.setEstado(ReservaEstadoTransferida.getInstance());
        assertFalse(reserva.arquivar());
    }

    @Test
    public void naoDeveCancelarReservaTransferida() {
        reserva.setEstado(ReservaEstadoTransferida.getInstance());
        assertFalse(reserva.cancelar());
    }

    @Test
    public void naoDeveTransferirReservaTransferida() {
        reserva.setEstado(ReservaEstadoTransferida.getInstance());
        assertFalse(reserva.transferir());
    }
}