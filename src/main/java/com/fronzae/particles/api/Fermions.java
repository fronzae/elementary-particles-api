package com.fronzae.particles.api;

import java.util.ArrayList;
import java.util.List;

public class Fermions {
	
	private List<Particle> quarks = new ArrayList<>();
	private List<Particle> leptons = new ArrayList<>();
	
	public Fermions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fermions(List<Particle> quarks, List<Particle> leptons) {
		super();
		this.quarks = quarks;
		this.leptons = leptons;
	}

	public List<Particle> getQuarks() {
		return quarks;
	}

	public void setQuarks(List<Particle> quarks) {
		this.quarks = quarks;
	}

	public List<Particle> getLeptons() {
		return leptons;
	}

	public void setLeptons(List<Particle> leptons) {
		this.leptons = leptons;
	}
	
	public void addQuarks() {
		Particle q1 = new Particle("Up", "2.2 MeV", "2/3", "1/2");
		Particle q2 = new Particle("Down", "4.7 MeV", "-1/2", "1/2");
		Particle q3 = new Particle("Charm", "1.28 GeV", "2/3", "1/2");
		Particle q4 = new Particle("Strange", "96 MeV", "-1/2", "1/2");
		Particle q5 = new Particle("Top", "173.1 GeV", "2/3", "1/2");
		Particle q6 = new Particle("Bottom", "4.18 GeV", "-1/2", "1/2");
		this.quarks.add(q1);
		this.quarks.add(q2);
		this.quarks.add(q3);
		this.quarks.add(q4);
		this.quarks.add(q5);
		this.quarks.add(q6);		
	}

	public void addLeptons() {
		Particle l1 = new Particle("Electron", "0.511 MeV", "-1", "1/2");
		Particle l2 = new Particle("Muon", "105.66 MeV", "-1", "1/2");
		Particle l3 = new Particle("Tau", "1.7768 GeV", "-1", "1/2");
		Particle l4 = new Particle("Electron neutrino", "1 eV", "0", "1/2");
		Particle l5 = new Particle("Muon neutrino", "0.17 MeV", "0", "1/2");
		Particle l6 = new Particle("Tau neutrino", "18.2 MeV", "0", "1/2");
		this.leptons.add(l1);
		this.leptons.add(l2);
		this.leptons.add(l3);
		this.leptons.add(l4);
		this.leptons.add(l5);
		this.leptons.add(l6);
	}
}
