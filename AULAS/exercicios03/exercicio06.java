//Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a
//seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento vale 0, o segundo vale 1,
//daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento
//(ex: 8 = 5 + 3).

class exercicio06{
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        System.out.print(a + ", " + b + ", ");
        while(b <= 100){
            c = b + a;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}
