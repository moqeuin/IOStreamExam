package fileStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class SequenceStreamExam {

	public static void main(String[] args) {
		
		byte[] arr1 = {0,1,2,3,4};
		byte[] arr2 = {5,6,7,8,9};
		byte[] arr3 = {11,12,13,14,15};
		byte[] byteArr = null;
		
		
		Vector<ByteArrayInputStream> vec = new Vector<ByteArrayInputStream>();
		
		vec.add(new ByteArrayInputStream(arr1));
		vec.add(new ByteArrayInputStream(arr2));
		vec.add(new ByteArrayInputStream(arr3));
		
		// 여러개의 스트림을 하나의 스트림으로 다룰 수 있다.
		SequenceInputStream sis = new SequenceInputStream(vec.elements());
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while((data=sis.read()) != -1) {
				
				bos.write(data);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		byteArr = bos.toByteArray();
		System.out.println(Arrays.toString(byteArr));
		// 새 개의 스트림을 모두 출력할 수 있다.
		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15]
		
		
		
	}

}
