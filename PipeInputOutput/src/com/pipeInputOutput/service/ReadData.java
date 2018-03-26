package com.pipeInputOutput.service;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

	public void readMethod(PipedInputStream input)
	{
		try {
			
			System.out.print("Read :");
			byte[] byteArray = new byte[20];
			int readLength;
			readLength = input.read(byteArray);
			while(readLength != -1){
				String data = new String(byteArray , 0, readLength);
				System.out.print("Read:" +data);
				readLength = input.read(byteArray);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 