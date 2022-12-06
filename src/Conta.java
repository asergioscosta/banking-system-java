import java.util.ArrayList;

public abstract class Conta {
    private String numero;
    private Double  saldo;

    ArrayList<Conta> listaConta = new ArrayList<Conta>();

    public Conta(String numero, Double saldo) {
        this.numero = numero;
        this.setSaldo(saldo);
    }

    public Double depositar(Double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    public Double sacar(Double valor) {

        if (valor > this.saldo || valor > this.saldo) {
            System.out.println("O seu saldo é: ");
            return this.saldo;
        } else
            saldo -= valor;
        return this.saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
