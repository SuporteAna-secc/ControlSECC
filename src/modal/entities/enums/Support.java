package modal.entities.enums;

public enum Support {
	JANSEN(1),
	IGOR(2),
	ANA_BEATRIZ(3);
	
	private int code;

	private Support(int code) {
		this.code = code;
	}
	
	
	public int getCode() {
		return code;
	}

	public static Support valueOf(int code) {
		for (Support value : Support.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Código do Suporte Invalido");
	}

}
