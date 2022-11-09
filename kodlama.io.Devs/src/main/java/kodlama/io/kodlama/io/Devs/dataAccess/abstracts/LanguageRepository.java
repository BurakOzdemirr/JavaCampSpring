package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.kodlama.io.Devs.entities.concretes.Language;


public interface LanguageRepository extends JpaRepository<Language, Integer>{
	
	
//	void add(Language language);

 //   void delete(int id);

 //   void update(Language language);

}
