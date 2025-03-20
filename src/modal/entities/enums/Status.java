package modal.entities.enums;

public enum Status {
	MANUTENCAO(11),
	CONCERTADO(22),
	NOVO(33);
	
	private int code;

	private Status(int code) {
		this.code = code;
	}
	
	
	public int getCode() {
		return code;
	}

	public static Status valueOf(int code) {
		for (Status value : Status.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Código do Status Invalido");
	}
}
