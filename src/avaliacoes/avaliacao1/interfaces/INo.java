package avaliacoes.avaliacao1.interfaces;

import avaliacoes.avaliacao1.classes.No;

public interface INo<T> {

    void setValor(T valor);
    void setPai(No no);
    void setFilhoEsquerdo(No no);
    void setFilhoDireito(No no);
    T getValor();
    No getPai();
    No getFilhoEsquerdo();
    No getFilhoDireito();
}