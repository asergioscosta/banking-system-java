public class ContaCorrente extends Conta {

    private Double limite;

    public ContaCorrente(String numero, Double saldo) {
        super(numero, saldo);
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Object[] transferir(Conta contaDestino, Conta contaOrigem, Double valor) {

        if (valor > contaOrigem.getSaldo()) {
            System.out.println("O valor que possui na conta é: " + getSaldo());
        } else {
            Double valorDois = valor;
            valorDois += contaDestino.getSaldo();
            contaDestino.setSaldo(valorDois);
            contaOrigem.setSaldo(getSaldo() - valor);
        }

        Object[] objects = {contaDestino, contaOrigem};

        return objects;
    }
}