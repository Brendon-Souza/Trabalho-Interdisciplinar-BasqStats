package model.partida;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partida {

    private int id;
    private LocalDate data;
    private LocalTime hora;
    private String timeAdversario;
    private String local;

    public Partida(LocalDate data, LocalTime hora, String timeAdversario, String local) {
        this.data = data;
        this.hora = hora;
        this.timeAdversario = timeAdversario;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getTimeAdversario() {
        return timeAdversario;
    }

    public void setTimeAdversario(String timeAdversario) {
        this.timeAdversario = timeAdversario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}