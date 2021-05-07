package org.main;

import java.io.IOException;

import org.pom.LoginPojoBYsAll;
import org.utility.BaseClass;

public class POMBysAll extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
	
		loadUrl("https://www.facebook.com/");
		
		LoginPojoBYsAll l= new LoginPojoBYsAll();
		
		fill(l.getTxtUserName().get(0), readExcel(0, 0));
		
		fill(l.getTxtPass().get(0), readExcel(1, 0));
		
		buttonClick(l.getTxtLogin());
		
		
	}

}
