class Jogador{
    int jogada[] = new int[2];
    int identf;
    Tabuleiro tabuleiro = new Tabuleiro();

    /*public void Jogador(Tabuleiro jogo, int jogador){
        this.tabuleiro = jogo;
        this.identf = jogador;
    }*/

    public void jogar(int local[]){
        while(!this.tabuleiro.marcar(identf, local))
            System.out.println("Jogada não permitida!");
    }
}
