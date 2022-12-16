public class Aplicacao2 {

    public static void main(String[] args) {

        Endereco e1 = new Endereco("36666666", "Rua A", "20", "Casa", "Juiz de Fora", "MG");
        Endereco e2 = new Endereco("36666666", "Rua B", "21", "Casa", "Juiz de Fora", "MG");
        Endereco e3 = new Endereco("36666666", "Rua C", "21", "Casa", "Juiz de Fora", "MG");

        Cliente c = new Cliente("65485420553", "Augusto", "32987765391");

        c.getListaEndereco().add(e1);
        c.getListaEndereco().add(e2);
        c.getListaEndereco().add(e3);
        c.retornaValidacao();

        System.out.println("O Cliente é " + c.getNome() + " e os endereços são: ");
        System.out.println("O Endereço 1 é: " + e1.getLogradouro());
        System.out.println("O Endereço 2 é: " + e2.getLogradouro());
        System.out.println("O Endereço 3 é: " + e3.getLogradouro());
    }

}
