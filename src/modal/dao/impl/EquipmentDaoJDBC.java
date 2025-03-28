package modal.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import modal.dao.EquipmentDao;
import modal.entities.Equipment;

public class EquipmentDaoJDBC implements EquipmentDao {
	
	private Connection conn;

	public EquipmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	
	// Inserindo 
	@Override
	public void insert(Equipment obj) {
		
		PreparedStatement st = null;
		try {
			
			st = conn.prepareStatement("insert into equipment (cod_serial, origin, cod_status, cod_type, model) values(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			st.setInt(1, obj.getCod_serial());
			st.setString(2, obj.getOrigin());
			st.setInt(3, obj.getStatus());
			st.setInt(4, obj.getType());
			st.setString(5, obj.getModel());
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Unexpected error! No rows affected!");
			}
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void update(Equipment obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Equipment findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equipment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
