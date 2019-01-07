package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		FileInputStream fis = null;

		try {
			//기반 스트림(주스트림)
			fis = new FileInputStream("ms949.txt");

			//보조스트림
			isr = new InputStreamReader(fis,"MS949");

			//input
			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : "+e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported Encoding : "+e);
		} catch (IOException e) {
			System.out.println("Error : "+e);
		} finally {
			try {
				if(isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}



	}

}
