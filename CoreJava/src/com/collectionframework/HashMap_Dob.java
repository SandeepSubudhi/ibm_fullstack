package com.collectionframework;


import java.util.HashMap;
import java.util.Iterator;

class Date 
{
	private int day,  month, year;

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override

	public boolean equals(Object obj) {
        Date o= (Date)obj;
		if(o.day==this.day&&o.month==this.month)
			return true;
		else 
			return false;
        
	}
	
//	@Override
    public int hashCode() {
        return 2;
    }
}

public class HashMap_Dob {
	
	public static void main(String[] args) 
	{
		HashMap<Date, String> map = new HashMap<>();
		map.put(new Date(2, 1,1998), "Suraj");
		map.put(new Date(2, 1,1999), "Swadhin");
		map.put(new Date(3, 1,1998), "Adarsh");
		
       	
		Iterator<Date> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Date d = itr.next();
			System.out.println(d);
		}
		 String s=map.get(new Date(2, 1,1998));
		 System.out.println("call : "+s);
	
		
	}

}