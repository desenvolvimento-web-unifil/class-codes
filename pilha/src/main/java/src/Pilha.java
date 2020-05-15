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
            _node.setProximo(this.topo);
            this.topo = _node;
        }
        tamanho++;
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
    public int desempilhar() {
        if (this.topo == null) return -1;

        Node aux = this.topo;
        this.topo = this.topo.getProximo();        
        this.tamanho--;
        return aux.getValor();
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node aux = this.topo;
        while (aux.getProximo() != null) {
            str.append(aux.getValor() + " ");
            aux = aux.getProximo();
        }
        str.append("]");
        return str.toString();
    }

}