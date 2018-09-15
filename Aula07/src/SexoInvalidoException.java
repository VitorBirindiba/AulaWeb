
public class SexoInvalidoException extends Exception{
	public SexoInvalidoException() {
		super("Sexo inválido");
	}
	
	public SexoInvalidoException( String mensagem ) {
		super (mensagem);
	}


}
