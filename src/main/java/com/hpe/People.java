package com.hpe;  

public class People implements Comparable<People>{
	 	private  Object name;
	    private  Object age;
	    private  Object latitude;
	    private  Object longitude;
	    
		public Object getName() {
			return name;
		}
		public void setName(Object name) {
			this.name = name;
		}
		public Object getAge() {
			return age;
		}
		public void setAge(Object age) {
			this.age = age;
		}
		public Object getLatitude() {
			return latitude;
		}
		public void setLatitude(Object latitude) {
			this.latitude = latitude;
		}
		public Object getLongitude() {
			return longitude;
		}
		public void setLongitude(Object longitude) {
			this.longitude = longitude;
		}
		/**
		 * @param name
		 * @param age
		 * @param latitude
		 * @param longitude
		 */
		public People(Object name, Object age, Object latitude, Object longitude) {
			super();
			this.name = name;
			this.age = age;
			this.latitude = latitude;
			this.longitude = longitude;
		}
		
		public int compareTo(People peopleAge) {
			// TODO Auto-generated method stub
			
			return (int)((Integer)this.age - (Integer)peopleAge.getAge());
		}
		

		
	    

		
}
