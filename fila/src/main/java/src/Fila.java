package src;

public class Fila {

    private Node inicio;
    private Node ultimo;
    private int tamanho;

    /**
     * Metodo para adicionar um elemento inteiro a lista.
     * 
     * @param _valor elemento a ser adicionado.
     */     
    public void enfileirar(int _valor) {
        Node _node = new Node(_valor);
        if (this.inicio == null) {
            this.inicio = _node;
            this.ultimo = _node;
        } else {
            //[]->[]->[]->[]<->[u|n]
            this.ultimo.setProximo(_node);
            this.ultimo = _node;          
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
     * Metodo para remover um valor dentro do vetor
     * 
     * @param _valor
     */     
    public void desenfileirar() {
        if(this.inicio == null) return;

        this.inicio = this.inicio.getProximo();        
                
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