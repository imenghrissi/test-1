package com.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.test.dao.ProjetRepository;
import com.test.entities.Projet;
import java.util.Optional;

@Service("ProjetServiceImpl")
public class ProjetServiceImpl implements ProjetService {
	@Autowired
	private ProjetRepository projetRepository;
	//private StadeRepository stadeRepository;
	//private StructureRepository structureRepository;
    @Override
	public Projet AddProjet(Projet projet) {
		// TODO Auto-generated method stub
		return projetRepository.save(projet) ;
	}

	@Override
	public Projet ModifProjet(Projet projet) {
		// TODO Auto-generated method stub
		return projetRepository.save(projet) ;
	}

	@Override
	public List<Projet> getAllProjet() {
		// TODO Auto-generated method stub
		return (List<Projet>) projetRepository.findAll();
	}

	

  //@GetMapping("/projets/{Id}")
	@Override
	 public Optional<Projet> findById(@PathVariable Integer id) {
		 System.out.println("Get project par id...");
		// Optional<Projet> prj = projetRepository.findById(id);
		 return (Optional<Projet>) projetRepository.findById(id);
	  
	 
	 }

	
	  @Override 
	  public List<Projet> getProjByStade(String CODE_STADE ) {
		  // TODOAuto-generated method stub return (List<Projet>)
	  return projetRepository.getProjByStade(CODE_STADE ); 
	  }

	  @Override 
    	public List<Projet> getProjByStructure(Integer structuresid_id) {
		
		return  projetRepository.getProjByStructureid(structuresid_id);
		}


	  @Override
	  public List<Projet> getProjBydifficulte(Integer FLAG_EN_DIFFICULTE){
		  // TODO Auto-generated method stub 
		  return(List<Projet>)projetRepository.getProjBydifficulte(FLAG_EN_DIFFICULTE);
		  }
	 


	 
 

}
