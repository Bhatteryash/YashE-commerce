package com.Shopping.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Shopping.Model.Address;
import com.Shopping.Model.Customer;
import com.Shopping.Model.Order;
import com.Shopping.Model.Payment;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

	public List<Order> findByCustomer(Customer customer);

	public List<Order> findByOrderAmount(Integer orderAmount);

	public List<Order> findByOrderAmountBetween(Integer s_orderAmount, Integer e_orderAmount);

	public List<Order> findByOrderAmountGreaterThanEqual(Integer orderAmount);

	public List<Order> findByOrderDate(LocalDate orderDate);

	public List<Order> findByOrderDateBetween(LocalDate s_orderDate, LocalDate e_orderDate);

	public List<Order> findByOrderDateGreaterThanEqual(LocalDate orderDate);

	public List<Order> findByOrderStatus(String orderStatus);

	public List<Order> findByPayment(Payment payment);

	public List<Order> findByShippingAddress(Address shippingAddress);
}
