package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	
	public void add(Product product) { //Burada parametre vermemizin sebebi al bu ürünü ekle demek
		
		//sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veritabanına eklendi.");
		
	}

}


