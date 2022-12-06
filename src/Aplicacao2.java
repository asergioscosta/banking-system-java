import java.util.ArrayList;
import java.util.Collection;

public class Aplicacao2 {

    public static void main(String[] args) {

        Cliente c = new Cliente("65485420553", "Augusto", "32987765391");

        Endereco e1 = new Endereco("36666666", "Rua A", "20", "Casa", "Juiz de Fora", "MG");
        Endereco e2 = new Endereco("36666666", "Rua B", "21", "Casa", "Juiz de Fora", "MG");
        Endereco e3 = new Endereco("36666666", "Rua C", "21", "Casa", "Juiz de Fora", "MG");

        Collection<Endereco> endereco = new ArrayList<Endereco>();
        c.listaEndereco.add(e1);
        c.listaEndereco.add(e2);
        c.listaEndereco.add(e3);

        System.out.println("O Cliente é " + c.getNome() + " e os endereços são: ");
        System.out.println("O Endereço 1 é: " + e1.getLogradouro());
        System.out.println("O Endereço 2 é: " + e2.getLogradouro());
        System.out.println("O Endereço 3 é: " + e3.getLogradouro());
    }

}
