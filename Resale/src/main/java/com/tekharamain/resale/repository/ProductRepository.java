package com.tekharamain.resale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tekharamain.resale.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value ="SELECT p \n" +
            "FROM   Product p \n" +
            "WHERE  p.user.id= :userId \n"
            )
	 List<Product> getProductByUserId(@Param("userId") Long userId);

	
	@Query(value ="SELECT p \n" +
            "FROM   Product p \n" +
            "WHERE  p.category = :category AND p.user.city = :city \n"
            )
	List<Product> getProductByCategory(@Param("category") String category, @Param("city") String city);
	
}
