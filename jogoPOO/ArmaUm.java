package jogoPOO;

public class ArmaUm implements Armas{
	public static final int qtdMunicao = 25;
	public static final float tempoRecarregar = 3.6f;
	@Override
	public void atirar() {
		System.out.println("Quantidade de munição Arma01: " + qtdMunicao);
	}

	@Override
	public void recarregar() {
		System.out.println("Tempo para recarregar Arma01: " + tempoRecarregar + "s");
	}
	
}
