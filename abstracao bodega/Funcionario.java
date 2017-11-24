public class Funcionario{
    private int posicao;
    private String nome;
    private Double salario;
    private boolean estaNaEmpresa;

    public void Funcionario(
            String name,
            Double salary,
            int position){
        this.nome = name;
        this.salario = salary;
        this.estaNaEmpresa = true;
        this.posicao = position;
    }

    public boolean getAtivo(){
        return this.estaNaEmpresa;
    }

    public void mostra(){
        if(this.estaNaEmpresa){
            System.out.println("\n\tNome:....." + this.nome);
            System.out.println("\tSalário:.." + this.salario + "\n");
        }
    }

    public void demite(){
        this.estaNaEmpresa = false;
    }
}
