import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUsuario {

    private Boolean vip;

    Collection<Endereco> endereco = new ArrayList<Endereco>();
    ArrayList<Endereco> listaEndereco = new ArrayList<Endereco>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void addEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }

    public void retornaValidacao() {
    }

    public ArrayList<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    @Override
    public boolean autenticar() {
        return false;
    }

}
