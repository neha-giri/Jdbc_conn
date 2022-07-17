package com.jdbc.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		new DBManager().selectRecords();
		
		BusLayer bus=new BusLayer();
		bus.selectData();//now use this one indirectly
		
//		bus.insertData(11, "niti", 43, "electric");
//		bus.selectData();
		
		
//		bus.updateData(11, "nitinn");
//		bus.selectData();
		
		
		bus.deleteData(11);
     	bus.selectData();
		
		

	}

}
