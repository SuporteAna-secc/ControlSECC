package modal.entities;


public class Equipment {
	
	
	private Integer type;
	private Integer cod_serial;
	private String model;
	private Integer id;
	private Integer status;
	private String origin;
	
	public Equipment() {
		
	}

	public Equipment(Integer type, Integer cod_serial, String model, Integer id, Integer status, String origin) {
		this.type = type;
		this.cod_serial = cod_serial;
		this.model = model;
		this.id = id;
		this.status = status;
		this.origin = origin;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCod_serial() {
		return cod_serial;
	}

	public void setCod_serial(Integer cod_serial) {
		this.cod_serial = cod_serial;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
}
