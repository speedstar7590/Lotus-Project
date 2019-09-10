package com.gv.gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class Json {

	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedReader br = new BufferedReader(new FileReader("array.json"));

		Gson gson = new Gson();
		Parent[] parentObjArray = gson.fromJson(br, Parent[].class);

		Parent folder2 = parentObjArray[1];
		parentObjArray[0].setChildren(new Parent[] { folder2 });

		System.out.println(gson.toJson(parentObjArray));
	}

}
