package co.com.simulador.Equipo.model.businessexecption;

public class EquipoExistenteException extends RuntimeException {

    public EquipoExistenteException(String mensaje){
        super(mensaje);
    }
}
