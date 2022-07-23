package com.fronzae.particles.api;

import java.util.ArrayList;
import java.util.List;

public class Bosons {

	private List<GaugeBoson> gauge_bosons = new ArrayList<>();
	private List<Particle> scalar_bosons = new ArrayList<>();
	
	public Bosons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bosons(List<GaugeBoson> gauge_bosons, List<Particle> scalar_bosons) {
		super();
		this.gauge_bosons = gauge_bosons;
		this.scalar_bosons = scalar_bosons;
	}

	public List<GaugeBoson> getGauge_bosons() {
		return gauge_bosons;
	}

	public void setGauge_bosons(List<GaugeBoson> gauge_bosons) {
		this.gauge_bosons = gauge_bosons;
	}

	public List<Particle> getScalar_bosons() {
		return scalar_bosons;
	}

	public void setScalar_bosons(List<Particle> scalar_bosons) {
		this.scalar_bosons = scalar_bosons;
	}
	
	public void addGaugeBosons() {
		GaugeBoson gb1 = new GaugeBoson("Photon", "0", "0", "1", "electromagnetic");
		GaugeBoson gb2 = new GaugeBoson("W", "80.433 GeV", "+/-1", "1", "weak nuclear force");
		GaugeBoson gb3 = new GaugeBoson("Z", "91.19 GeV", "0", "1", "weak nuclear force");
		GaugeBoson gb4 = new GaugeBoson("Gluon", "0", "0", "1", "strong nuclear force");
		this.gauge_bosons.add(gb1);
		this.gauge_bosons.add(gb2);
		this.gauge_bosons.add(gb3);
		this.gauge_bosons.add(gb4);
	}
	
	public void addScalarBosons() {
		Particle sb1 = new Particle("Higgs", "124.97 GeV", "0", "0");
		this.scalar_bosons.add(sb1);
	}

}
