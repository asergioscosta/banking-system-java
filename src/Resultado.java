public class Resultado {

    public static void main(String[] args) {

        Funcionario atendenteF = new Funcionario();
        atendenteF.setNome("Augusto");

        Funcionario gerenteF = new Funcionario();
        gerenteF.setNome("Carlos");

        Cliente c = new Cliente();
        c.setNome("Carlos Augusto");

        Endereco e = new Endereco();
        e.setCep("27458986");
        e.setCidade("Juiz de Fora");
        e.setComplemento("Casa");
        e.setLogradouro("Rua A");
        e.setUf("Minas Gerais");
        e.setCliente(c);
        c.setEndereco(e);

        e.setCep("68389250");
        e.setCidade("Juiz de Fora");
        e.setComplemento("Casa");
        e.setLogradouro("Rua B");
        e.setUf("Minas Gerais");
        e.setCliente(c);
        c.setEndereco(e);

        e.setCep("656244350");
        e.setCidade("Juiz de Fora");
        e.setComplemento("Casa");
        e.setLogradouro("Rua C");
        e.setUf("Minas Gerais");
        e.setCliente(c);
        c.setEndereco(e);

        System.out.println(c.getEndereco().getLogradouro());
    }
}
