package org.example;
import java.util.LinkedList;

public class Locadora {
    private LinkedList <Cliente> ListaCliente = new LinkedList<>();
    private LinkedList <Dvd> ListaDvd = new LinkedList<>();

    public boolean cadastroCliente(Cliente cli){
            for(Cliente i: ListaCliente){
                if(i.getNome() == cli.getNome()){
                    return false;


                }
            }
            ListaCliente.add(cli);
            return true;
    }

    public boolean cadastroDvd(Dvd dvd){
        for(Dvd i :ListaDvd){
            if(i.getCodigo() == dvd.getCodigo()){
                return false;
            }
        }
        ListaDvd.add(dvd);
            return true;
    }

    public int contardvdemprestado(){
        int contadordvd = 0;
        for(Dvd j : ListaDvd){
            if(j.getCliente() != null){
                contadordvd += 1;
            }


        } return contadordvd;

    }
    public boolean emprestimo(Cliente cliente, Dvd dvd){
        if(dvd.getCliente() == null){
            dvd.setCliente(cliente);
            return true;
        }return false;

    }


}
