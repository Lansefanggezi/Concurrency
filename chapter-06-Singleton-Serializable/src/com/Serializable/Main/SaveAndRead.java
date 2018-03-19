package com.Serializable.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.Serializable.Object.MyObject;

public class SaveAndRead {

	public static void main(String[] args) {
		
		try {
			MyObject myObject = MyObject.getInstance();
			
			FileOutputStream fileOutPutStream = new FileOutputStream(new File("MyObject.txt"));
			ObjectOutputStream objectOutPutStream = new ObjectOutputStream(fileOutPutStream);
			
			objectOutPutStream.writeObject(myObject);
			objectOutPutStream.close();
			fileOutPutStream.close();
			System.out.println(myObject.hashCode());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("MyObject.txt"));
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			MyObject myObject = (MyObject)objectInputStream.readObject();
			
			objectInputStream.close();
			fileInputStream.close();
			
			System.out.println(myObject.hashCode());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
