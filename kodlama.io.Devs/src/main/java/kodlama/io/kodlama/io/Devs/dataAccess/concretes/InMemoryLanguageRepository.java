package kodlama.io.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}
	
	@Override
	public void add(Language language)
	{
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		for (Language lng : languages)
		{
			if(lng.getId()== id) {
				languages.remove(lng);
			}
		}
		
	}

	@Override
	public void update(Language language) {
		for (Language lng : languages) {
            if (lng.getId() == language.getId()) {
                lng.setName(language.getName());
            }
        }		
	}

}
