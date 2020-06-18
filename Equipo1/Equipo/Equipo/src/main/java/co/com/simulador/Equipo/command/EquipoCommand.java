package co.com.simulador.Equipo.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class EquipoCommand {

    private int codigoEquipo;
    private String nombreEquipo;
    //private Image logo;
    private int numeroJugadores;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;
    private int diferenciaGol;
    private int puntos;

    public int getNumeroJugadores() {
        return 0;
    }

    public Object getNombreEquipo() {
        return null;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public void setNombreEquipo(Object nombreEquipo) {

    }

    public void setNumeroJugadores(Object numeroJugadores) {
    }

    public void setPartidosJugados(Object partidosJugados) {

    }

    public void setPartidosGanados(Object partidosGanados) {
    }

    public void setPartidosPerdidos(Object partidosPerdidos) {
    }

    public void setPartidosEmpatados(Object partidosEmpatados) {
    }

    public void setGolesFavor(Object golesFavor) {
    }

    public void setGolesContra(Object golesContra) {
    }

    public void setDiferenciaGol(Object diferenciaGol) {
    }

    public void setPuntos(Object puntos) {
    }
}
