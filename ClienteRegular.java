public class ClienteRegular extends Cliente{

    public ClienteRegular(String nome, Carrinho carrinho) {
        super(nome,carrinho);
    }

    @Override
    public double realizarCompra(){
        double total = 0;
        for(int i =0; i>carrinho.getCarrinho().size();i++ ){
                total += carrinho.getCarrinho().get(i).getValorProduto();
            
        }
        return total;
    }
}
