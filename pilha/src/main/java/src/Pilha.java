package src;

public class Pilha {

    private Node topo;
    private int tamanho;

    /**
     * Metodo para adicionar um elemento inteiro a lista.
     * 
     * @param _valor elemento a ser adicionado.
     */

     /**
     * [ ] <- topo         
        ↓
     * [ ] 
     * [ ]
      */
    public void empilhar(int _valor) {
        Node _node = new Node(_valor);
        if (this.topo == null) {
            this.topo = _node;
        } else {
            _node.setProximo(this.topo)
            this.topo = _node;
        }
        tamanho++;
    }

    /**
     * Metodo que retorna o valor armazenado em determinada posicao
     * 
     * @param _posicao posicao
     * @return retorna o valor se existir, caso contrario, retorna -99.
     */
    // [0,1,2,3,4,5] - 4 > 3
    // ->
    // <- 6-4 = 2
    // -2
    // [0,1,2,3,4,5]
    // <-
    public int get(int _posicao) {
        if (_posicao > this.tamanho) {
            return -99;
        }
        if (_posicao == 0) {
            return this.inicio.getValor();
        } else {
            Node aux = this.inicio;
            while (aux.getProximo() != null & _posicao > 0) {
                aux = aux.getProximo();
                _posicao--;
            }
            return aux.getValor();
        }
    }

    /**
     * Metodo para remover um valor dentro da pilha
     * 
     *
     * [ ]         
     *  ↓
     * [ ] <- topo 
     * [ ]
     *     
     */
    public void desempilhar() {
        if (this.topo == null) return;

        this.topo = this.topo.getProximo();        
        this.tamanho--;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node aux = this.inicio;
        while (aux.getProximo() != null) {
            str.append(aux.getValor() + " ");
            aux = aux.getProximo();
        }
        str.append("]");
        return str.toString();
    }

}