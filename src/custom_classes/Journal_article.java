package custom_classes;

public class Journal_article extends Article{
	public String journal_name;
	public int year_of_acceptance;
	public int volume;

	public Journal_article(String ti, String ma, boolean sh, boolean oa, String jn, int ya, int vo){
		super(ti, ma, sh, oa);
		journal_name = jn;
		year_of_acceptance = ya;
		volume = vo;
	}
}
