import java.util.Scanner;

class exercicio01{
    public static void main(String[] args) {
        int tamanho, maior = 0, menor = 0, soma = 0;
        int[] vetor;
        Scanner entrada = new Scanner (System.in);

        System.out.print("Entre o tamanho do vetor: ");
        tamanho = entrada.nextInt();
        vetor = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            int valor;

            System.out.print("vetor[" + (i + 1) + "] ");
            valor = entrada.nextInt();
            soma += valor;

            if(i == 0) menor = valor;
            if(valor > maior) maior = valor;
            else if (valor < menor) menor = valor;
        }

        System.out.println();
        System.out.println("Soma:  " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
