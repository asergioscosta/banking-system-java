import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa {

    private Boolean vip;
    private Endereco endereco;

    private Collection<cliente> cliente = new ArrayList<>();

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
