package org.codefellow.core.search.infoq;

import org.codefellow.core.SearchResult;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diseropi
 * Date: 10/28/12
 * Time: 3:43 AM
 * Parses a search result page from InfoQ search.
 * Decodes only the result divs from the html source
 */
public class InfoQParser {
    /**
     * Parse the text from the supplied html page.
     *
     * @param page a html body of a web page
     * @return a list of search result specific to GitHub
     */
    public List<SearchResult> parse(String page) {
        Document html = Jsoup.parse(page);
        Elements elements = html.select(".box-content-3");
        Elements results = elements.select(".entry+.entryhome");

        List<SearchResult> result = new ArrayList<SearchResult>();

        for (Element element : results) {
            Elements title = element.getElementsByTag("h1");
            Iterator<Element> bodyAndLink = element.getElementsByTag("p").iterator();
            Element body = bodyAndLink.next();
            Element link = bodyAndLink.next();
            String slink = "<a href=" + link.attr("href") + "\">" + link.text() + "</a>";
            result.add(new InfoQSearchResult(title.text(), body.text(), slink));
        }
        return result;
    }
}

