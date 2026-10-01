package padroescomportamentais.state;

public class ReservaEstadoArquivada extends ReservaEstado {

    private ReservaEstadoArquivada() {};
    private static ReservaEstadoArquivada instance = new ReservaEstadoArquivada();
    public static ReservaEstadoArquivada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Arquivada";
    }
}
