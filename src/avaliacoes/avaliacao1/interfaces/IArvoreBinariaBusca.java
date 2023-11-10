package avaliacoes.avaliacao1.interfaces;

import avaliacoes.avaliacao1.classes.No;

public interface IArvoreBinariaBusca extends IArvore {

    void visitar(No no);
    void preOrdem(No no);
    void emOrdem(No no);
    void posOrdem(No no);
    void percorrerPorLargura(No no);

}
