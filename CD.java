
public class CD {
	private String titulo, banda;
	private float preco;
	
	CD(String titulo, String banda, float preco){
		this.titulo = titulo;
		this.banda = banda;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

		
}
