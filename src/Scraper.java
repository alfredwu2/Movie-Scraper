import java.io.IOException;

import javax.xml.parsers.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraper {

	public static void main(String[] args) {
	

		try {
			Document doc = Jsoup.connect("http://www.imdb.com/title/tt5013056/?ref_=nv_sr_1").get();
	
			String name = doc.getElementsByAttributeValue("itemprop", "name").get(0).text();
			
			
			String ratingValue = doc.getElementsByAttributeValue("itemprop", "ratingValue").get(0).text();
			String ratingCount = doc.getElementsByAttributeValue("itemprop", "ratingCount").get(0).text();
			
			Elements genreElements = doc.getElementsByAttributeValue("itemprop", "genre");
		
			
			Element e = genreElements.last();
			System.out.println(e.text());
			
			System.out.println(name);
			System.out.println(ratingValue);
			System.out.println(ratingCount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
	}
			
}
