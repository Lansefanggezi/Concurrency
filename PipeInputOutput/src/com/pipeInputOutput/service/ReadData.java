package com.pipeInputOutput.service;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

	public void readMethod(PipedInputStream input)
	{
		try {
			
			System.out.println("Read :");
			byte[] byteArray = new byte[20];
			int readLength;
			readLength = input.read(byteArray);
			while(readLength != -1){
				String data = new String(byteArray , 0, readLength);
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 