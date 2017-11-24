//Imprima todos os múltiplos de 3, entre 50 e 150.

class exercicio03{
    public static void main(String[] args) {
        for(int i = 50; i <= 150; i++){
            System.out.print((i % 3 == 0) ? i + ", " : "");
        }
    }
}
