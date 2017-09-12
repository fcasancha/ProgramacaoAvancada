import java.util.ArrayList;

public class Carrinho {
	ArrayList<CD> carrinhoCds;
	private float valorTotal;
	
	Carrinho(){
		carrinhoCds = new ArrayList<CD>();
	}
	
	public void adicionaItem(CD cd){
		carrinhoCds.add(cd);
		
	}
	
	public void imprimeCarrinho(){
		for(CD cd: carrinhoCds){
			System.out.println("---------------------");
			System.out.println("Título:" + cd.getTitulo() );
			System.out.println("Banda:" + cd.getBanda() );
			System.out.println("Preço:"+ cd.getPreco() );
			System.out.println("---------------------");
			
		}
	}
	
	public void removeItem(CD cd){
		carrinhoCds.remove(cd);
	}
	
	public float getValorTotal(){
		valorTotal = 0.0f;
		for(CD cd: carrinhoCds)
			valorTotal += cd.getPreco();
		
		return valorTotal;
	}
}
