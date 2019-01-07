package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		Scanner scanner = null;

		try {
			File file = new File("phone.txt");
			//파일의 존재유무
			if(file.exists()==false) {
				System.out.println("File Not Found");
				return;
			}

			System.out.println("=========파일정보=========");
			System.out.println(file.getAbsolutePath());	//주소
			System.out.println(file.length()+"bytes");	//size
			//Date d = new Date(file.lastModified());
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
			//System.out.println(sdf.format(d));	//파일 생성 시간
			System.out.println(new SimpleDateFormat("yyyy-MM-DD hh:mm:ss").format(new Date(file.lastModified())));	//파일 생성 시간

			System.out.println("=========전화번호=========");
			scanner = new Scanner(file);

			while(scanner.hasNextLine()) {
				String name = scanner.next();
				String phone01 = scanner.next();
				String phone02 = scanner.next();
				String phone03 = scanner.next();
				
				System.out.println(name+": "+phone01+"-"+phone02+"-"+phone03);
			}
		} catch (IOException e){
			System.out.println("Error : "+e);
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
	}

}
