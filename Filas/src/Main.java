import java.util.*;

class Main {

	// Main
	public static void main(String args[])
	{
		Scanner salva = new Scanner(System.in);
		int opcao;
		Queue<String> Recusados = new LinkedList<>();
		Queue<String> Aprovados = new LinkedList<>();
	    Queue<String> fila = new LinkedList<>();
        fila.add("Fulano");
        fila.add("Cicrano");
        fila.add("Beltrano");
        fila.add("Josué");
        fila.add("Juarez");
        fila.add("Plinio");
        fila.add("Alejandro");
        fila.add("Lady Gaga");
        fila.add("Biscui");
        fila.add("Josefina");
        fila.add("Brigadeiro");
        
        System.out.println("|Fila de usuários pendentes|  -  |Digite a opção desejada: ");
        System.out.println("Usuários em processo de Aprovação:");
		while(fila.isEmpty() != true) {		
			System.out.println("Proximo usuário: "+ fila.peek());
			System.out.println("1 - aprovar! ");
			System.out.println("2 - recusar ");
			System.out.println("3 - Listar usuários Aprovados ");
			System.out.println("4 - Listar usuários Recusados ");
			System.out.println("5 - Listar usuários aguardando aprovação ");
			opcao = salva.nextInt();
			switch(opcao){
				case 1:
					String user = fila.peek();
					Aprovados.add(fila.poll());
					System.out.println(" | ----- | Usuário " +user+ " Foi aprovado! | ----- |");
					break;
				case 2:
					user = fila.peek();
					Recusados.add(fila.poll());
					System.out.println("| ----- | Usuário " +user+ " Foi recusado | ----- |");
					break;
				case 3:
					System.out.println("Usuários Aprovados: "+Aprovados);
					break;
				case 4:
					System.out.println("Usuários Recusados: "+Recusados);
					break;
				case 5:
					System.out.println("Usuários aguardando aprovação: "+fila);
					break;
			}		
		}
		System.out.println("- A fila está vazia, encerrando sistema... ---");

	}
}
