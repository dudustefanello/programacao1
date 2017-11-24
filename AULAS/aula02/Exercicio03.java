class execicioThree{
	public static void main(String[] args){
		int jan = 15000, fev = 23000, mar = 17000;
		int total = jan + fev + mar;
		float media = total / 3;
		boolean controldado = media < 30000;
		System.out.println("Gasto do Trimestre: R$ " + total);
		System.out.println("Média Mensal:       R$ " + media);
		System.out.print ("O gato mensal é controldado? ");
		System.out.println(controldado ? "Sim" : "Não");
	}
}