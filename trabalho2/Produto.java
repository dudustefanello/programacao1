class Produto{
    private String nome;
    private float valor;
    int quantidade;

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setValor(float valor){
        this.valor = valor;
    }

    float getValor(){
        return this.valor;
    }

    boolean verificarDisponibilidade(int quantidade){
        return quantidade <= this.quantidade ? true : false;
    }

    void adicionarUnidades(int quantidade){
        this.quantidade += quantidade;
    }

    boolean removerUnidades(int quantidade){
        if(verificarDisponibilidade(quantidade)){
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    String tString(){
        return (this.nome + " " + this.valor + " " + this.quantidade);
    }
}
