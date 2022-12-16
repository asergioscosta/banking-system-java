import java.util.ArrayList;
import java.util.Collection;

public class Cargo {

    private String nome;

    private Collection<Funcionario> funcionario = new ArrayList<Funcionario>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Collection<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
}
