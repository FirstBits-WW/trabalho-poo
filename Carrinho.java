import java.util.ArrayList;

public  class Carrinho {
ArrayList<Produto> Carrinho;


public Carrinho() {
    this.Carrinho = new ArrayList<Produto>();
}

public  void adicionarProduto(Produto produto) throws ProdutoInvalidoException {
    if (produto == null){
        throw new ProdutoInvalidoException("Este produto não é válido!");
    }
    else{
        Carrinho.add(produto);
    }

    
}

public ArrayList<Produto> getCarrinho() {
    return Carrinho;
}

@Override
public String toString() {
    return "[Carrinho=" + Carrinho + "]";

}
public double valorDoCarrinho() {
    double valorTotal = 0;
    for (Produto produto : Carrinho) {
        valorTotal += produto.getValorProduto();
        
    }
    return valorTotal;
}
public void esvaziarCarrinho() {
    Carrinho.clear();
}


}
