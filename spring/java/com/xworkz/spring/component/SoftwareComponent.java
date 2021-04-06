package com.xworkz.spring.component;

public class SoftwareComponent {
	
	private String name;
	private String vendor;
	private String version;
	private String type;
	
	public SoftwareComponent(String name, String vendor) {
		super();
		System.out.println("obj created:" + this.getClass().getSimpleName());
		System.out.println("invoked name:" +name );
		System.out.println("invoked vendor:" +vendor );
		
		this.name = name;
		this.vendor = vendor;
		
	}

	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version= version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
