package client;

import com.tnsif.ApplicationPart.GSNormalAcc;
import com.tnsif.ApplicationPart.GSShopFactory;
import com.tnsif.ApplicationPart.GsPrimeAcc;

public class Client {
	
	public static void main(String args[]) {
		//step 1
		GSShopFactory gsft=new GSShopFactory();
		gsft.getNewPrimeAccount(123, "Akash Bhendekar", 4000.00f, true);
		gsft.getNewNormalAccount(213, "Akshay Dengale", 3443, 30);
		
		//step 2
	  
		GsPrimeAcc gspa=new GsPrimeAcc(123,"Akash",1000, false);
		gspa.bookProduct(1000);
		gspa.getAccNm();
		gspa.getAccNo();
		gspa.getCharges();
		gspa.toString();
		
		GSNormalAcc gsna=new GSNormalAcc(213,"Akshay", 1000, 50);
		gsna.bookProduct(1000);
		gsna.getAccNm();
		gsna.getAccNo();
		gsna.getDeliveryCharges();
		gsna.toString();
		
	}

}
