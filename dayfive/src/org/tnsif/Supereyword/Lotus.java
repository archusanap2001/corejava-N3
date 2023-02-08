package org.tnsif.Supereyword;

public class Lotus extends Flower{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Lotus() {
			System.out.println("Super -parent class");
		}

		public Lotus(String name) {
			super();
			this.name = name;
		}
		public void display()
		{
			System.out.println(name);
			super.setName("Flower");
			System.out.println(super.getName());
		}
	}
