public abstract class Funcionario implements IFuncionario{
    protected String nome;
    protected int matricula;
    protected int idade;
    protected double salarioFixo;



    @Override
    public String toString() {
        return "Funcionario:" + nome + " \n matricula:" + matricula + "\n idade:" + idade + "\n salarioFixo:"
                + salarioFixo ;
    }

    public Funcionario(String nome, int matricula, int idade, double salarioFixo) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.salarioFixo = salarioFixo;
    }

    @Override
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    




}
