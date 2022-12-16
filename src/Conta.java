import java.util.ArrayList;

public abstract class Conta {
    private String numero;

    private ArrayList<Credito> listaCredito = new ArrayList<Credito>();
    private ArrayList<Debito> listaDebito = new ArrayList<Debito>();

    public Conta(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Credito> getListaCredito() {
        return listaCredito;
    }

    public void setListaCredito(ArrayList<Credito> listaCredito) {
        this.listaCredito = listaCredito;
    }

    public ArrayList<Debito> getListaDebito() {
        return listaDebito;
    }

    public void setListaDebito(ArrayList<Debito> listaDebito) {
        this.listaDebito = listaDebito;
    }

    public void addCredito(Credito credito) {
        this.listaCredito.add(credito);
    }

    public void addDebito(Debito debito) {
        this.listaDebito.add(debito);
    }

    public void depositar(Double valor) {
        Credito credito = new Credito(this);
        credito.setValor(valor);
        this.addCredito(credito);
    }

    public void sacar(Double valor) {
        Debito debito = new Debito(this);
        debito.setValor(valor);
        this.addDebito(debito);
    }

}