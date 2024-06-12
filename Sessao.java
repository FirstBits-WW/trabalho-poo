
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
