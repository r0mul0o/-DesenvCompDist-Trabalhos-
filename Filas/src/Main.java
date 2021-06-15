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
        fila.add("Josu�");
        fila.add("Juarez");
        fila.add("Plinio");
        fila.add("Alejandro");
        fila.add("Lady Gaga");
        fila.add("Biscui");
        fila.add("Josefina");
        fila.add("Brigadeiro");
        
        System.out.println("|Fila de usu�rios pendentes|  -  |Digite a op��o desejada: ");
        System.out.println("Usu�rios em processo de Aprova��o:");
		while(fila.isEmpty() != true) {		
			System.out.println("Proximo usu�rio: "+ fila.peek());
			System.out.println("1 - aprovar! ");
			System.out.println("2 - recusar ");
			System.out.println("3 - Listar usu�rios Aprovados ");
			System.out.println("4 - Listar usu�rios Recusados ");
			System.out.println("5 - Listar usu�rios aguardando aprova��o ");
			opcao = salva.nextInt();
			switch(opcao){
				case 1:
					String user = fila.peek();
					Aprovados.add(fila.poll());
					System.out.println(" | ----- | Usu�rio " +user+ " Foi aprovado! | ----- |");
					break;
				case 2:
					user = fila.peek();
					Recusados.add(fila.poll());
					System.out.println("| ----- | Usu�rio " +user+ " Foi recusado | ----- |");
					break;
				case 3:
					System.out.println("Usu�rios Aprovados: "+Aprovados);
					break;
				case 4:
					System.out.println("Usu�rios Recusados: "+Recusados);
					break;
				case 5:
					System.out.println("Usu�rios aguardando aprova��o: "+fila);
					break;
			}		
		}
		System.out.println("- A fila est� vazia, encerrando sistema... ---");

	}
}
