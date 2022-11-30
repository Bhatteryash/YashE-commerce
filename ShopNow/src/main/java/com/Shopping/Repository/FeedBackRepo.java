package com.Shopping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Shopping.Model.Customer;
import com.Shopping.Model.Feedback;

@Repository
public interface FeedBackRepo extends JpaRepository<Feedback, Integer>{

	public List<Feedback> findByCustomer(Customer customer);
}
