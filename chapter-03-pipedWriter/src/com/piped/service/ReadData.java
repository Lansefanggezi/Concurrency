package com.piped.service;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {

	public void ReadMethod(PipedReader input)
	{
		try {
			System.out.println("reader:");
			char[] byteArray = new char[20];
			int readLength = input.read(byteArray);
			while(readLength != -1)
			{
				String newData = new String(byteArray, 0, readLength);
				System.out.println(newData);
				readLength = input.read(byteArray);
			}
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
