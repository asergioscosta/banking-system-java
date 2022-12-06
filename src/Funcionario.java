import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa implements IUsuario {

    private Double salario;
    private Collection<Funcionario> funcionario = new ArrayList<Funcionario>();

    public Funcionario(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void retornaValidacao() {
        if (this.autenticar() == Boolean.FALSE) {
            System.out.println("Funcionario Inválido: " + getNome());
        }
    }

    public Collection<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Collection<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public boolean autenticar() {
        return false;
    }
}