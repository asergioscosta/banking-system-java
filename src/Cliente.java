import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario {

    private Boolean vip;

    private ArrayList<Conta> listaConta = new ArrayList<Conta>();
    private ArrayList<Endereco> listaEndereco = new ArrayList<Endereco>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void retornaValidacao() {
    }

    @Override
    public boolean autenticar() {
        return false;
    }

    public ArrayList<Conta> getListaConta() {
        return listaConta;
    }

    public void setListaConta(ArrayList<Conta> listaConta) {
        this.listaConta = listaConta;
    }

    public ArrayList<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }
}
