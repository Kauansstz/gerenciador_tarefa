import  java.util.List;

public class opcoes{
    public void Adicionar(List<String> lista, String tarefa) {
        lista.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso: " + tarefa);
    }
    public void Remover(List<String> lista, String index) {
        try{
            int i = Integer.parseInt(index);
            if (i >= 0 && i < lista.size()){
                String removida = lista.remove(i);
                System.out.println("Tarefa removida com sucesso: "+ removida);
            } else{
                System.out.println("Índice fora do alcance.");
            }
            } catch (NumberFormatException e){
                System.out.println("Erro: o índice deve ser um número.");
            }
        
    }

    public void Listar(List<String> lista) {
        if (lista.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada.");
        } else{
            for(int i = 0; i < lista.size(); i++){
                        System.out.println(i + "-" + lista.get(i));
                    }
        }
    }

}