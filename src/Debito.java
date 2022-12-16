public class Debito {

    private Double valor;
    private Conta conta;

    public Debito(Conta conta) {
        this.setConta(conta);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}