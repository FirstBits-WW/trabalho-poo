
import java.time.LocalDateTime;

public class Sessao {
    private int numeroDeAcentos;
    private LocalDateTime horarioComeca;
    private LocalDateTime horarioTermina;

    public Sessao(int numeroDeAcentos, LocalDateTime horarioComeca, LocalDateTime horarioTermina) {
        this.numeroDeAcentos = numeroDeAcentos;
        this.horarioComeca = horarioComeca;
        this.horarioTermina = horarioTermina;
    }
    

    public Sessao(int numeroDeAcentos) {
        this.numeroDeAcentos = numeroDeAcentos;
        horarioComeca = LocalDateTime.of(2035, 10, 30, 12, 00);
        horarioTermina = LocalDateTime.of(2035, 10, 30, 13, 00);
    }


    public LocalDateTime getHorarioComeca() {
        return horarioComeca;
    }

    public LocalDateTime getHorarioTermina() {
        return horarioTermina;
    }

    public void tiraUm() {
        numeroDeAcentos -= 1;
    }

    public int getNumeroDeAcentos() {
        return numeroDeAcentos;
    }
}
