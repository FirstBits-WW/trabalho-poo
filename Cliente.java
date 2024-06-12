public abstract class Cliente implements ICliente{
    
    protected String nome;
    protected Carrinho carrinho;

    
    public abstract double realizarCompra();
    public Cliente(String nome, Carrinho carrinho) {
        this.nome = nome;
        this.carrinho = carrinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    


    

}
