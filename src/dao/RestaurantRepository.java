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
		//DB����
		db = new JDBC();
	}
	
	
	//�����浵 �� �޾Ƽ� ����Ʈ ���
	public Restaurant[] getRestaurant(String name,float latitude, float longitude) {
		Restaurant a = new Restaurant(id, state, city, name, streetName, detailAddr, category, phoneNumber, zipCode, latitude, longitude, imagePath);
		
		//db���� ������ ī�װ����� ��Ʈ�� ����
		
		//���� �浵 �ؼ� ������ġ �� �ִ°͸� ����Ʈ�� ���� 
		
		
	}
}
