package org.secondpracticepom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

public class POMMain extends BaseClass {

	public static void main(String[] args) throws Exception {

		launchBrowser();

		loadUrl("https://www.facebook.com/");

		POM1 pom = new POM1();

		String user = readExcel(0, 0);

		fill(pom.getTxtUser().get(0), user);

		String pas = readExcel(1, 0);

		fill(pom.getTxtPass().get(0), pas);

		buttonClick(pom.getTxtLogin());

	}

}
