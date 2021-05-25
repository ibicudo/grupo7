package modulo5.src.aula4manha.dakar;

import java.util.*;

public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int qtdVeiculosPermitidos;
    private HashMap<String,Veiculo> listaVeiculos = new HashMap<>();
    private SocorristaCarro sc = new SocorristaCarro();
    private SocorristaMoto sm = new SocorristaMoto();
    private String campeao;
    private double tempoCampeao = 0;

    public Corrida(double distancia, double premioEmDolares, String nome, int qtdVeiculosPermitidos){
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.qtdVeiculosPermitidos = qtdVeiculosPermitidos;
    }

    public Veiculo getVeiculo(String v){
        return listaVeiculos.get(v);
    }

    public void registrarCarro(int velocidade, int  aceleracao, int anguloDeGiro, String placa){    
        if (listaVeiculos.size() < this.qtdVeiculosPermitidos){
            Carro c  = new Carro(velocidade, aceleracao, anguloDeGiro, placa);
            c.setPatente(listaVeiculos.size() + 1);
            listaVeiculos.put(c.getPlaca(), c);
        }
    }

    public void registrarMoto(int velocidade, int  aceleracao, int anguloDeGiro, String placa){    
        if (listaVeiculos.size() < this.qtdVeiculosPermitidos){
            Moto m  = new Moto(velocidade, aceleracao, anguloDeGiro, placa);
            m.setPatente(listaVeiculos.size()+1);
            listaVeiculos.put(m.getPlaca(), m);
        }else
            System.out.println("Corrida sem vagas para novos participantes");
    }

    public void removerVeiculo(Veiculo v){
        removerVeiculo(v.getPlaca());
    }

    public void removerVeiculo(String placa){
        listaVeiculos.remove(placa);
    }

    public void socorrerCarro(String placa){
        sc.socorrer( (Carro) listaVeiculos.get(placa));
    }

    public void socorrerMoto(String placa ){
        sm.socorrer( (Moto) listaVeiculos.get(placa));
    }

    public void vencedor(){
        this.tempoCampeao = 0;
        listaVeiculos.forEach((placa, veiculo)->{
            double aux = veiculo.getVelocidade() * veiculo.getAceleracao() /(veiculo.getAnguloDeGiro()* ( veiculo.getPeso() - veiculo.getRodas() * 100 ));
            if (aux > tempoCampeao){
                this.tempoCampeao = aux;
                this.campeao = veiculo.getPlaca();
            }
        });
        System.out.println("O vencedor é: " + this.campeao + "\nCom o tempo: " + this.tempoCampeao);
    }
}
