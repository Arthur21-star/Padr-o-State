package padroescomportamentais.state;

public abstract class ReservaEstado {

    public abstract String getEstado();

    public boolean confirmar(Reserva reserva) {
        return false;
    }

    public boolean realizarCheckOut(Reserva reserva) {
        return false;
    }

    public boolean suspender(Reserva reserva) {
        return false;
    }

    public boolean arquivar(Reserva reserva) {
        return false;
    }

    public boolean cancelar(Reserva reserva) {
        return false;
    }

    public boolean transferir(Reserva reserva) {
        return false;
    }
}
