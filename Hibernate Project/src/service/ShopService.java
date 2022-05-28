package service;

import entities.Shop;

public interface ShopService {

	public abstract Shop addShop(Shop shop);
	                
	public abstract Shop updateShop(Shop shop);
	                
	public abstract Shop searchShopById(int Id);
	               
	public abstract Shop deleteShop(Shop shop);
	              
}
