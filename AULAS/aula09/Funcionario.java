public class Funcionario{
    String nome, departamento, rg;
    Double salario;
    boolean estaNaEmpresa;
    Data dataEntrada;

    private Funcionario(String n, String dept, String rgF,
            double valor){
            this.nome = n;
            this.salario = valor;
            this.estaNaEmpresa = true;
    }

    public void mostra(){
        System.out.println("\n\tNome: " + this.nome);
        System.out.println("\tDepartamento: " + this.departamento);
        System.out.println("\tRG: " + this.rg);
        System.out.println("\tData de Admissão: " + this.dataEntrada.formatada());
        System.out.printf("\tSalário %.2f\n", this.salario);
        System.out.printf("\tGanho anual: %.2f\n", this.calculaGanhoAnual());
        System.out.println(estaNaEmpresa ? "\tEste Funcionário está na empreasa.\n"
            : "\tEste Funcionario não está na empresa.\n");
    }

    public void demite(){
        this.estaNaEmpresa = false;
    }

    public double calculaGanhoAnual(){
        return this.salario * 12;
    }

    public void bonifica(double aumento){
        this.salario += aumento;
    }
}
