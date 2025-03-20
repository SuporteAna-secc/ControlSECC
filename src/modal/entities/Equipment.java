package modal.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Equipment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String type;
	private String mark;
	private Integer cod_serial;
	private Integer id;
	private String status;
	private LocalDate date;
	private String origin;
	
	public Equipment() {
		
	}

	public Equipment(String type, String mark, Integer cod_serial, Integer id, String status, LocalDate date, String origin) {
		this.type = type;
		this.mark = mark;
		this.cod_serial = cod_serial;
		this.id = id;
		this.status = status;
		this.date = date;
		this.origin = origin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Integer getCod_serial() {
		return cod_serial;
	}

	public Integer getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	// Pegando os dados do Equipamento	
	public void getEquipment() {
		
		Scanner sc = new Scanner(System.in);
	
		// Pegando os valores		
		System.out.print("Digite o tipo: ");
		this.type = sc.nextLine();
		System.out.print("Digite a marca: ");
		this.mark = sc.nextLine();
		System.out.print("Digite o código serial: ");
		this.cod_serial = sc.nextInt();
		System.out.print("Digite o ID: ");
		this.id = sc.nextInt();
		System.out.print("Digite o Status: ");
		this.status = sc.nextLine();
		sc.nextLine();
		System.out.print("Digite a origem: ");
		this.origin = sc.nextLine();
		System.out.print("Digite a data: ");
		this.date = LocalDate.parse(sc.next(), fmt);
		
		
		// Exibindo os valores 		
		displayEquipmentText(type, "Tipo");
		displayEquipmentText(mark, "Marca");
		displayEquipmentInt(cod_serial, "Código Serial");
		displayEquipmentInt(id, "ID");
		displayEquipmentText(status, "Status");
		displayEquipmentText(origin, "Origen");
		displayEquipmentDate(date, "Data");
		
		sc.close();
	}
	
// TESTE DE EXIBIÇÃO DOS VALORES
	// Exibindo valores tipos Texto
	public void displayEquipmentText(String valor, String text) {
		System.out.print("O " + text + " é: " + valor + "\n");
	}
	
	// Exibindo valores tipo Inteiro 	
	public void displayEquipmentInt(Integer valor, String text) {
		System.out.print("O " + text + " é: " + valor + "\n");
	}
	
	// Exibindo valores tipo Data	
	public void displayEquipmentDate(LocalDate valor, String text) {
		System.out.print("O " + text + " é: " + valor.format(fmt) + "\n");
	}

	
}
