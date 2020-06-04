package src;

public class NodeFila {

    private Object obj;
    private NodeFila proximo;

    NodeFila(Object _obj) {
        this.obj = _obj;
    }
    
    /**
     * @param proximo the proximo to set
     */
    public void setProximo(NodeFila proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the proximo
     */
    public NodeFila getProximo() {
        return proximo;
    }

    /**
     * @return the valor
     */
    public Object getObj() {
        return this.obj;
    }

}