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
	
	shoppingcart test ;
	@Before
	public void setUp()  {
	test = new shoppingcart();
	}
	@Test
	public void test2() {
		test.add_book(1,"Java Book",127);//add_book(amount,name,price) for one book
		assertTrue(1 == test.get_product_count());
		assertTrue(127 == test.get_total_value());
		}
	@After
	public void tearDown() {
		test.delete();
	}
	@Test
	public void test3() {
		test = new shoppingcart();
		test.add_book(1,"Java Book",127);//add_book(amount,name,price) for one book
		test.add_book(1,"Web design Book",100);//add_book(amount,name,price) for one book
		assertTrue(2 == test.get_product_count());
		assertTrue(227 == test.get_total_value());
		}

}
