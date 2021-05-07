package org.main;

import java.io.IOException;

import org.pom.LoginPojo;
import org.utility.BaseClass;

public class PomClass extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		
		loadUrl("https://www.facebook.com/");
		
		LoginPojo l=new LoginPojo();
		
		readExcel(0, 0);
		
		fill(l.getTxtUserName(), readExcel(0, 0));
		
		fill(l.getTxtPass(), readExcel(1, 0));
		
		buttonClick(l.getTxtClick());
		
	}

}
