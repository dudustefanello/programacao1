//Imprima os fatoriais de 1 a 10.

class exercicio04{
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            int fatorial = 1;
            for(int j = i; j > 0; j--){
                fatorial *= j;
            }
            System.out.println("Fatorial de " + i + ": " + fatorial);
        }
    }
}
