

public class ClienteVip extends Cliente{

    private boolean cartaoVip;

    public boolean isCartaoVip() {
        return cartaoVip;
    }

    public ClienteVip(String nome, Carrinho carrinho, boolean cartaoVip) {
        super(nome, carrinho);
        this.cartaoVip = cartaoVip;
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

    

   

    
    

    
    
   

    
    


   

