package avaliacoes.avaliacao1.testes;

import avaliacoes.avaliacao1.classes.ArvoreBinariaBusca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreBinariaBuscaTest {

    @Test
    void inserir() {
        /**
         * A arvore será armazenada na seguinte forma
         *               5
         *              / \
         *            4    8
         *           /    /
         *         1     6
         */

        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void remover() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);

            System.out.println();
            arvoreBinariaBusca.preOrdem(arvoreBinariaBusca.getRaiz());
            arvoreBinariaBusca.remover(8);

            arvoreBinariaBusca.preOrdem(arvoreBinariaBusca.getRaiz());
            assertNull(arvoreBinariaBusca.buscar(arvoreBinariaBusca.getRaiz(), 8).getValor());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void buscar() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);

            /** Procurando um valor existente */
            assertEquals(4, arvoreBinariaBusca.buscar(arvoreBinariaBusca.getRaiz(), 4).getValor());

            /** Procurando um valor inexistente com assertNull */
            assertNull(arvoreBinariaBusca.buscar(arvoreBinariaBusca.getRaiz(), 10).getValor());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void estaVazia() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        /** Usado assertTrue para mostrar que realmente e verdadeiro o valor recebido */
        assertTrue(arvoreBinariaBusca.estaVazia());
    }

    @Test
    void preOrdem() {
        /**
         * Resultado da chamada deve ser: 54186
         * Foi posta o resultado aqui, pois metodo de visitacao apenas imprime no console o valor
         * armazenado no nó
         * */

        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);

            System.out.println();
            arvoreBinariaBusca.preOrdem(arvoreBinariaBusca.getRaiz());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void emOrdem() {
        /**
         * Resultado da chamada deve ser: 41586
         * Foi posta o resultado aqui, pois metodo de visitacao apenas imprime no console o valor
         * armazenado no nó
         * */

        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);

            System.out.println();
            arvoreBinariaBusca.emOrdem(arvoreBinariaBusca.getRaiz());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void posOrdem() {
        /**
         * Resultado da chamada deve ser: 41865
         * Foi posta o resultado aqui, pois metodo de visitacao apenas imprime no console o valor
         * armazenado no nó
         * */

        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);

            System.out.println();
            arvoreBinariaBusca.posOrdem(arvoreBinariaBusca.getRaiz());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void percorrerPorLargura() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);

            System.out.println();
            arvoreBinariaBusca.percorrerPorLargura(arvoreBinariaBusca.getRaiz());

            /**
             * Metodo void, o resultado correto é
             *  5 4 8 1 6
             *  pela disposicao
             *
             *          5
             *        4   8
             *       1   6
             */

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    void getAltura() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();

        try {
            arvoreBinariaBusca.inserir(5);
            arvoreBinariaBusca.inserir(8);
            arvoreBinariaBusca.inserir(4);
            arvoreBinariaBusca.inserir(6);
            arvoreBinariaBusca.inserir(1);

            System.out.println();
            assertEquals(arvoreBinariaBusca.getAltura(arvoreBinariaBusca.getRaiz()), 2);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}