package task25_26;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.exceptions.CsvException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException, CsvException {
        Document document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").get();
        Elements lines_el, stationsTable;
        ArrayList lines = new ArrayList<Line>();
        Map<Integer, String[]> stations = new HashMap<Integer, String[]>();
        //lines_el = document.getElementsByClass("js-toggle-depend s-depend-control-single s-depend-control-active");
        lines_el = document.select("div[data-depend]");
        stationsTable = document.getElementsByClass("js-metro-stations t-metrostation-list-table");
//        System.out.println(stationsTable.select("a[data-metrost]"));
//        System.out.println(stationsTable.get(0).getElementsByClass("js-metrostation").get(0));
        lines_el.forEach(x -> lines.add(new Line(lines.size() + 1, x.text() )));
        for( int i = 0; i < stationsTable.size(); i++ ){
            Elements elements;
            elements = stationsTable.get(i).select("a[data-metrost]");
            String[] result = new String[elements.size()];
            for(Element el : elements)
                result[elements.indexOf(el)] = (el.text().substring(3, el.text().length()));
            stations.put(i + 1, result);
        }
        Metro metro = new Metro(lines, new Stations(stations));
        String str = GSON.toJson(metro);
        System.out.println(str);

    }
}
