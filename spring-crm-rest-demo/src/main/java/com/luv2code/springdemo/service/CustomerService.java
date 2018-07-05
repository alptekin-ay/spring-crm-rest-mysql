package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.HesapHareketi;
import com.luv2code.springdemo.entity.Kampanya;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	public Customer getCustomer(String userName, String password);
	
	public Customer getCustomer(String userName);

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
//----------------------------KAMPANYALAR------------------------------

	public List<Kampanya> getKampanyalar();

	public void saveKampanya(Kampanya kampanya);

	public Kampanya getKampanya(int kampanyaId);

	public void deleteKampanya(int kampanyaId);
//----------------------------RESTORANLAR------------------------------

	
	
	
	
//----------------------------HesapHareketleri------------------------------
	public List<HesapHareketi> getHesapHareketleri();

	public void saveHesapHareketi(HesapHareketi hesapHareketi);

	public HesapHareketi getHesapHareketi(int hesapHareketiId);

	public void deleteHesapHareketi(int hesapHareketiId);
	
}
