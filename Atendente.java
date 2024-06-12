public class Atendente extends Funcionario {

    protected double horasTrabalhadas;

    
    

    
    @Override
    public String toString() {
        return "Atendente:" + horasTrabalhadas + "\n nome:" + nome + "\n matricula=" + matricula
                + "\n idade:" + idade;
    }

    public Atendente(String nome, int matricula, int idade, double horasTrabalhadas, double salarioFixo) {
        super(nome, matricula, idade, salarioFixo);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        double salario = (horasTrabalhadas*0.1) + salarioFixo;

        return salario;
    }


    
    

   

   



}
