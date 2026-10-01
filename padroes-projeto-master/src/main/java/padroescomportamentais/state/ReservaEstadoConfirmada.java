package padroescomportamentais.state;

public class ReservaEstadoConfirmada extends ReservaEstado {

    private ReservaEstadoConfirmada() {};
    private static ReservaEstadoConfirmada instance = new ReservaEstadoConfirmada();
    public static ReservaEstadoConfirmada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Confirmada";
    }

    public boolean realizarCheckOut(Reserva reserva) {
        reserva.setEstado(ReservaEstadoCheckOut.getInstance());
        return true;
    }

    public boolean suspender(Reserva reserva) {
        reserva.setEstado(ReservaEstadoPendente.getInstance());
        return true;
    }

    public boolean arquivar(Reserva reserva) {
        reserva.setEstado(ReservaEstadoArquivada.getInstance());
        return true;
    }

    public boolean cancelar(Reserva reserva) {
        reserva.setEstado(ReservaEstadoCancelada.getInstance());
        return true;
    }

    public boolean transferir(Reserva reserva) {
        reserva.setEstado(ReservaEstadoTransferida.getInstance());
        return true;
    }
}
