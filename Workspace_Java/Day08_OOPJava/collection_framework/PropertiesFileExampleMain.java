package collection_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFrame;

public class PropertiesFileExampleMain {

	public static void main(String[] args) {
		Properties windProps=new Properties();
		String filePath="./src/resources/window.properties";
		try(
				FileInputStream fin= new FileInputStream(filePath);
				){
			windProps.load(fin);
			String title=windProps.getProperty("window.title");
			String width=windProps.getProperty("window.width");
			String height=windProps.getProperty("window.height");
			System.out.println(title);
			System.out.println(width);
			System.out.println(height);
			int wt=Integer.parseInt(width);
			int ht=Integer.parseInt(height);
			JFrame appFrame= new JFrame();
			appFrame.setTitle(title);
			appFrame.setSize(wt, ht);
			appFrame.setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
