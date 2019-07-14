package com.test.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.test.dao.ProjetRepository;
import com.test.entities.Projet;
import java.util.Optional;

@Service
public class ProjetServiceImpl implements ProjetService {
	@Autowired
	private ProjetRepository projetRepository;
	//private StadeRepository stadeRepository;
	//private StructureRepository structureRepository;

	public Projet AddProjet(Projet projet) {
		// TODO Auto-generated method stub
		return projetRepository.save(projet) ;
	}

	@Override
	public Projet modifProjet(Projet projet) {
		// TODO Auto-generated method stub
		return projetRepository.save(projet) ;
	}

	@Override
	public List<Projet> getAllProjet() {
		// TODO Auto-generated method stub
		return (List<Projet>) projetRepository.findAll();
	}

	

  @GetMapping("/projets/{id}")
	 public Optional<Projet> findById(@PathVariable Integer ID) {
		 System.out.println("Get project par id...");
		// Optional<Projet> prj = projetRepository.findById(id);
		 Optional<Projet> proj = projetRepository.findById(ID);
	  
	 return proj;
	 }

	

	/*
	 @Override
      public Optional<STADE_PROJET> getProjByStade(String CODE_STADE) { //
	 * TODO Auto-generated method stub return (Optional<STADE_PROJET>)
	 * stadeRepository.findById(CODE_STADE);
	 * }
	 */




@Override
public List<Projet> getProjByStructure(Integer ID, Date DATE_FIN_A, Date DATE_FIN) {
	// TODO Auto-generated method stub
	return (List<Projet>)projetRepository.getProjByStructure(ID, DATE_FIN_A, DATE_FIN);
}

	/*
	 * @Override public List<Projet> getProjByStade(String cODE_STADE) { // TODO
	 * Auto-generated method stub return (List<Projet>)
	 * projetRepository.getProjByStade(cODE_STADE); }
	 */
 

}
