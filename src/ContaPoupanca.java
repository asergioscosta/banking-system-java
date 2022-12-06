public class ContaPoupanca extends Conta {

    private Double rentabilidademensal;

    public ContaPoupanca(String numero, Double saldo) {
        super(numero, saldo);
    }

    public double verificarSaldo() {
        return this.rentabilidademensal;
    }

    public Double getRentabilidademensal() {
        return rentabilidademensal;
    }

    public void setRentabilidademensal(Double rentabilidademensal) {
        this.rentabilidademensal = rentabilidademensal;
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