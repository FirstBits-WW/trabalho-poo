public class Refrigerante extends Produto{

    protected String sabor;
    protected String tamanho;

    public Refrigerante(String nomeProduto, String sabor, String tamanho) {
        super(nomeProduto);
        this.sabor = sabor;
        this.tamanho = tamanho;
    }


     @Override
    public double setValorProduto() {
        if("grande".equals(tamanho)){
       setValorProduto(20.00);}
       else if("medio".equals(tamanho)){
        setValorProduto(15.00);
       }
       else if ("pequeno".equals(tamanho)){
        setValorProduto(10.00);
       }
        return getValorProduto();
    }

    
}
