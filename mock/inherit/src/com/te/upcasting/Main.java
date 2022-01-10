package com.te.upcasting;

public class Main {
public static void main(String[] args) {
	Moon moon = new Moon();
	moon.contains();
	moon.earth();
	moon.has();
	moon.satalight();
	moon.system();
	moon.Way();
	Univers obj=new Moon();//upcasting
	obj.contains();
	Galaxy obj2=new Moon();//upcasting
	obj2.contains();
	obj2.has();
	MilkeyWay obj3 = new Moon();//upcasting
	obj3.contains();
	obj3.has();
	obj3.Way();
	SolarSystem obj4=new Moon();//upcasting
	obj4.contains();
	obj4.has();
	obj4.system();
	obj4.Way();
	Earth obj5=new Moon();//upcasting
	Univers a=(Univers)moon;//downcasting
	a.contains();
			
//	obj5.contains();
//	obj5.earth();
//	obj5.has();
//	obj5.system();
//	obj5.Way();
//	
}
}
