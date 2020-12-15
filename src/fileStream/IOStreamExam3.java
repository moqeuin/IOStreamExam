package fileStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOStreamExam3 {
	
	public static void main(String[] args) {
		
		// 입력스트림의 read()는 덮어씌우는 형식으로 데이터를 입력하기 때문에
		// 기존에 데이터가 남는 문제가 발생할 수 있다. 그래서 읽어온 데이터의 길이만큼만
		// 데이터를 가져오면 문제를 해결할 수 있다.
		// input.read()는 읽어온 데이터의 크기를 반환한다.
		// 입력스트림의 데이터는 길이만큼만 데이터를 가져오는 중간과정이 필요하다.
		
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output =null;
		
		input = new ByteArrayInputStream(inSrc);
		// 매개변수가 없으므로 스트림에 저장된다.
		output = new ByteArrayOutputStream();
		
		while( input.available() > 0 ) {
			
			try {
				
				// temp는 4개씩 바이트를 읽는다. 읽을때마다 기존의 데이터 위에 덮어씌운다.
				//input.read(temp);
				
				int len = input.read(temp);
				
				// write는 기존에 데이터에다가 데이터를 추가한다.
				//output.write(temp);
				
				// input에서 읽어온 길이만큼만 스트림으로 출력한다.
				output.write(temp,0,len);
				
				// 스트림에서 읽어올 때마다 스트림 내에 데이터를 소모시켜서 데이터의 크기가 줄어든다.
				System.out.println(input.available());
				
				outSrc = output.toByteArray();
				
				BytePrint(temp, outSrc);
				// 마지막에 1,2,3,4,5,6,7,8,9,6,7이 출력되는 이유는  temp에서  8,9만 덮어씌우고 나머지 데이터는 남아서 8,9,6,7을 추가됐기 때문이다.
			} catch (IOException e) {
				
				e.printStackTrace();
			}			
		}	
	}// main
	
	public static void BytePrint( byte[] temp, byte[] outSrc ) {
		
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("outSrc : " + Arrays.toString(outSrc));
	}
}
