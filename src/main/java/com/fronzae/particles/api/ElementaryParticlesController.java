package com.fronzae.particles.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElementaryParticlesController {
	
	@GetMapping("/particles")
	public SubAtomicParticles getElementaryParticles() {
		
	    UUID randomUUID = UUID.randomUUID();
	    String randomId = randomUUID.toString().replaceAll("_", "");
	    
	    ElementaryParticles elementaryParticles = new ElementaryParticles();
	    elementaryParticles.setRandom(randomId);
		
		Fermions fermions = new Fermions();
		fermions.addQuarks();
		fermions.addLeptons();
		elementaryParticles.setFermions(fermions);
		
		Bosons bosons = new Bosons();
		bosons.addGaugeBosons();
		bosons.addScalarBosons();
		elementaryParticles.setBosons(bosons);

		SubAtomicParticles subAtomic = new SubAtomicParticles(elementaryParticles);
				
		return subAtomic;
	}

}
