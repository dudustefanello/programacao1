class Acampamento{
    private String nome;
    private int idade;
    private char equipe;

    void Acampamento(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    void definirEquipe(){
        char equipe;
        if(this.idade <= 10) equipe = 'A';
        else if(this.idade >= 21) equipe = 'C';
        else equipe = 'B';
        setEquipe(equipe);
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    int getIdade(){
        return this.idade;
    }

    void setEquipe(char equipe){
        this.equipe = equipe;
    }

    public char getEquipe(){
        return this.equipe;
    }

    String tString(){
        return (this.nome + " " + this.idade + " " + this.equipe);
    }
}
