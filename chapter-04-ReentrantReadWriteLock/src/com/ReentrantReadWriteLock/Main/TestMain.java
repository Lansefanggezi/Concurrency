package com.ReentrantReadWriteLock.Main;

import com.ReentrantReadWriteLock.Service.ReadAndWrite;
import com.ReentrantReadWriteLock.Thread.ThreadRead;
import com.ReentrantReadWriteLock.Thread.ThreadWrite;

public class TestMain {

	public static void main(String[] args) {
		ReadAndWrite readAndWrite = new ReadAndWrite();
		
		ThreadRead read = new ThreadRead(readAndWrite);
		read.setName("read");
		ThreadWrite write = new ThreadWrite(readAndWrite);
		write.setName("write");
		
		read.start();
		write.start();
		

	}

}
