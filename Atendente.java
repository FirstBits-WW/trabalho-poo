public class Atendente extends Funcionario {

    protected int horasTrabalhadas;

    
    

    
    @Override
    public String toString() {
        return "Atendente:" + horasTrabalhadas + "\n nome:" + nome + "\n matricula=" + matricula
                + "\n idade:" + idade;
    }

    public Atendente(String nome, int matricula, int idade, int horasTrabalhadas) {
        super(nome, matricula, idade);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        double salario = (horasTrabalhadas*0.1) + salarioFixo;

        return salario;
    }


    
    

   

   



}
