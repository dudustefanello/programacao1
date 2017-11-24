//priscila.dalabetha@uffs.edu.br

import java.until.Scanner;

class TesteEntrada{
  public static void main(String[] args){
    int x;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o valor de X: ");
    x = entrada.nextInt();
    System.out.println("O valor de X é: " + x);
  }
}
