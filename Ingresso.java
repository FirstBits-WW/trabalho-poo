
import java.time.LocalDateTime;



public class Ingresso {
 public static double valorIngresso;

 public void venderIngresso(Sessao sessao,Funcionario funcionario) throws SessaoComecouException {
    if(sessao.getNumeroDeAcentos()>0){
        if(sessao.getHorarioComeca().isBefore(LocalDateTime.now()) == false){
        sessao.tiraUm();
        if(funcionario instanceof Gerente){
            valorIngresso *= (1-0.35); 

        }
        else if (funcionario instanceof Atendente){
            valorIngresso *= (1-0.2);
        }
    }
   else{
    throw new SessaoComecouException("Voce esta atrasado!!");
    }
    }
    else{throw new SalaLotadaExcepition("esta sessao esta indisponivel");
}
 }

 public void venderIngresso(Sessao sessao,Cliente cliente)throws SalaLotadaExcepition{
    if(sessao.getNumeroDeAcentos()>0){
        if(sessao.getHorarioComeca().isBefore(LocalDateTime.now()) == false){
        sessao.tiraUm();
        if(cliente instanceof ClienteVip){
            valorIngresso *= (1-0.25); 

        }
        else if (cliente instanceof ClienteRegular){
            //valorIngresso = valorIngresso;
        }
    }
 else{
    throw new SessaoComecouException("Voce esta atrasado!!");
}
}
    else{throw new SalaLotadaExcepition("esta sessao esta indisponivel");
}
 }

public static double getValorIngresso() {
    return valorIngresso;
}

}
