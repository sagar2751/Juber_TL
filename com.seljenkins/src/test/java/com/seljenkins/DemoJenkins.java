package com.seljenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoJenkins 
{
	@Test
	public void launch()
	{
		Reporter.log("This is my first Jenkins project");
	}

}
