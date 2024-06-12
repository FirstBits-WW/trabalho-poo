public class Pipoca extends Produto{

    protected String tamanho;
    protected String sabor;


   


    public Pipoca(String nomeProduto, String tamanho, String sabor) {
        super(nomeProduto);
        this.tamanho = tamanho;
        this.sabor = sabor;
    }





    @Override
    public double setValorProduto() {
        if("grande".equals(tamanho)){
       setValorProduto(30.00);}
       else if("medio".equals(tamanho)){
        setValorProduto(25.00);
       }
       else if ("pequeno".equals(tamanho)){
        setValorProduto(20.00);
       }
        return getValorProduto();
    }

    

    


}
