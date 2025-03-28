package modal.dao;

import db.DB;
import modal.dao.impl.EquipmentDaoJDBC;

public class DaoFactory {

	public static EquipmentDao createEquipmentDao() {
		return new EquipmentDaoJDBC(DB.getConnection());
	}
}
