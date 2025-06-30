import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterfaceUser {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String response = "";

        List<String> tarefa = new ArrayList<>();
        opcoes gerenciador = new opcoes();

        do {
            System.out.println("\nLista de Afazeres");
            System.out.println("<-----Menu----->");
            System.out.println("[1] Adicionar tarefas\n[2] Remover tarefas \n[3] Listar tarefas\n[0] Sair do programa");
            System.out.println("Escolha alguma das opções:");
            response = entrada.nextLine();
            switch (response) {
                case "1":
                    System.out.println("<-----Adicionar----->");
                    System.out.println("Digite o nome da tarefa para adicionar: ");
                    String nome = entrada.nextLine();
                    gerenciador.Adicionar(tarefa, nome);
                    break;
                case "2":
                    System.out.println("<-----Remover----->");
                    System.out.println("Tarefas e seus indices:");
                    for(int i = 0; i < tarefa.size(); i++){
                        System.out.println(i + "-" + tarefa.get(i));
                    }
                    System.out.println("Digite o indice da tarefa para remover: ");
                    String index_tarefa = entrada.nextLine();
                    gerenciador.Remover(tarefa, index_tarefa);
                    
                    break;
                case "3":
                    System.out.println("\n<----- Listar Tarefas ----->");
                    gerenciador.Listar(tarefa);
                    try {
                        Thread.sleep(3000); // pausa de 3 segundos
                    } catch (InterruptedException e) {
                        System.out.println("A pausa foi interrompida.");
                    }
                    break;

             case "0":
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
        }
    } while(!response.equals("0"));
    entrada.close(); 
    }
}
