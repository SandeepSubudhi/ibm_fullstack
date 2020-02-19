package com.class_object;
class Date{
		private int day;
		private int month;
		private int year;
		public Date() {
			this.day= 25;
			this.month= 7;
			this.year= 2010;
		}
		public Date(int day, int month, int year) {
			this.day= day;
			this.month= month;
			this.year= year;
		}
		public int getDay() {
			return this.day;
		}
		public int getMonth() {
			return this.month;
		}
		public int getYear() {
			return this.year;
		}
		public void setDay(int day){
			this.day=day;
		}
		public void setMonth(int month){
			this.month=month;
		}
		public void setYear(int year){
			this.year=year;
		}
		public void display(){
		System.out.println(this.day+"/"+this.month+"/"+this.year);
		}
}
public class DateTest{
			public static void main(String args[]){
				Date d1=new Date();
				Date d2=new Date(15,8,1999);
				d1.display();
				d2.display();
				System.out.println(d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
				
			}
			}
				