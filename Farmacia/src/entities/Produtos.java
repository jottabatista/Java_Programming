package entities;

public class Produtos {

    private String nomePrincialSubstancia;
    private Double qntdMiligramas;
    private Integer qntdCapsulas;
    private Double valorMedicamento;

    public Produtos(String nomePrincialSubstancia, Double qntdMiligramas, Integer qntdCapsulas, Double valorMedicamento) {
        this.nomePrincialSubstancia = nomePrincialSubstancia;
        this.qntdMiligramas = qntdMiligramas;
        this.qntdCapsulas = qntdCapsulas;
        this.valorMedicamento = valorMedicamento;
    }

    public String getNomePrincialSubstancia() {
        return nomePrincialSubstancia;
    }

    public Double getQntdMiligramas() {
        return qntdMiligramas;
    }

    public Integer getQntdCapsulas() {
        return qntdCapsulas;
    }

    public Double getValorMedicamento() {
        return valorMedicamento;
    }

    @Override
    public String toString() {
        return nomePrincialSubstancia+":" + "R$"+valorMedicamento;
    }
}
