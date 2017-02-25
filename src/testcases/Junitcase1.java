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


public class Junitcase1{

	
	
	@Test
	public void testName()
	{
		
		Employee emp = new Employee(11, "jp",35000.0f);
		System.out.println("testcase1");
		Assert.assertEquals("jp", emp.getName());
		
	
		
	}

	
}
