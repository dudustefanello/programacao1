import java.util.Scanner;

class Jogo{

    public void Jogo(){
        Scanner entrada = new Scanner(System.in);
        int jogada[] = new int[2];

        Tabuleiro jogo = new Tabuleiro();

        Jogador jogadorUm = new Jogador();
        Jogador jogadorDois = new Jogador();

        jogadorUm.identf = -1;
        jogadorUm.tabuleiro = jogo;

        jogadorDois.identf = 1;
        jogadorDois.tabuleiro = jogo;

        for(int rodada = 9; rodada > 0; rodada--){

            jogo.exibeTabuleiro();

            if(rodada % 2 == 1){
                System.out.print("Jogador X, ");
            }
            else{
                System.out.print("Jogador O, ");
            }


            System.out.print("informe sua jogada: ");
            jogada[0] = entrada.nextInt();
            jogada[1] = entrada.nextInt();

            if(rodada % 2 == 1){
                jogo.marcar(jogadorUm.identf, jogada);
            }
            else{
                jogo.marcar(jogadorDois.identf, jogada);
            }

            if(jogo.checaTentativa() == -1){
                System.out.println("X Ganhou");
                return;
            }
            else if(jogo.checaTentativa() == +1){
                System.out.println("O Ganhou");
                return;
            }
        }
        System.out.println("Empatou");
    }
}
