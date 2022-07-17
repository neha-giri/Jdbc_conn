package com.jdbc.example;

public class BusLayer {
	private DBManager db;
	
	public BusLayer() {
		db=new DBManager();
		
	}
	
	public void selectData() {
		db.selectRecords();
	}
	
	public void insertData(int sid, String sname, int sage, String sdept) {
		String cmd="Insert into tbl_Student(sid,sname,sage,sdept) values('"+sid+"','"+sname+"','"+sage+"','"+sdept+"')";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been saved successfully");
		else
			System.out.println("Record has not been saved successfully");
	} 
	
	public void updateData(int sid, String sname) {
		String cmd="update tbl_Student set sname='"+sname+"' where sid='"+sid+"'";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been updated successfully");
		else
			System.out.println("Record has not been updated successfully");
	} 

	
	public void deleteData(int sid) {
		String cmd="delete from tbl_Student where sid='"+sid+"'";
		if(db.RecordsManipulation(cmd))
			System.out.println("Record has been deleted successfully");
		else
			System.out.println("Record has not been deleted successfully");
	} 

}
