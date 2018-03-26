package com.piped.main;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

import com.piped.service.ReadData;
import com.piped.service.WriteData;
import com.piped.thread.ReadThread;
import com.piped.thread.WriterThread;

public class Main {

	public static void main(String[] args) {
		
		try {
			ReadData readData = new ReadData();
			WriteData writeData = new WriteData();
			
			PipedWriter pipedWriter = new PipedWriter();
			PipedReader pipedReader = new PipedReader();
			
			pipedWriter.connect(pipedReader);
			
			ReadThread readThread = new ReadThread(pipedReader,readData);
			readThread.start();
			
			ReadThread.sleep(3000);
			WriterThread writerThread = new WriterThread(pipedWriter, writeData);
			writerThread.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
