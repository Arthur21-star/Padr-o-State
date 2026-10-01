package padroescomportamentais.state;

public class Reserva {

    private String hospede;
    private ReservaEstado estado;

    public Reserva() {
        this.estado = ReservaEstadoConfirmada.getInstance();
    }

    public void setEstado(ReservaEstado estado) {
        this.estado = estado;
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean realizarCheckOut() {
        return estado.realizarCheckOut(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean arquivar() {
        return estado.arquivar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public ReservaEstado getEstado() {
        return estado;
    }
}