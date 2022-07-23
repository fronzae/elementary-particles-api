package com.fronzae.particles.api;

public class Particle {

	private String name;
	private String mass;
	private String spin;
	private String charge;
	
	public Particle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Particle(String name, String mass, String spin, String charge) {
		super();
		this.name = name;
		this.mass = mass;
		this.spin = spin;
		this.charge = charge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getSpin() {
		return spin;
	}

	public void setSpin(String spin) {
		this.spin = spin;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}
	
}
