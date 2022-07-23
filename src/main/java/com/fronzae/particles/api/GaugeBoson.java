package com.fronzae.particles.api;

public class GaugeBoson extends Particle {

	private String force;

	public GaugeBoson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GaugeBoson(String name, String mass, String spin, String charge, String force) {
		super(name, mass, spin, charge);
		// TODO Auto-generated constructor stub
		
		this.force = force;
		
	}

	public String getForce() {
		return force;
	}

	public void setForce(String force) {
		this.force = force;
	}
	
	
}
