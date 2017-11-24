class Quadrado{
	private int lado;
	private static int erros = 0;
    final int i = 100;

	public void setLado(int medidaDoLado){
		if (medidaDoLado > 0)
			lado = medidaDoLado;
		else
			erros++;
	}
	public void exibeDados(){
		System.out.println("Lado: " + lado);
	}
	public static void msg(){
		System.out.println("Um quadrilátero");
	}
	public static void msg2(){
		System.out.println("Tentativas inválidas: "+erros);
	}
}

class Programasss{
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = q1;
        q1.exibeDados();
        q2.setLado(6);
        q1.exibeDados();
        q1.setLado(10);
        q2.exibeDados();
        q2.msg();
        q2.setLado(-1);
        q2.exibeDados();
        Quadrado.msg2();
    }
}
