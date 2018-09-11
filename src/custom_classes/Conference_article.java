package custom_classes;

public class Conference_article extends Article {
	public String conference_name;
	public int year_of_conference;
	public String conference_location;
	
	public Conference_article(String ti, String ma, boolean sh, boolean oa, String cn, int yc, String cl){
		super(ti, ma, sh, oa);
		conference_name = cn;
		year_of_conference = yc;
		conference_location = cl;
	}
}
