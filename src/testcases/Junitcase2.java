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


public class Junitcase2 {
	
	@Test
	public void testID()
	{
		
		Employee emp = new Employee(11, "jp",35000.0f,"Punjab");
		Assert.assertEquals(11, emp.getId());
	
	}
	
}
