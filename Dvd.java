package org.example;

public class Dvd {


    private int codigo;
    private String titulo;

    public Dvd() {
    }

    public Dvd(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cliente = null;

    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private Cliente cliente;


}
