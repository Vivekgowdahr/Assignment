package collection;

import java.util.HashMap;

public class HashMapAdvan {
public static void main(String[] args) {
	HashMap<String, String> fun=new HashMap<String, String>();
	fun.put("vivek", "poiunun");
	fun.put("sushmitha", "gowda");
	fun.remove("vivek");	
	System.out.println(fun.containsValue("gowda"));
}
}
