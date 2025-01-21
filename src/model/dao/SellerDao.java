package model.dao;

import java.util.List;

import model.entities.Seller;

	public interface SellerDao {
		void insert(Seller obj);
		void update(Seller obj);
		void delete(Seller obj);
		Seller findById(Integer id);
		//retorna todos seller
		List<Seller> findAll();
			
		}

