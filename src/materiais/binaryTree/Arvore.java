package materiais.binaryTree;

import java.util.*;

public class Arvore {
    public No raiz;

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(raiz, valor);
    }

    public No inserirRecursivo(No no, int valor) {

        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }

        return no;
    }

    public void atravessarOrdemNivel() {

        if (raiz == null) {
            return;
        }

        Queue<No> nos = new LinkedList<>();
        nos.add(raiz);

        while (!nos.isEmpty()) {

            No no = nos.remove();

            System.out.println(no.valor);

            if (no.esquerda != null) {
                nos.add(no.esquerda);
            }

            if (no.direita != null) {
                nos.add(no.direita);
            }
        }
    }

    public void visitarEmOrdem(No no) {
        if (no != null) {
            visitarEmOrdem(no.esquerda);
            visitar(no.valor);
            visitarEmOrdem(no.direita);
        }
    }

    public void visitarPreOrdem(No no) {
        if (no != null) {
            visitar(no.valor);
            visitarPreOrdem(no.esquerda);
            visitarPreOrdem(no.direita);
        }
    }

    public void visitarPosOrdem(No no) {
        if (no != null) {
            visitarPosOrdem(no.esquerda);
            visitarPosOrdem(no.direita);
            visitar(no.valor);
        }
    }

    private void visitar(int value) {
        System.out.print(" " + value);
    }
}
