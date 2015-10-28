package com.hybrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogTest {

	static Log log = LogFactory.getLog(CommonsLogTest.class);
	
	public static void main(String[] args) {
		String url = "http://ws.bus.go.kr/api/rest/busRouteInfo/getBusRouteList?strSrch=6628&ServiceKey=AaxqTg02PVW%2BZhaIkh4fVAIiknK6EU6ZkfT1lQEHEo2PRlldpzfhjoBwE63YKQGpiY4JdZCjCktTW2yatRX%2FgA%3D%3D";
		
		try {
			URL u = new URL(url);
			
			InputStream in = u.openStream();		//한줄씩 읽기때문에
			Reader r = new InputStreamReader(in);   //리더를 선언해서
			BufferedReader reader = new BufferedReader(r);  // 버퍼드 리더로 변환
			
			String line = null;
			while((line = reader.readLine()) != null){
				
				log.info(line);
							
			}
			
			reader.close();
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test1() {
		log.info("Hello Commons Logging");
		
		for (int i=0; i<10; i++){
			log.info("i = " + i);
			
		}
	}

}
