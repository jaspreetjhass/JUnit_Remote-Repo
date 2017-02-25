package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
import model.Employee;


public class Junitcase2 extends TestCase{

	@BeforeClass
	public static void init()
	{
	
		System.out.println("before class");
		
	}
	
	@Before
	public void initbefore()
	{
	
		System.out.println("init before class");
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testCase2()
	{
		
		Employee emp = new Employee(11, "jp");
		Assert.assertEquals(11, emp.getId());
		System.out.println("testacase2");
		Assert.assertEquals(11, emp.getId());
		System.out.println("testacase2 dobara");
		throw new NullPointerException("hello");
	}
	
	@AfterClass
	public static void destroy()
	{
		
		System.out.println("after class");
		
	}
	
	@After
	public void destroyafter()
	{
		
		System.out.println("destroy after class");
		
	}
	
}
