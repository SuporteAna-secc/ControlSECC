package modal.entities;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class Maintenance {

//	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate date;
	private Integer id;
	private Integer id_equipment;
	private Integer id_support;
	
	public Maintenance(LocalDate date, Integer id, Integer id_equipment, Integer id_support) {
		super();
		this.date = date;
		this.id = id;
		this.id_equipment = id_equipment;
		this.id_support = id_support;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public Integer getId_equipment() {
		return id_equipment;
	}


	public Integer getId_support() {
		return id_support;
	}

	
}
