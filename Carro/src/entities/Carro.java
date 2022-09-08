package entities;

public class Carro {

    private String cor;

    private String modelo;

    private Integer velocidadeAtual;

    private Integer velocidadeMaxima;

    private Boolean ligado;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;

    }

    public void acelerar(Integer velocidadeASerSomadaComAAtual) {
        this.velocidadeAtual = velocidadeAtual + velocidadeASerSomadaComAAtual;
    }

    public Integer pegarMarcha() {
        boolean velocidadeAtualMaiorOuIgualAZero = this.velocidadeAtual >= 0;
        boolean velocidadeAtualMenorOuIgualAVinte = this.velocidadeAtual <= 20;
        boolean velocidadeAtualEMaiorQueVinte = this.velocidadeAtual > 20;
        boolean velocidadeAtualEMenorOuIgualAQuarenta = this.velocidadeAtual <= 40;
        boolean velocidadeMaiorOuIgualAQuarenta = this.velocidadeAtual >= 40;
        boolean velocidadeMenorOuIgualASessenta = this.velocidadeAtual >= 60;
        boolean velocidadeAtualEMaiorQueSetenta = this.velocidadeAtual > 70;
        boolean velocidadeAtualEMenorOuIgualACem = this.velocidadeAtual <= 100;
        if (velocidadeAtualMaiorOuIgualAZero && velocidadeAtualMenorOuIgualAVinte) {
            return 1;
        } else if (velocidadeAtualEMaiorQueVinte && velocidadeAtualEMenorOuIgualAQuarenta) {
            return 2;
        } else if (velocidadeAtualEMaiorQueSetenta && velocidadeAtualEMenorOuIgualACem) {
            return 3;
        } else if (velocidadeMaiorOuIgualAQuarenta && velocidadeMenorOuIgualASessenta) {
            return 4;
        }
        else{
            return 5;
        }


    }
}



