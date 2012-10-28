/**
 Copyright 2012 CodeFellow

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.codefellow.core.parser;

import org.codefellow.core.SearchResult;
import org.codefellow.core.SimpleSearchResult;
import org.codefellow.core.parsing.Parser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Parses a search result page from GitHub search.
 * Decodes only the result divs from the html source
 *
 * @author abserban
 * @since 2012
 */
public class GitParser implements Parser {
    /**
     * Parse the text from the supplied html page.
     *
     * @param page a html body of a web page
     * @return a list of search result specific to GitHub
     */
    public List<SearchResult> parse(String page) {
        Document html = Jsoup.parse(page);
        Elements elements = html.select("#code_search_results");
        Elements results = elements.select(".result");

        List<SearchResult> result = new ArrayList<SearchResult>();

        for (Element element : results) {
            Elements title = element.select(".title");
            Elements body = element.select(".description");
            Elements link = element.getElementsByTag("a");
            String slink="<a href=\"https://github.com"+link.attr("href")+"\">"+link.text()+"</a>";
            result.add(new SimpleSearchResult(title.text(), body.text(), slink));
        }
        return result;
    }
}
