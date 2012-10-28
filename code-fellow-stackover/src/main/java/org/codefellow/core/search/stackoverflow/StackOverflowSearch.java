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
package org.codefellow.core.search.stackoverflow;

import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;
import org.codefellow.core.parser.StackOverflowParser;
import org.codefellow.core.search.ListableSearcheable;

import java.util.ArrayList;
import java.util.List;

/**
 * Search against stackoverflow.com.
 *
 * @author abserban
 * @since 2012
 */
public class StackOverflowSearch implements ListableSearcheable {
    /**
     * page reader
     */
    private Fetcher fetcher = null;
    private final String serviceName;

    /**
     * Constructs a stackoverflow.com searcher based on the engine specified
     *
     * @param fetcher can be online or disk fetcher
     */
    public StackOverflowSearch(Fetcher fetcher, String serviceName) {
        this.fetcher = fetcher;
        this.serviceName = serviceName;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Search stackoverflow for the specified tags and return back the list of results
     *
     * @param tags keywords for searching
     * @return a list of search result
     */
    @Override
    public List<SearchResult> search(List<Tag> tags) {

        if (tags == null || tags.size() == 0) {
            return new ArrayList<SearchResult>();
        }
        String keyword = "";

        for (Tag tag : tags) {
            keyword += tag.getValue();
            keyword += " ";
        }

        StringBuffer page = fetcher.getPage(keyword);

        StackOverflowParser parser = new StackOverflowParser();
        return parser.parse(page);
    }
}
