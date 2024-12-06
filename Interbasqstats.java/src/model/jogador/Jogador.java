package model.jogador;

import java.time.LocalDate;

public class Jogador {

    private int id;
    private String nome;
    private String posicao;
    private float altura;
    private float peso;
    private String nacionalidade;
    private LocalDate dataNascimento;
    private LocalDate contrato;
    private int pontos;
    private int rebotes;
    private int assistencias;

    public Jogador(String nome, String posicao, float altura, float peso, LocalDate contrato, String nacionalidade, LocalDate dataNascimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.altura = altura;
        this.peso = peso;
        this.contrato = contrato;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.pontos = 0;
        this.rebotes = 0;
        this.assistencias = 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getContrato() {
        return contrato;
    }

    public void setContrato(LocalDate contrato) {
        this.contrato = contrato;
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

    public void adicionarEstatisticas(int pontos, int rebotes, int assistencias) {
        this.pontos += pontos;
        this.rebotes += rebotes;
        this.assistencias += assistencias;
    }

}
