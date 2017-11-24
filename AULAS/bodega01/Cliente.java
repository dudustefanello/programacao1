import java.util.Random;

class Cliente{
    String nome;
    String CPF;
    int codigo;

    public void Cliente(
            String name,
            String cpf,
            int code){
        this.nome = name;
        this.CPF = cpf;
        this.codigo = code;
    }

    public void mostra(){
        System.out.println("\n\tNome:....." + this.nome);
        System.out.println("\tCPF:......" + this.CPF + "\n");
    }

    public boolean fiado(){
        Random gerador = new Random();
        boolean resultado = gerador.nextBoolean();
        return resultado;
    }
}
