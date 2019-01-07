package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			//기반스트림(주스트림) - 표준입력(System.in)

			//보조스트림 1
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8");

			//보조스트림 2 ( char|char|char|....|\n -> "charcharchar")
			br = new BufferedReader(isr);

			//input
			String line = null;
			while((line = br.readLine()) != null) {
				if("exit".equals(line)) {
					break;
				}
				System.out.println(">> "+line);
			}
		} catch (IOException e) {
			System.out.println("Error : "+e);
		} finally {
			try {
				if(br != null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
