package src;

public class Node {

    private int valor;
    private Node proximo;

    Node(int _valor) {
        this.valor = _valor;
    }

    Node(int _valor, Node _proximo) {
        this.valor = _valor;
        this.proximo = _proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the proximo
     */
    public Node getProximo() {
        return proximo;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

}