package com.hpe;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class VaccinationCentre {
	public static void main(String[] args) {

		// parsing file
		Object obj;
		try {
			obj = new JSONParser().parse(new FileReader("C:/Users/nayan/Downloads/People.txt"));
			List<People> people = new ArrayList<People>();
			Map<String, ArrayList<People>> arrList = new HashMap<String, ArrayList<People>>();

			// typecasting obj to JSONObject
			JSONArray jo = (JSONArray) obj;

			for (int i = 0; i < jo.size(); i++) {
				// getting each json object
				JSONObject joa = (JSONObject) jo.get(i);
				// add objects
				people.add(new People(joa.get("Name"), joa.get("Age"), joa.get("Latitude"), joa.get("Longitude")));

			}

			// Passing all the list to calculate distance between vaccination centres to
			// individual location
			for (int i = 0; i < jo.size(); i++) {
				// calling method
				String centre = LocationFinder.calculateDistance(people.get(i).getName().toString(),
						people.get(i).getLatitude().toString(), people.get(i).getLongitude().toString());
				// saving result in map, grouped by nearest centres
				arrList.put(centre, (ArrayList<People>) people);
			}

			// reading values from map
			for (String key : arrList.keySet()) {
				System.out.println("Vaccination Centre:   " + key);
				List<People> li = arrList.get(key);

				for (int i = 0; i < li.size(); i++) {
					System.out.println("Person" + i + ":   " + li.get(i).getName() + "Age:  " + li.get(i).getAge());
				}
			}

			} catch (FileNotFoundException e) {
	
				e.printStackTrace();
			} catch (IOException e) {
	
				e.printStackTrace();
			} catch (ParseException e) {
	
				e.printStackTrace();
			}
	
		}

	
}
