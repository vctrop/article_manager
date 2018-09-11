package custom_classes;

public class Article {
	public String title;
	public String main_author;
	public boolean sci_hub;
	public boolean open_access;

	Article(String ti, String ma, boolean sh, boolean oa){
		title = ti;
		main_author = ma;
		sci_hub = sh;
		open_access = oa;		
	}
}
