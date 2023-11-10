package materiais.ArvoreBinaria;

public interface IArvore {

    void inserir(No no) throws Exception;
    No remover(No no) throws Exception;
    No buscar(No no) throws Exception;
    void visitar(No no) throws Exception;

    boolean estaVazia();
    boolean estaCompleta();

}
