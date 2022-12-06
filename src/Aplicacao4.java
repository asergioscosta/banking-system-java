public class Aplicacao4 {

    public static void main(String[] args) {

        Cliente c = new Cliente("58546825735", "Victor", "32991560735");
        System.out.println("O nome do Cliente é: " + c.getNome());
        ContaCorrente cc = new ContaCorrente("586", 0.00);
        cc.setSaldo(1000.00);
        System.out.println("O valor do depósito na Conta Corrente foi: " + cc.getSaldo());


        Cliente c2 = new Cliente("47552695214", "Luana", "32985620453");
        System.out.println("O nome do Cliente é: " + c2.getNome());
        ContaPoupanca cp = new ContaPoupanca("586", 0.00);
        cp.setSaldo(1000.00);
        System.out.println("O valor do depósito na Conta Poupança: " + cp.getSaldo());


        cc.transferir(cp, cc, 500.00);
        System.out.println("O valor final da Conta Corrente é de: " + cc.getSaldo());
        System.out.println("O valor final da Conta Poupança é de: " + cp.getSaldo());
    }
}
