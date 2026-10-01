package padroescomportamentais.state;

public class ReservaEstadoTransferida extends ReservaEstado {

    private ReservaEstadoTransferida() {};
    private static ReservaEstadoTransferida instance = new ReservaEstadoTransferida();
    public static ReservaEstadoTransferida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferida";
    }
}
