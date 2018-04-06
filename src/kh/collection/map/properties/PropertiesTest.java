package kh.collection.map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * HashTable의 자식클래스임
 * K,V의 타입으로 Object, Object가 아닌
 * String, String타입만 사용 가능한 클래스
 * 애플리케이션 환경설정, 관련 속성등을 읽고 쓰는데 최적화 되있음
 */
public class PropertiesTest {

	public static void main(String[] args) {
		PropertiesTest p = new PropertiesTest();
		//p.write();
		p.read();
	}

	
	
	private void read() {
		Properties prop = new Properties();
		// 파일 읽어오기
		try {
			prop.load(new FileInputStream("user.properties"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String userName = prop.getProperty("userName");
		String userId = prop.getProperty("userId");
		String userPhone = prop.getProperty("userPhone");
	
		// 출력
		System.out.println("userName="+userName);
		System.out.println("userId="+userId);
		System.out.println("userPhone"+userPhone);
	}



	private void write() {
		Properties prop = new Properties();
		prop.setProperty("userName", "김종민");
		prop.setProperty("userPhone", "01012345678");
		prop.setProperty("userId", "kjm");
		try {
			prop.store(new FileOutputStream("user.properties"), "user Info");
			prop.storeToXML(new FileOutputStream("user.xml"), "user Info");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop);
	}

}
