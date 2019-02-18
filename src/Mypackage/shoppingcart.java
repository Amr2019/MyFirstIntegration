package Mypackage;
import java.util.ArrayList;
public class shoppingcart {
	ArrayList<Integer> All_amount = new ArrayList<Integer>() ;
	ArrayList<String> All_name = new ArrayList<String>();
	ArrayList<Integer> All_price = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int get_product_count() {
		if(All_amount.size() == 0) return 0 ;
		else {
			int count = 0 ;
			for(Integer item : All_amount) {
				count += item ;
			}
			return count ;
		}
		}

	public void delete() {System.gc();}

	public void add_book(int amount, String name, int price) {
		All_amount.add(amount);
		All_name.add(name);
		All_price.add(price);
	}

	public int get_total_value() {
		int count = 0 ;
		for(Integer item : All_price) {
			count += item ;
		}
		return count ;
	}


}
