package dao;

import java.util.ArrayList;

import dto.Restaurant;

public class RestaurantRepository {
	
	ArrayList<Restaurant> listOfProducts = new ArrayList<Restaurant>();
	private static RestaurantRepository instance = new RestaurantRepository();
	JDBC db;
	
	public static RestaurantRepository getInstance() {
		return instance;
	}
	
	public RestaurantRepository() {
		db = new JDBC();
	}
	
	//DB����
	
	//�����浵 �� �޾Ƽ� ����Ʈ ���
	
}
