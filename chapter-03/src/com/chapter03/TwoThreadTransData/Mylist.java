package com.chapter03.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class Mylist {
	private List list = new ArrayList();
	
	public void add()
	{
		list.add("��С��");
	}
	
	public int size()
	{
		return list.size();
	}
}
