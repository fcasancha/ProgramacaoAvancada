import java.util.Iterator;
import java.util.LinkedList;

public class Llist {
	
	public static void main(String[] args) { 
		LinkedList<String> lista = new LinkedList<String>(); 
		
		lista.add("Europa"); 
		lista.add("America"); 
		lista.add("África"); 
		lista.add("Índia"); 
		
		Iterator<String> it = lista.iterator(); 
		while (it.hasNext()) { 
			System.out.println(it.next()); 
		} 
			
	} //fim-da-main
	
}
