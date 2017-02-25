package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestResult;
import model.Employee;


public class Junitcase1 extends TestResult{

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
	
	@Test
	public void testCase1()
	{
		
		Employee emp = new Employee(11, "jp");
		Assert.assertEquals("jp", emp.getName());
		System.out.println("testcase1");
		TestCase tc =  new Junitcase2();
		
		this.run(tc);
	
		
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
