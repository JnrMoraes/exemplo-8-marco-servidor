package br.com.marco.aula8.ExemploAula8;

import java.util.ArrayList;
import java.util.List;


public class Veiculo {
    private int id;
    private String placa;
    private String cor;
    private String marca;
    private int numPortas;
    private float preco;
    private List<Float> ipva = new ArrayList<>();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public List<Float> getIpva() {
        return ipva;
    }

    public void setIpva(List<Float> ipva) {
        this.ipva = ipva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
