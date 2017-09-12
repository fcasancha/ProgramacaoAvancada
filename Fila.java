import java.util.*;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>(); 
		fila.add("Cliente 1");
		fila.add("Cliente 2");
		fila.add("Cliente 3");
		
		
		System.out.println("Elemento: " + fila.poll() ); //recupera e remove o inicio da fila
		//fila.remove()
		System.out.println("Elemento: " + fila.remove() );
		
		System.out.println(fila.contains("Cliente 3"));
		System.out.println(fila.peek().equals("Cliente 3"));
	
	}

}
