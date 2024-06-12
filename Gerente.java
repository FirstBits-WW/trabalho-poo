import java.time.LocalDateTime;
import java.util.ArrayList;

public class Gerente extends Funcionario {
    private ArrayList<Atendente> atendentes;

  


    public Gerente(ArrayList<Atendente> atendentes, String nome, int matricula, int idade) {
        super(nome, matricula, idade);
        this.atendentes = atendentes;
    }



    @Override
    public double calcularSalario() {
        double salario = 0;
        for (Atendente atendente : atendentes) {
            salario = (atendente.horasTrabalhadas) * 0.05;
            salario += salarioFixo;
        }

        return salario;
         }

    

    public void iniciarSessao(Sessao sessao){
        if(LocalDateTime.now().equals(sessao.getHorarioComeca())){
            System.out.println("a sessao comecou!");
        }
    }

    public ArrayList<Atendente> getAtendentes() {
        return atendentes;
    }



    public void setAtendentes(ArrayList<Atendente> atendentes) {
        this.atendentes = atendentes;
    }

   

}
