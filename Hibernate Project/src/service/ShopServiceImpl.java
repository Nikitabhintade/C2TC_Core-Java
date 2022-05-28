package service;

import dao.ShopDao;
import dao.ShopDaoImpl;
import entities.Shop;


public class ShopServiceImpl implements ShopService {
	private ShopDao Dao;
	public ShopServiceImpl ()
	{
		Dao = new ShopDaoImpl();
	}
	@Override
	public Shop addShop(Shop shop) {
		Dao.beginTransaction();
		Dao.addShop(shop);
		Dao.commitTransaction();
		return shop;
	}
	@Override
	public Shop updateShop(Shop shop) {
		Dao.beginTransaction();
		Dao.updateShop(shop);
		Dao.commitTransaction();
		return shop;
	}
	@Override
	public Shop searchShopById(int Id) {
		Shop shop = Dao.searchShopById(Id);
		return shop;
	}
	@Override
	public Shop deleteShop(Shop shop) {
		Dao.beginTransaction();
		Dao.deleteShop(shop);
		Dao.commitTransaction();
		return shop;
	}
}