package model.dao;

import java.util.List;

import model.entities.Seller;

public class SellerDao {
	public interface DepartmentDao {
		void insert(Seller obj);
		void update(Seller obj);
		void delete(Seller obj);
		Seller findById(Integer id);
		//retorna todos seller
		List<Seller> findAll();
			
		}
}
