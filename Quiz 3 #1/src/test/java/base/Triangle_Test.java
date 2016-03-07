package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("unused")
public class Triangle_Test {

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}
		
		@Test
		public void test_Area_args() {
		Triangle total = new Triangle(4,5,6);
		double x = total.getArea();
		assertTrue(x == 9.921567416492215);
		}
		
		@Test
		public void test_Perimeter_args() {
		Triangle total = new Triangle(4,5,6);
		double x = total.getPerimeter();
		assertTrue(x == 15.0);
		}
		
		@Test
		public void test_Area_noargs() {
		Triangle total = new Triangle();
		double x = total.getArea();
		assertTrue(x == 0.4330127018922193);
		}
		
		@Test
		public void test_Perimeter_noargs() {
		Triangle total = new Triangle();
		double x = total.getPerimeter();
		assertTrue(x == 3);
		}
		
}