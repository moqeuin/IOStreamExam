package fileStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOStreamExam2 {

	public static void main(String[] args) {
		
		// read, write 매개변수 활용
		
		byte[] inSrc = {4,2,3,7,8,1};
		byte[] outSrc = null;
		byte[] temp = new byte[6];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output =null;
		
		input = new ByteArrayInputStream(inSrc);
		// 매개변수가 없으므로 스트림에 저장된다.
		output = new ByteArrayOutputStream();
		
		// 입력할 곳을 매개변수로 지정가능.
		input.read(temp, 0, temp.length);
		// 데이터를 가져올 곳을 지정할 수 있다.
		output.write(temp,2,4);
		
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(outSrc));
		
		
		

	}

}
