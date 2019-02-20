package ForTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Mypackage.shoppingcart;

public class FirstTest {

	@Test
	public void test1() {
		shoppingcart sc = new shoppingcart();
		assertTrue(0 == sc.get_product_count());
		}
	@Test
	public void test2() {
		shoppingcart test = new shoppingcart();
		test.add_book(1,"Java Book",127);//add_book(amount,name,price) for one book
		assertTrue(1 == test.get_product_count());
		assertTrue(127 == test.get_total_value());
		}
	@Test
	public void test3() {
		shoppingcart test = new shoppingcart();
		test.add_book(1,"Java Book",127);//add_book(amount,name,price) for one book
		test.add_book(1,"Web design Book",100);//add_book(amount,name,price) for one book
		assertTrue(2 == test.get_product_count());
		assertTrue(227 == test.get_total_value());
		}

}
