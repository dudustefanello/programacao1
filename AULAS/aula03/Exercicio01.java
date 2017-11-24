import java.util.Scanner;

class Exercicio01{//festa
    public static void main(String[] args){

        int  idade;
        boolean amigo;
        String resposta;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        idade = entrada.nextInt();

        System.out.print("Você é amigo desse cara? ");
        resposta = entrada.next();

        amigo = resposta.equals("s");

        if(idade >= 18 || amigo){
          System.out.println("Entre.");
        }
        else{
          System.out.println("Vá embora!");
        }
      }
    }
