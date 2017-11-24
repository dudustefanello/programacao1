import java.util.Scanner;

class Programa{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Empresa bodega = new Empresa(
            "Bodega do Joãozin",
            "06.136.981/0001-85");

        System.out.println("Cadastros");
        System.out.print("Quantidades de Funcionários para Cadastrar: ");
        int qtd = entrada.nextInt();
        for(int i = 0; i < qtd; i++){
            bodega.cadastraFuncionarios();
        }
        System.out.print("Quantidades de Bebidas para Cadastrar: ");
        qtd = entrada.nextInt();
        for(int i = 0; i < qtd; i++){
            bodega.cadastraBebidas();
        }
        System.out.print("Quantidades de Clientes para Cadastrar: ");
        qtd = entrada.nextInt();
        for(int i = 0; i < qtd; i++){
            bodega.cadastraClientes();
        }
        int option = 6;
        while(option != 0){
            System.out.println("Operação");
            System.out.println("1 - Vender");
            System.out.println("2 - Comprar");
            System.out.println("3 - Relatório de Funcionários");
            System.out.println("4 - Relatório de Clientes");
            System.out.println("5 - Relatório de Estoque");
            System.out.print("Opção: ");
            option = entrada.nextInt();
            switch (option){
                case 1:
                    bodega.vender();
                    break;
                case 2:
                    bodega.comprar();
                    break;
                case 3:
                    bodega.mostraFuncionarios();
                    break;
                case 4:
                    bodega.mostraClientes();
                    break;
                case 5:
                    bodega.mostraBebidas();
                    break;
            }
        }
    }
}
