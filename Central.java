import java.util.PriorityQueue;
import java.util.Queue;

public class Central {
	Queue<Chamada> fila;
	private int numChamadas;
	
	Central(){
		fila = new PriorityQueue<Chamada>();  //instancia uma fila de prioridade
	}
	
	//Adiciona liga��o � fila de chamadas
	public void insereFila(Chamada call){
		fila.add(call);
	}
	
	//Imprime fila de liga��es
	public void imprimeFila(){
		for(Chamada call: fila){
			System.out.println("-------------");
			System.out.println("Ordem:"+call.getOrdem());
			System.out.println("Origem:"+call.getOrdem());
			System.out.println("Custo:"+ call.getCusto());
			System.out.println("-------------");
		}
	}
	
	//Retira um  elemento da fila
	public void Atende(){
		fila.remove();
	}
	
	//Mostra o in�cio da fila - elemento com maior prioridade
	public void consultaInicio(){
		System.out.println("In�cio da Fila:"+ fila.peek());
	}
	
	public void setChamadas(){
		numChamadas = fila.size();
	}
	//retorna quantas chamadas h� na fila
	public int getChamadas(){
		return numChamadas;
	}
	
}
