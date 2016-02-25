package br.com.inter.model;

public enum CorEnum {
	VERMELHO(1), AZUL(2), VERDE(4), AMARELO(5), CIANO(6), ROXO(3), BRANCO(7);
	private final int codigo;
	
	private CorEnum(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static CorEnum porCodigo(int codigo) {
		for (CorEnum cor : CorEnum.values()) {
			if (codigo == cor.codigo) {
				return cor;
			}
		}
		throw new RuntimeException("Código inválido!");
	}
	
	public static CorEnum combina(CorEnum cor1, CorEnum cor2) {
	    int combinado = cor1.getCodigo() | cor2.getCodigo();
	    return CorEnum.porCodigo(combinado);
	}
}
