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

import junit.framework.TestCase;
import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;
import org.codefellow.core.TextTag;
import org.codefellow.core.search.stackoverflow.DiskFetcher;
import org.codefellow.core.search.stackoverflow.OnlineFetcher;
import org.codefellow.core.search.stackoverflow.StackOverflowSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Test the GitSearch functionally for parsing and online searches.
 *
 * @author abserban
 * @since 2012
 */
public class StackOverflowSearchTest extends TestCase {
    /**
     * Test the parser with Disk file
     *
     * @throws Exception when test fails
     */
    public void testParse() throws Exception {
        StackOverflowSearch searcher = new StackOverflowSearch(new DiskFetcher("StackOverflowSample.json"), "stackoverflow.com");
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(new TextTag("test", "test"));

        List<SearchResult> resultList = searcher.search(tags);
        assertTrue(resultList.size() > 0);
        assertEquals(30,resultList.size());
    }

    /**
     * Test the Online implementation
     *
     * @throws Exception when test fails
     */
    public void testParseOnline() throws Exception {
        StackOverflowSearch searcher = new StackOverflowSearch(new OnlineFetcher(), "stackoverflow.com");
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(new TextTag("test", "test"));

        List<SearchResult> resultList = searcher.search(tags);
        assertTrue(resultList.size() > 0);

    }

}
