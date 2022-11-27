package org.example;

public class Cliente {

    private int matricula;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cliente() {

    }

    public Cliente(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    private String nome;

    @Override
    public String toString() {
        return "Cliente{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
