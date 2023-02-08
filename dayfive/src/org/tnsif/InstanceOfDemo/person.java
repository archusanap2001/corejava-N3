package org.tnsif.InstanceOfDemo;

public class person {

		private String name;
		private String address;
		//getters and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		//default constructor 
		
		public person() {
			super();
			
		}
		public person(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}
		@Override
		public String toString() {
			return "person [name=" + name + ", address=" + address + ", toString()=" + super.toString() + "]";
		}
}
		
		
		
		
		
		
		
		
		
	   
