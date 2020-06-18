package co.com.simulador.Equipo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Equipo")
public class EquipoEntity {

    @Id
    @GeneratedValue
    @Column(name = "codigoEquipo")
    private int codigoEquipo;

    @Column(name = "nombreEquipo")
    private String nombreEquipo;

    /*@Column(name = "logo")
    private Image logo; -->jpa no admite datos de tipo Image*/

    @Column(name = "numeroJugadores")
    private int numeroJugadores;

    @Column(name = "partidosJugados")
    private int partidosJugados;

    @Column(name = "partidosGanados")
    private int partidosGanados;

    @Column(name = "partidosPerdidos")
    private int partidosPerdidos;

    @Column(name = "partidosEmpatados")
    private int partidosEmpatados;

    @Column(name = "golesFavor")
    private int golesFavor;

    @Column(name = "golesContra")
    private int golesContra;

    @Column(name = "diferenciaGol")
    private int diferenciaGol;

    @Column(name = "puntos")
    private int puntos;

    public void getCodigoEquipo(int codigoEquipo) {
    }

    public void setNombreEquipo(Object nombreEquipo) {
    }

    public void setNumeroJugadores(int numeroJugadores) {
    }

    public void setPartidosJugados(int i) {
    }

    public void setPartidosGanados(int i) {
    }

    public void setPartidosPerdidos(int i) {
    }

    public void setPartidosEmpatados(int i) {
    }

    public void setGolesFavor(int i) {
    }

    public void setGolesContra(int i) {
    }

    public void setDiferenciaGol(int i) {
    }

    public void setPuntos(int i) {
    }

    public Object getNombreEquipo() {
        return null;
    }

    public Object getNumeroJugadores() {
        return null;
    }

    public Object getPartidosJugados() {
        return null;
    }

    public Object getPartidosGanados() {
        return null;
    }

    public Object getPartidosPerdidos() {
        return null;
    }

    public Object getPartidosEmpatados() {
        return null;
    }

    public Object getGolesFavor() {
        return null;
    }

    public Object getGolesContra() {
        return null;
    }

    public Object getDiferenciaGol() {
        return null;
    }

    public Object getPuntos() {
        return null;
    }

    public int getCodigoEquipo() {
        return 0;
    }
}
