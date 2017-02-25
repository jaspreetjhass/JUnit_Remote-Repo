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


public class Junitcase3 {
	
	@Test
	public void testSalary()
	{
		
		Employee emp = new Employee(11, "jp",35000.0f,"Haryana");
		Assert.assertEquals(45000f, emp.getSalary());
	
	}
	
}
