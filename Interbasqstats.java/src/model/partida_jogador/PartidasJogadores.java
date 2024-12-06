package model.partida_jogador;

import model.jogador.Jogador;

import java.util.List;

public class PartidasJogadores {

    private int partidaId;
    private List<Jogador> escalacao;
    private int pontos;
    private int rebotes;
    private int assistencias;

    public PartidasJogadores(List<Jogador> escalacao, int pontos, int rebotes, int assistencias) {
        this.escalacao = escalacao;
        this.pontos = pontos;
        this.rebotes = rebotes;
        this.assistencias = assistencias;
    }

    public int getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }

    public List<Jogador> getEscalacao() {
        return escalacao;
    }

    public void setEscalacao(List<Jogador> escalacao) {
        this.escalacao = escalacao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }


}
