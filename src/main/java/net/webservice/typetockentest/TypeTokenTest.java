package net.webservice.typetockentest;

import java.lang.reflect.Type;
import java.util.List;


import com.google.gson.reflect.TypeToken;

public class TypeTokenTest {

	public static void main(String[] args) {
		TypeToken<List<String>> token = new TypeToken<List<String>>() {} ;
		Type type = token.getType();
		System.out.println(type);
	}
}
