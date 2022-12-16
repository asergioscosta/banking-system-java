import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa implements IUsuario {

    private Double salario;
    private Collection<Cargo> cargo = new ArrayList<Cargo>();

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

    @Override
    public boolean autenticar() {
        return false;
    }

    public Collection<Cargo> getCargo() {
        return cargo;
    }

    public void setCargo(Collection<Cargo> cargo) {
        this.cargo = cargo;
    }
}