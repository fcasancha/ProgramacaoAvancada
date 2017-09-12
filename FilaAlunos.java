import java.util.LinkedList;
import java.util.Queue;

public class FilaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Aluno> fila = new LinkedList<Aluno>();
		
		Aluno al1 = new Aluno(1,"Fulano");
		Aluno al2 = new Aluno(2, "Ciclano");
		Aluno al3 = new Aluno(3, "Beltrano");
		
	
	   fila.add(al3);
	   fila.add(al2);
	   fila.add(al1);
	   
	   for(Aluno al:fila){
		   if(al.getNome().equals("Ciclano")) 
		   	System.out.println("Achou");
		   
	   }
	 
	   fila.remove(); //fila.pool
	   fila.remove(); //fila.pool
	   System.out.println(fila.peek().getNome());
	}

}
