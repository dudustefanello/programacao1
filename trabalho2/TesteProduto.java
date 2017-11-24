import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class TesteProduto{
    int menu(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("|--------- MENU ---------|");
        System.out.println("| 1 - Cadastrar Produto  |");
        System.out.println("| 2 - Consultar Estoque  |");
        System.out.println("| 3 - Remover Unidades   |");
        System.out.println("| 4 - Adicionar Unidades |");
        System.out.println("| 9 - Sair               |");
        System.out.println("|------------------------|");
        System.out.print  ("| Opção: ");

        int opcao = entrada.nextInt();

        return opcao;
    }

    static Produto cadastraProdutos(){
        Scanner entrada = new Scanner(System.in);

        Produto p1 = new Produto();

        System.out.print("Nome: ");
        p1.setNome(entrada.nextLine());

        System.out.print("Valor: ");
        p1.setValor(entrada.nextFloat());

        System.out.print("Quantidade: ");
        p1.quantidade = entrada.nextInt();

        return p1;
    }

    void consultaEstoque(ArrayList<Produto> lista){
        for(Produto i : lista)
            System.out.println(i.tString());
    }

    void removeUnidades(ArrayList<Produto> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Código do Produto para remover: ");
        int cod = entrada.nextInt();

        Produto p1 = lista.get(cod);

        System.out.print("Quantidade para remover: ");
        int quantidade = entrada.nextInt();

        if(p1.removerUnidades(quantidade)) System.out.println("Removido");
        else System.out.println("Nao Removido");
    }

    void adicionaUnidades(ArrayList<Produto> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Código do Produto para adicionar: ");
        int cod = entrada.nextInt();

        System.out.print("Quantidade para adicionar: ");
        int quantidade = entrada.nextInt();

        Produto p1 = lista.get(cod);
        p1.adicionarUnidades(quantidade);
    }

    public static void main(String[] args){
        TesteProduto objeto = new TesteProduto();
        ArrayList<Produto> lista = new ArrayList<Produto>();

        int opcao = 0;
        while(opcao != 9){
            opcao = objeto.menu();

            switch(opcao){
                case 1:
                    lista.add(cadastraProdutos());
                    break;
                case 2:
                    objeto.consultaEstoque(lista);
                    break;
                case 3:
                    objeto.removeUnidades(lista);
                    break;
                case 4:
                    objeto.adicionaUnidades(lista);
                    break;
            }
        }
    }
}
