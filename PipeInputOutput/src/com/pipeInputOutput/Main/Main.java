package com.pipeInputOutput.Main;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import com.pipeInputOutput.Thread.ThreadRead;
import com.pipeInputOutput.Thread.ThreadWrite;
import com.pipeInputOutput.service.ReadData;
import com.pipeInputOutput.service.WriteData;

public class Main {

	public static void main(String[] args) {
		try {
			// 首先读取线程 new threadRead()启动，由于当时没有数据被写入，所以线程阻塞的int readLength = input.read(batyArray);代码中，直到有数据写入；
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			PipedOutputStream pipeOutput = new PipedOutputStream();
			PipedInputStream pipeInput = new PipedInputStream();
			
			//通过connect（）方法来建立连接
	
				pipeOutput.connect(pipeInput);
			
			ThreadRead threadRead = new ThreadRead(readData, pipeInput);
			ThreadWrite threadWrite = new ThreadWrite(writeData, pipeOutput);
			
			threadRead.start();
			
			Thread.sleep(5000);
			threadWrite.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
