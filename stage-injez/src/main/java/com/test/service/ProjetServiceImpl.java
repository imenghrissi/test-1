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
	 public Optional<Projet> findById(@PathVariable Integer Id_projet) {
		 System.out.println("Get project par id...");
		// Optional<Projet> prj = projetRepository.findById(id);
		 return (Optional<Projet>) projetRepository.findById(Id_projet);
	  
	 
	 }

	
	  @Override 
	  public List<Projet> getProjByStade(String Code_Stade ) {
		  // TODOAuto-generated method stub return (List<Projet>)
	  return (List<Projet>)projetRepository.getProjByStade(Code_Stade); 
	  }

	  @Override 
    	public List<Projet> getProjByStructure(Integer Id_Structure) {
		
		return  projetRepository.getProjByStructureid(Id_Structure);
		}


	  @Override
	  public List<Projet> getProjBydifficulte(Integer Flag_En_Difficulte){
		  // TODO Auto-generated method stub 
		  return(List<Projet>)projetRepository.getProjBydifficulte(Flag_En_Difficulte);
		  }
	 


	 
 

}
