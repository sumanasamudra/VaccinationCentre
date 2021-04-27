package com.hpe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LocationFinder {
	public static String calculateDistance(String customerName, String latitude, String longitude) {

		Map<Double, String> mapcentre = new TreeMap<Double, String>();

		// adding three vaccination centres
		List<Centres> centresList = new ArrayList<Centres>();
		centresList.add(new Centres("Galway Racecourse", "53.298810877564875", "-8.997003657335881"));
		centresList.add(new Centres("City Hall Cork", "51.89742637092438", "-8.465763459121026"));
		centresList.add(new Centres("Citywest Convention Centre Dublin", "53.28603418885669", "-6.4444477725802285"));

		double latitude2 = Double.parseDouble(latitude);
		double longitude2 = Double.parseDouble(longitude);

		for (int i = 0; i < centresList.size(); i++) {

			double latitude1 = Double.parseDouble(centresList.get(i).getLatitude());
			double longitude1 = Double.parseDouble(centresList.get(i).getLongitude());

			// converting degrees to radians
			latitude1 = Math.toRadians(latitude1);
			longitude1 = Math.toRadians(longitude1);
			latitude2 = Math.toRadians(latitude2);
			longitude2 = Math.toRadians(longitude2);

			// Calculate Geographical distance
			double dlon = longitude2 - longitude1;
			double dlat = latitude2 - latitude1;
			double a = Math.pow(Math.sin(dlat / 2), 2)
					+ Math.cos(latitude1) * Math.cos(latitude2) * Math.pow(Math.sin(dlon / 2), 2);

			double c = 2 * Math.asin(Math.sqrt(a));

			double r = 6371;

			double k = (c * r);

			// Map according to unique key
			mapcentre.put(k, centresList.get(i).getCentreName());

		}

		return ((TreeMap<Double, String>) mapcentre).firstEntry().getValue();

	}

}
