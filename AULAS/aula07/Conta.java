import java.util.Scanner;

class Cliente{
    String nome, sobrenome;
    String endereco;
    int cpf, telefone;

    construtor
}

class Conta{
    int numero;
    String dono;
    double saldo;
    double limite;

    void deposita(){
        System.out.print("- Valor do Depósito: R$ ");
        Scanner entrada = new Scanner (System.in);
        double valor = entrada.nextDouble();
        this.saldo += valor;
        System.out.println("- Depósito realizado!");
        System.out.println("- Novo saldo: R$ " + this.saldo + "\n");
    }

    boolean verifica(double valor){
        if(valor > this.saldo){
            return false;
        }
        return true;
    }

    void saca(){
        System.out.print("- Valor do Saque: R$ ");
        Scanner entrada = new Scanner (System.in);
        double valor = entrada.nextDouble();
        if(verifica(valor)){
            this.saldo -= valor;
            System.out.println("- Novo saldo: R$ " + this.saldo + "\n");
        }
        else
            System.out.println("\n" + "-    Saldo Insuficiente    -" + "\n");
    }

    void consulta(){
        System.out.println("- Conta: " + this.numero);
        System.out.println("- Saldo: R$ " + this.saldo + "\n");
    }
}
