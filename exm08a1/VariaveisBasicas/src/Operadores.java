public class Operadores {
    public static void main(String[] args) {
        operacoesAritimeticas();
        operacoesAtribuicoes();
    }
    private static void operacoesAtribuicoes() {
    }   int n1 = 0;
    public static void operacoesAritimeticas() {
    
        int n1 = 10;
        int n2 = 20;

        int n3 = n1 + n2;
        int n4 = n1 - n2;
        int n5 = n1 / n2;
        int n6 = n1 * n2;

        System.out.println("A soma entre "+n1 +" e " +n2 +" é igual a: " +n3);
        System.out.println("A subtração entre "+n1 +" e " +n2 +" é igual a: " +n4);
        System.out.println("A divisão entre "+n1 +" e " +n2 +" é igual a: " +n5);
        System.out.println("A multiplicação entre "+n1 +" e " +n2 +" é igual a:" +n6);

    }

    
}
