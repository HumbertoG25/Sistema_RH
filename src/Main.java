package Sistema_RH.src;

public class Main {
    public static void main(String[] args){
        Funcionario a = new Funcionario("Sara", "061.195.037.70", 2000);
        Gerente b = new Gerente("Rogerio", "065.319.187.81", 8000, 10);

        a.exibirDados();
        System.out.println("\n");
        b.exibirDados();
        System.out.println("\n");
        a.aplicarAumento(10);
        a.exibirDados();
    }
}