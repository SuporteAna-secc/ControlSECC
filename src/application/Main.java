package application;

import java.util.Scanner;
import modal.dao.DaoFactory;
import modal.dao.EquipmentDao;
import modal.entities.Equipment;



public class Main {

	public static void main(String[] args) {
	

		 Scanner sc = new Scanner(System.in);
		 
		 EquipmentDao equipmentDao = DaoFactory.createEquipmentDao();
		 
		 	
		 System.out.print("Qual das opções seria: \nEquipamento - [1]\nManutenção - [2]\nSaída - [3]\nResposta: ");
		 int r = sc.nextInt();
		 
		 if(r == 1) {
			 System.out.print("Qual das opções: \nInserir - [1]\nDeletar - [2]\nResposta:");
			 int result = sc.nextInt();
			 if (result == 1) {
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
			 		
					Equipment newEqupment = new Equipment(type, cod_serial, modal, null, status, origin);
					equipmentDao.insert(newEqupment);
					System.out.println("Inserido! Novo id = " + newEqupment.getId());
			}
			 else if (result == 2) {
		 			System.out.println("Insira o ID: ");
		 			int id = sc.nextInt();
		 			equipmentDao.deleteById(id);
		 			System.out.println("Deletado com sucesso!");
			}
		 }
		 
		 sc.close();
	}

}
