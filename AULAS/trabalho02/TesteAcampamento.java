import java.util.Scanner;

class TesteAcampamento{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Acampamento[] acampamento = new Acampamento[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Idade: ");
            int idade = entrada.nextInt();

            entrada.nextLine();

            acampamento[i] = new Acampamento();
            acampamento[i].Acampamento(nome, idade);
            acampamento[i].definirEquipe();
        }

        for(Acampamento i : acampamento){
            System.out.println(i.tString());
        }
    }
}
