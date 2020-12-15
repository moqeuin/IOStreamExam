package fileStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamExam {

	public static void main(String[] args) {
		
		// 버퍼스트림은 입출력 중간에 버퍼를 둬서 데이터를 저장해서 여러 바이트를 입출력시키는 역할은 한다.
		// 여러 바이트를 입출력하기 때문에 빠른 입출력이 가능하다.
		// 출력스트림에 경우 버퍼가 가득찰 때 출력을 해서 마지막에서 버퍼가 가득차지 않은 경우에는 flush()나 close() 나머지 데이터를 출력해야한다.
		
		 
		try {
			
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			
			// 정보를 해석할 때 1바이트를 받아서 해석한다.
			// 숫자, 영문 등의 데이터를 프로그램에게 보낼 때 아스키코드를 반영해서  보내야한다.
			for (int i = '1'; i < '9'; i++) {
					System.out.println(i);
					System.out.println("이진수"+Integer.toBinaryString(15));
					// 그냥 1를 보내면 0000 0001을 보내게 된다.
					bos.write(i);		
			}
			bos.close();
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
