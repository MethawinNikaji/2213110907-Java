
package program;
import java.util.*;
import java.text.*;

public class Testproduct {
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat frm = new DecimalFormat("#,###.00");
	public static void main(String[] args) {
		Product[] productList = new Product[4];
      for(int j = 0;j<productList.length;j++) {
    	  System.out.print("How many product list in stock? : ");
  		productList[j].Setunit(sc.nextInt());
  		
  		System.out.print("Input product unit : ");
  		productList[j].Setunit(sc.nextInt());
  		while(!(productList[j].Getunit()>0)) {
  			
  			System.out.print("Input product unit : ");
  			productList[j].setId(sc.next());
  			
  			System.out.print("Input product price : ");
  			productList[j].Setprice(sc.nextDouble());
  			while(!(productList[j].getPrice()>0)){
  				System.out.print("Input product price : ");
  	  			productList[j].Setprice(sc.nextDouble());
  			}
  			
  		}
  		
		}
      System.out.println("===========================================");
      double sum =0;
      for(Product _productList:productList) {
    	  System.out.println("Product ID : "+_productList.getId()+
					"Total Price = " + frm.format(_productList.Calculate())+" baht.");
			sum += _productList.Calculate();

		}
      System.out.println("---------------------------------");
		System.out.println("Total price of all product is "+frm.format(sum)+" baht.");
      }
		

	}


