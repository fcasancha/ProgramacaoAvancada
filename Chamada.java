/*
 *  Uma central de atendimento a clientes tem v�rios atendentes, mas um n�mero muito maior
de linhas telef�nicas recebendo chamadas. As chamadas s�o colocadas em uma fila de
espera segundo a ordem de chegada (e atendidas quando poss�vel). Ocorre que algumas
destas chamadas v�m de longe, e neste caso, se elas ficam esperando na linha, elas ficam
causando uma despesa muito maior do que as chamadas que vem de perto. Uma solu��o
alternativa seria colocar as chamadas em fila segundo a prioridade definida primeiramente
pelo custo (as mais caras devem esperar menos) e secundo por ordem de chamada.
Projete uma estrutura para modelar essa situa��o alternativa.

 * 
 * */

import java.util.*;
public class Chamada implements Comparable<Chamada>{
	private float custo; //custo da chamada
	private String origem; //origem da liga��o
	private int ordem; //ordem da chamada
	private static int totalChamadas=0; 
	
	Chamada(){
		
	}
	
	Chamada(float custo, String origem){
		totalChamadas++;
		setCusto(custo);
		setOrigem(origem);
		this.ordem = totalChamadas;  //ordem de chegada
	}

	//compara custos
	public int compareTo(Chamada b) {  
	    if(custo<b.custo){  
	        return 1;  
	    }else if(custo>b.custo){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}  
	
	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public int getOrdem() {
		return ordem;
	}
	
	
}
