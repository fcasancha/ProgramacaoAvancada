import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<Integer>();
		
		for(int i=0; i<3; i++){
			pilha.push(i+3);
			//System.out.println(pilha.peek());
		}
	
		//pilha.pop();		
		for(int i=0; i<3; i++){
			
			System.out.println(pilha.peek());
			pilha.pop();
		}
	}	
}
