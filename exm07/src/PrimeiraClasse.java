public class PrimeiraClasse {
    
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("RUA 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
    }
}
