package application;

import java.util.Scanner;
import modal.dao.DaoFactory;
import modal.dao.EquipmentDao;



public class Main {

	public static void main(String[] args) {
	

		 Scanner sc = new Scanner(System.in);
		 
		 EquipmentDao equipmentDao = DaoFactory.createEquipmentDao();
		 
		 	
		 // Deletando 	 		 	
			System.out.println("\n==== Equipamento delete =====");
			System.out.println("Insira o ID: ");
			int id = sc.nextInt();
			equipmentDao.deleteById(id);
			System.out.println("Deletado com sucesso!");
	 		
			
			sc.close();
	}

}
