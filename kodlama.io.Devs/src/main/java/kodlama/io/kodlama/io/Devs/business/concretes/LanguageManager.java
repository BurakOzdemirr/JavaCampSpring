package kodlama.io.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		for (Language lng : languageRepository.getAll()) {
			
			if (check(language.getName())&&languageIsEmpty(language)) {
				this.languageRepository.add(language);
			}
		}
		
	}
	
	 private  boolean check(String languageName)throws Exception{
	        for (Language lng : this.languageRepository.getAll()){
	            if (lng.getName().equalsIgnoreCase(languageName)){
	                return false;

	            }

	        }
	        return true;
	    }
	
	
	private boolean languageIsEmpty(Language language){
        if (language.getName().isEmpty()|| language.getName().isBlank()){
            return false;
        }
        return true;
    }

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}

	@Override
	public void update(Language language) {
		languageRepository.update(language);
		
	}

}
