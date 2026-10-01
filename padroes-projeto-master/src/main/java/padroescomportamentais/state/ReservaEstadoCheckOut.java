package padroescomportamentais.state;

public class ReservaEstadoCheckOut extends ReservaEstado {

    private ReservaEstadoCheckOut() {};
    private static ReservaEstadoCheckOut instance = new ReservaEstadoCheckOut();
    public static ReservaEstadoCheckOut getInstance() {
        return instance;
    }

    public String getEstado() {
        return "CheckOut";
    }
}
