package application;

import java.util.Scanner;
import modal.dao.DaoFactory;
import modal.dao.EquipmentDao;
import modal.entities.Equipment;



public class Main {

	public static void main(String[] args) {
	

		 Scanner sc = new Scanner(System.in);
		 
		 EquipmentDao equipmentDao = DaoFactory.createEquipmentDao();
		 
		 	
		 // Inserindo os dados 	 		 	
	 		System.out.print("Digite o tipo: ");
	 		int type = sc.nextInt();
	 		System.out.print("Digite o código serial: ");
	 		int cod_serial = sc.nextInt();
	 		System.out.print("Digite o Status: ");
	 		int status = sc.nextInt();
	 		System.out.print("Digite a origem: ");
	 		String origin = sc.nextLine();
	 		sc.nextLine();
	 		System.out.print("Digite a modelo: ");
	 		String modal = sc.nextLine();
	 		
			System.out.println("=== Equipment insert =====");
			Equipment newEqupment = new Equipment(type, cod_serial, modal, null, status, origin);
			equipmentDao.insert(newEqupment);
			System.out.println("Inserted! New id = " + newEqupment.getId());
			
			sc.close();
	}

}
