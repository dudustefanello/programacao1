import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Programa{
    public int menu(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1 - Nova Conta");
        System.out.println("2 - Deposito");
        System.out.println("3 - Saque");
        System.out.println("4 - Transferir");
        System.out.println("5 - Sair");

        return entrada.nextInt();
    }

    public ContaCorrente cadastrarCorrente(ArrayList<ContaCorrente> lista){
        Scanner entrada = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente();

        System.out.print("CC: ");
        System.out.print("Saldo Inicial: ");
        c1.novaConta(entrada.nextFloat());

        return c1;
    }

    public void cadastrarPoupanca(ArrayList<ContaPoupanca> lista){
        Scanner entrada = new Scanner(System.in);
        ContaPoupanca c1 = new ContaPoupanca();

        System.out.print("Saldo Inicial: ");
        c1.novaConta(entrada.nextFloat());

        lista.add(c1);
    }

    public void depositarCorrente(ArrayList<ContaCorrente> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Conta: ");
        int cod = entrada.nextInt();
        ContaCorrente c1 = lista.get(cod);

        System.out.print("Valor: ");
        c1.deposito(entrada.nextFloat());

        System.out.println("Sucesso");
    }

    public void depositarPoupanca(ArrayList<ContaPoupanca> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Conta: ");
        int cod = entrada.nextInt();
        ContaPoupanca c1 = lista.get(cod);

        System.out.print("Valor: ");
        c1.deposito(entrada.nextFloat());

        System.out.println("Sucesso");
    }

    public boolean sacarCorrente(ArrayList<ContaCorrente> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Conta: ");
        int cod = entrada.nextInt();
        ContaCorrente c1 = lista.get(cod);

        System.out.print("Valor: ");
        if(!c1.saqueCorrente(entrada.nextFloat(), 1)) return false;

        return true;
    }

    public boolean sacarPoupanca(ArrayList<ContaPoupanca> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Conta: ");
        int cod = entrada.nextInt();
        ContaPoupanca c1 = lista.get(cod);

        System.out.print("Valor: ");
        if(!c1.saquePoupanca(entrada.nextFloat())) return false;

        return true;
    }

    public boolean transferirCorrente(ArrayList<ContaCorrente> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Conta Origem: ");
        int cod = entrada.nextInt();
        ContaCorrente c1 = lista.get(cod);

        System.out.print("Valor: ");
        float valor = entrada.nextFloat();

        if(!c1.saqueCorrente(valor, 5)) return false;

        System.out.print("Conta Destino: ");
        cod = entrada.nextInt();
        c1 = lista.get(cod);

        c1.deposito(valor);

        return true;
    }

    public boolean transferirPoupanca(ArrayList<ContaPoupanca> lista){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Conta Origem: ");
        int cod = entrada.nextInt();
        ContaPoupanca c1 = lista.get(cod);

        System.out.print("Valor: ");
        float valor = entrada.nextFloat();

        if(!c1.saquePoupanca(valor)) return false;

        System.out.print("Conta Destino: ");
        cod = entrada.nextInt();
        c1 = lista.get(cod);

        c1.deposito(valor);

        return true;
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Programa objeto = new Programa();
        ArrayList<ContaCorrente> listaCorrente = new ArrayList<ContaCorrente>();
        ArrayList<ContaPoupanca> listaPoupanca = new ArrayList<ContaPoupanca>();

        int opcao = 0;

        while(opcao != 5){
            opcao = objeto.menu();

            switch(opcao){
                case 1:
                    System.out.print("Tipo de Conta [C/P]");
                    if((entrada.nextLine() == "P"))
                        objeto.cadastrarPoupanca(listaPoupanca);
                    else listaCorrente.add(objeto.cadastrarCorrente(listaCorrente));
                    ContaCorrente c1 = listaCorrente.get(0);
                    break;
                case 2:
                    System.out.print("Tipo de Conta [C/P]");
                    if((entrada.nextLine() == "C"))
                        objeto.depositarCorrente(listaCorrente);
                    else objeto.depositarPoupanca(listaPoupanca);
                    break;
                case 3:
                    System.out.print("Tipo de Conta [C/P]");
                    if((entrada.nextLine() == "C"))
                        if(!objeto.sacarCorrente(listaCorrente))
                            System.out.println("Sem Saldo");
                        else
                        System.out.println("Sucesso");
                    else if(!objeto.sacarPoupanca(listaPoupanca))
                        System.out.println("Sem Saldo");
                    else
                    System.out.println("Sucesso");
                    break;
                case 4:
                    System.out.print("Tipo de Conta [C/P]");
                    if((entrada.nextLine() == "P"))
                        if(!objeto.transferirPoupanca(listaPoupanca))
                            System.out.println("Sem Saldo");
                        else
                        System.out.println("Sucesso");
                    else if(!objeto.transferirCorrente(listaCorrente))
                        System.out.println("Sem Saldo");
                    else
                        System.out.println("Sucesso");
                    break;
                default: continue;
            }
        }
    }
}
