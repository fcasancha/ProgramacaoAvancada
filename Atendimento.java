
public class Atendimento {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chamada c1 = new Chamada(2.5f, "Japão");
		Chamada c2 = new Chamada(1.5f, "Canadá");
		Chamada c3 = new Chamada(0.75f, "Brasil");
		
		Central central = new Central();
		central.insereFila(c1);
		central.insereFila(c2);
		central.insereFila(c3);
		
		
		central.imprimeFila();
		central.Atende();
		central.Atende();
		central.imprimeFila();
		
	}

}
