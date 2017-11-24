import java.util.Scanner;

class Empresa{
    Scanner entrada = new Scanner(System.in);
    private String CNPJ;
    private String nome;
    Funcionario[] bodegueiro = new Funcionario[10];
    Bebida[] birita = new Bebida[10];
    Cliente[] fregues = new Cliente[10];
    int qtdFuncionarios;
    int qtdBebidas;
    int qtdClientes;

    public void iniciaQTDs(){
        qtdFuncionarios = 0;
        qtdBebidas = 0;
        qtdClientes = 0;
    }

    public Empresa(
            String name,
            String cnpj){
        this.nome = name;
        this.CNPJ = cnpj;
    }

    public void mostraFuncionarios(){
        for(int i = 0;  i < qtdFuncionarios; i++)
            bodegueiro[i].mostra();
    }

    public void mostraBebidas(){
        for(int i = 0;  i < qtdBebidas; i++){
            birita[i].mostra();
            //System.out.printf("\n\tCódigo:........." + i);
        }
    }

    public void mostraClientes(){
        for(int i = 0;  i < qtdClientes; i++)
            fregues[i].mostra();
    }

    public void cadastraFuncionarios(){
        iniciaQTDs();
        System.out.print("\tNome do Funcionário:...");
        String nome = entrada.nextLine();
        System.out.print("\tSalário Mensal:........");
        Double salario = entrada.nextDouble();
        System.out.print("\n");
        entrada.nextLine();
        bodegueiro[qtdFuncionarios] = new Funcionario();
        bodegueiro[qtdFuncionarios].Funcionario(nome, salario, qtdFuncionarios);
        qtdFuncionarios++;
    }

    public void cadastraBebidas(){
        System.out.print("\tNome da bebida:........");
        String nome = entrada.nextLine();
        System.out.print("\tTeor alcóolico:........");
        Double teor = entrada.nextDouble();
        System.out.print("\tQuantidade na garrafa:.");
        int volume = entrada.nextInt();
        System.out.print("\tValor:.................");
        Double preco = entrada.nextDouble();
        System.out.print("\tQuantidade em estoque:.");
        int quantidade = entrada.nextInt();
        System.out.print("\n");
        entrada.nextLine();
        birita[qtdBebidas] = new Bebida();
        birita[qtdBebidas].Bebida(nome, teor, volume, preco, quantidade, qtdBebidas);
        qtdBebidas++;
    }

    public void cadastraClientes(){
        System.out.print("\tNome do Cliente:.......");
        String nome = entrada.nextLine();
        System.out.print("\tCPF:...................");
        String cpf = entrada.nextLine();
        fregues[qtdClientes] = new Cliente();
        fregues[qtdClientes].Cliente(nome, cpf, qtdClientes);
        System.out.print("\n");
        qtdClientes++;
    }

    public void vender(){
        mostraBebidas();
        System.out.print("Cód. do produto:...");
        int codigo = entrada.nextInt();
        System.out.print("Quantidade:........");
        int quantidade = entrada.nextInt();
        if(birita[codigo].vender(quantidade))
            System.out.println("Vendido com Sucesso!\n");
        else
            System.out.println("Produto em Falta!\n");
    }

    public void comprar(){
        mostraBebidas();
        System.out.print("Cód. do produto:...");
        int codigo = entrada.nextInt();
        System.out.print("Quantidade:........");
        int quantidade = entrada.nextInt();
        birita[codigo].comprar(quantidade);
        System.out.println("Comprado com Sucesso!\n");
    }
}
