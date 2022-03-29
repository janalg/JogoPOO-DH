package jogoPOO;

public class ArmaDois implements Armas {
	public static final int qtdMunicao = 10;
	public static final float tempoRecarregar = 5.7f;
	@Override
	public void atirar() {
		System.out.println("Quantidade de munição Arma02: " + qtdMunicao);
	}

	@Override
	public void recarregar() {
		System.out.println("Tempo para recarregar Arma02: " + tempoRecarregar + "s");
	}
}
