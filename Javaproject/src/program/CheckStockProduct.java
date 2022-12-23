package program;
import java.util.*;
public class CheckStockProduct {
	static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		Product[] productList = new Product[sc.nextInt()];
		System.out.println();
		for(int j = 0;j<productList.length;j++) {
			productList[j] = new Product();
			System.out.print("Input product Id   : ");
			productList[j].setId(sc.next());
			System.out.print("Input product Unit : ");
			productList[j].Setunit(sc.nextInt());
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------");
		for(Product lowpro:productList) {
			if(lowpro.Getunit()<5) {
				System.out.println(">> "+lowpro.getId()+" has "+lowpro.Getunit()+" Units");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------");
		for(Product lowpro:productList) {
			if(lowpro.Getunit()>=5 && lowpro.Getunit()<=50) {
				System.out.println(">> "+lowpro.getId()+" has "+lowpro.Getunit()+" Units");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------");
		for(Product lowpro:productList) {
			if(lowpro.Getunit()>50) {
				System.out.println(">> "+lowpro.getId()+" has "+lowpro.Getunit()+" Units");
			}
		}


	}

	}


