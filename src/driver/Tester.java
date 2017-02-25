package driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.Assert;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import model.Employee;
import testcases.Junitcase1;
import testcases.TestSuites;


public class Tester {

	public static void main(String[] args) {
		
		
		Result ruuner = JUnitCore.runClasses(TestSuites.class);
		
		for(Failure f :ruuner.getFailures())
		{
			
			System.out.println("failure"+f.toString());
			
		}
		
		System.out.println(ruuner.wasSuccessful());
		
		
	}
	
	
	}
