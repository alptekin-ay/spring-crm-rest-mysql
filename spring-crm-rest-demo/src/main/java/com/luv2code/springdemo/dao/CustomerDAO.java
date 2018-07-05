package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.HesapHareketi;
import com.luv2code.springdemo.entity.Kampanya;

@Transactional
@EnableTransactionManagement
public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public Customer getCustomer(String userName, String password);
	
	public Customer getCustomer(String userName);

	//----------------Kampanyalar---------------
	
	public List<Kampanya> getKampanyalar();

	public void saveKampanya(Kampanya kampanya);

	public Kampanya getKampanya(int kampanyaId);

	public void deleteKampanya(int kampanyaId);

	//-----------------------RESTORANLAR------------------------

	
	//-----------------------HESAP HAREKETLER�------------------
	
	public List<HesapHareketi> getHesapHareketleri();

	public void saveHesapHareketi(HesapHareketi hesapHareketi);

	public HesapHareketi getHesapHareketi(int hesapHareketiId);

	public void deleteHesapHareketi(int hesapHareketiId);
	
	
}
