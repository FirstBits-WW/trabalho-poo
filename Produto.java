public abstract class Produto implements IProduto{
 private String nomeProduto;
 private Double valorProduto;




public Produto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
}




@Override
 public abstract double setValorProduto();

@Override
public String toString() {
    return "Produto:" + nomeProduto + "\n valorProduto:" + valorProduto + "";
}




public String getNomeProduto() {
    return nomeProduto;
}




public Double getValorProduto() {
    return valorProduto;
}




public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
}




public void setValorProduto(Double valorProduto) {
    this.valorProduto = valorProduto;
}


 
}
