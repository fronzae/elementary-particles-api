package com.fronzae.particles.api;

public class ElementaryParticles {
	
	private Fermions fermions;
	private Bosons bosons;
	private String random;
	
	public ElementaryParticles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElementaryParticles(Fermions fermions, Bosons bosons, String random) {
		super();
		this.fermions = fermions;
		this.bosons = bosons;
		this.random = random;
	}

	public Fermions getFermions() {
		return fermions;
	}

	public void setFermions(Fermions fermions) {
		this.fermions = fermions;
	}

	public Bosons getBosons() {
		return bosons;
	}
	
	public void setBosons (Bosons bosons) {
		this.bosons = bosons;
	}
	
	public String getRandom () {
		return random;
	}
	
	public void setRandom (String random) {
		this.random = random;
	}

}
