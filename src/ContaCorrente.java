public class ContaCorrente extends Conta {

    private Double limite;

    public ContaCorrente(String numero) {
        super(numero);
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void depositar(Double valor) {
        Credito credito = new Credito(this);
        credito.setValor(valor);
        this.addCredito(credito);
    }

    public void sacar(Double valor) {
        if (calcularSaldo() < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            super.sacar(valor);
        }
    }

    public void transferir(Double valor) {
        if (calcularSaldo() < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.sacar(valor);
            this.depositar(valor);
        }
    }

    public Double calcularsaldocontacorrentec() {
        Double total = 0.0;
        for (Credito c : this.getListaCredito()) {
            total += c.getValor();
        }
        return total;
    }

    public Double calcularsaldocontacorrented() {
        Double total = 0.0;
        for (Debito d : getListaDebito()) {
            total += d.getValor();
        }
        return total;
    }

    public Double calcularSaldo() {
        return (this.calcularsaldocontacorrentec() - this.calcularsaldocontacorrented() + this.limite);
    }
}