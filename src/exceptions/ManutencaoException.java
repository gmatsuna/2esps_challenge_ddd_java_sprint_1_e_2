package exceptions;

public class ManutencaoException extends RuntimeException{
    public ManutencaoException(String mensagem){
        super(mensagem);
    }
}
