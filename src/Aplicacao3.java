import java.util.ArrayList;

public class Aplicacao3 {

    public static void main(String[] args) {

        Cliente c = new Cliente("12536652706", "João", "32985576224");

        System.out.println("O nome do Cliente é: " + c.getNome());

        ContaCorrente contac = new ContaCorrente("685", 0.00);
        contac.setLimite(100.00);
        ContaCorrente contac2 = new ContaCorrente("542", 0.00);
        contac2.setLimite(100.00);
        ContaCorrente contac3 = new ContaCorrente("736", 0.00);
        contac3.setLimite(100.00);

        ArrayList<Conta> listaConta = new ArrayList<Conta>();
        contac.listaConta.add(contac);
        contac2.listaConta.add(contac2);
        contac3.listaConta.add(contac3);

        System.out.println("O valor do primeiro depósito foi: " + contac.getLimite());
        System.out.println("O valor do segundo depósito foi: " + contac2.getLimite());
        System.out.println("O valor do terceiro depósito foi: " + contac3.getLimite());

        System.out.println(listaConta.getClass());

        System.out.println("O valor final da Conta Corrente é de: " + contac.getLimite(), contac2.getLimite(), contac3.getLimite());
    }
}