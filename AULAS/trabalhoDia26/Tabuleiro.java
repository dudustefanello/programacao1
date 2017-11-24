class Tabuleiro{
    int tabuleiro[][] = new int[3][3];

    public boolean marcar(int identf, int local[]){
        int i = local[0];
        int j = local[1];

        if(this.tabuleiro[i][j] == 0){
            this.tabuleiro[i][j] = identf;
            return true;
        }
        return false;
    }


    public void Tabuleiro(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.tabuleiro[i][j] = 0;
            }
        }
    }

    public void exibeTabuleiro(){
        System.out.println("\n\n\n\n\n    JOGO DA VELHA\n");
        for(int i = 0; i < 3; i++){
            System.out.print("     |");
            for(int j = 0; j < 3; j++){
                if(this.tabuleiro[i][j] == 0)
                System.out.print("   ");
                if(this.tabuleiro[i][j] == -1)
                System.out.print(" X ");
                if(this.tabuleiro[i][j] == 1)
                System.out.print(" O ");
            }
            System.out.println("|");
        }
        System.out.println("\n\n\n");
    }

    public int checaLinhas(){
        for(int i = 0; i < 3; i++){
            if(this.tabuleiro[i][0] + this.tabuleiro[i][1] + this.tabuleiro[i][2] == 3) return 1;
            if(this.tabuleiro[i][0] + this.tabuleiro[i][1] + this.tabuleiro[i][2] == -3) return -1;
        }
        return 0;
    }

    public int checaColunas(){
        for(int i = 0; i < 3; i++){
            if(this.tabuleiro[0][i] + this.tabuleiro[1][i] + this.tabuleiro[2][i] == 3)
            return 1;
            if(this.tabuleiro[0][i] + this.tabuleiro[1][i] + this.tabuleiro[2][i] == -3)
            return -1;
        }
        return 0;
    }

    public int checaDiagonais(){
        int a = this.tabuleiro[0][0] + this.tabuleiro[1][1] + this.tabuleiro[2][2];
        int b = this.tabuleiro[0][2] + this.tabuleiro[1][1] + this.tabuleiro[2][0];
        if(a == 3 || b == 3) return 1;
        if(a == -3 || b == -3) return -1;
        return 0;
    }

    public boolean tabuleiroCompleto(){
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                if(this.tabuleiro[i][j] == 0) return false;
        return true;
    }

    public int checaTentativa(){
        if(checaLinhas() == -1)
            return -1;
        if(checaLinhas() == 1)
            return 1;
        if(checaColunas() == -1)
            return -1;
        if(checaColunas() == 1)
            return 1;
        if(checaDiagonais() == -1)
            return -1;
        if(checaDiagonais() == 1)
            return 1;
        return 0;
    }
}
