package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.kodlama.io.Devs.entities.concretes.Language;


public interface LanguageRepository {
	List<Language> getAll();
	
	void add(Language language);

    void delete(int id);

    void update(Language language);

}
