class Bebida{
    String nome;
    Double teor;
    int volume;
    int codigo;
    private double preco;
    private int quantidade;

    public void Bebida(
            String name,
            Double alcool,
            int vol,
            Double valor,
            int qtd,
            int code){
        this.nome = name;
        this.teor = alcool;
        this.volume = vol;
        this.preco = valor;
        this.quantidade = qtd;
        this.codigo = code;
    }

    public void comprar(int quantidade){
        this.quantidade += quantidade;
    }

    public boolean vender(int quantidade){
        if(this.quantidade > 0){
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    public void mostra(){
        System.out.printf("\n\tNome:..........." + this.nome);
        System.out.printf("\n\tTeor Alcóolico:." + this.teor);
        System.out.printf("\n\tVolume:........." + this.volume);
        System.out.printf("\n\tPreço:.........." + this.preco);
        System.out.printf("\n\tEstoque:........" + this.quantidade);
        System.out.printf("\n\tCÓDIGO:........." + this.codigo + "\n\n");
    }


}
