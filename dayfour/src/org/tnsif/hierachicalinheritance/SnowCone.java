 package org.tnsif.hierachicalinheritance;

//child class1
public class SnowCone extends Androidversion {
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setversion(int version) {
		this.version = version;
	}

	public SnowCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SnowCone(String type,int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
}