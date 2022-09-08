package entities;

public class Vitrine {

    private String marca;

    private String modelo;

    private Integer serie;

    private Double valor;

    private Boolean vemCarregador;

    private Boolean vemFone;

    public Vitrine(String marca, String modelo, Integer serie, Double valor, Boolean vemCarregador, Boolean vemFone) {
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.valor = valor;
        this.vemCarregador = vemCarregador;
        this.vemFone = vemFone;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getSerie() {
        return serie;
    }

    public Double getValor() {
        return valor;
    }

    public Boolean getVemCarregador() {
        return vemCarregador;
    }

    public Boolean getVemFone() {
        return vemFone;
    }

}
