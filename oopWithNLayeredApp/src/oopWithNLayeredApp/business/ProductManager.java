package oopWithNLayeredApp.business;

import java.lang.System.Logger;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers; //   Logger[] ---> List<Logger>
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { //productManager newlendiğinde ProductDao ver.
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		
		//iş kuralları aynı kimliğe sahip iki kişinin olmaması gibi
		
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) { // [db,mail] logları sıra ile çalışıyor.
			logger.log(product.getName());
		}
		}
		
}