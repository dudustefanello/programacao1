class Produto{
    private int code, quantity;
    private String name;

    public void Produto(int code, String name, int quantity){
        this.code = code;
        this.quantity = quantity;
        this.name = name;
    }

    public void Produto(int code, String name){
        this.code = code;
        this.quantity = 0;
        this.name = name;
    }

    public boolean retirar(int quantity){
        if(this.quantity >= quantity){
            this.quantity -= quantity;
            return true;
        }
        return false;
    }

    public void abastercer(int quantity){
        this.quantity += quantity;
    }

    public String exibir(){
        return this.code + this.name + this.quantity;
    }
}

/*
    public static void main(String[] args) {
        Produto banana = new Produto(325698, "Banana Caturra");
        Produto mandioca = new Produto(125478, "Mandioca da Boa", 526660);
    }
*/
