
public class LojaVirtual {
	
	
	public static void main(String[] args) {
		CD cd1 = new CD("A lua me traiu", "Calypso", 3.99f);
		CD cd2 = new CD("Sei lá", "Forró não sei das quantas", 7.99f);
		CD cd3 = new CD("Love of my life", "Queen", 19.99f);
		
		Carrinho meuCarro = new Carrinho();
		meuCarro.adicionaItem(cd1);
		meuCarro.adicionaItem(cd2);
		meuCarro.adicionaItem(cd3);
		
		meuCarro.imprimeCarrinho();
		System.out.println("Valor total dos CDS no carrinho:"+ meuCarro.getValorTotal());
		
		meuCarro.removeItem(cd1);
		meuCarro.imprimeCarrinho();
		System.out.println("Valor total dos CDS no carrinho:"+ meuCarro.getValorTotal());
	}
}
