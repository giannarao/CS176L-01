import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.jsoup.*;

import javax.swing.text.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoup {

	public static void main(String[] args) throws IOException{
		String link2022 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0";
		String link2021 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0";
		String link2020 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0";
		
		
		org.jsoup.nodes.Document doc = Jsoup.connect(link2022)
				.timeout(6000).get();
		org.jsoup.nodes.Document doc1 = Jsoup.connect(link2021)
				.timeout(6000).get();
		org.jsoup.nodes.Document doc2 = Jsoup.connect(link2020)
				.timeout(6000).get();
		
		
		Elements body = doc.select("tbody");
		
		ArrayList<String> namesArrayList2022 = new ArrayList<String>();
		ArrayList<String> namesArrayList2021 = new ArrayList<String>();
		ArrayList<String> namesArrayList2020 = new ArrayList<String>();
		
		for (Element e: body.select("td.grid_line_regular")){
			final String name = e.select("a").text();
			if(name != "" && name.length() > 3) {
				//System.out.println(name);
				namesArrayList2022.add(name);	
				
			}
		}
		System.out.println(namesArrayList2022);
		
		
		Elements body1 = doc1.select("tbody");
		for (Element e: body1.select("td.grid_line_regular")){
			final String name = e.select("a").text();
			if(name != "" && name.length() > 3) {
				//System.out.println(name);
				namesArrayList2021.add(name); 
				
			}
		}
		System.out.println(namesArrayList2021);
		
		
		Elements body2 = doc2.select("tbody");
		for (Element e: body2.select("td.grid_line_regular")){
			final String name = e.select("a").text();
			if(name != "" && name.length() > 3) {
				//System.out.println(name);
				namesArrayList2020.add(name);	
				
			}
		}
		System.out.println(namesArrayList2020);
		
		
		
		for (int i=0; i< namesArrayList2022.size(); i++) {
			
			
		}
		
		
		
		
		/*for (int i=1; i<11; i++) {
			System.out.println(i + ". " + "player name" + "  |  average: " + "average");
		}*/
				
		

		
		
		
		

	}

}
