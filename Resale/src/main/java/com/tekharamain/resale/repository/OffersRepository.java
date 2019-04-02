package com.tekharamain.resale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tekharamain.resale.entity.Offers;

@Repository
public interface OffersRepository extends JpaRepository<Offers, Long> {
	@Query(value ="SELECT o \n" +
            "FROM   Offers o \n" +
            "WHERE  o.product.id= :productId \n"
            )
	 List<Offers> getOfferByProductId(@Param("productId") Long productId);
}
