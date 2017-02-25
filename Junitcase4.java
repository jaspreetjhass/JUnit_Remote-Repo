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


public class Junitcase4 {
	
	@Test
	public void testCity()
	{
		
		Employee emp = new Employee(11, "jp",35000.0f,"New Delhi");
		Assert.assertEquals("New Delhi", emp.getCity());
	
	}
	
}
