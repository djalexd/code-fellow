import junit.framework.TestCase;
import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;
import org.codefellow.core.TextTag;
import org.codefellow.core.search.infoq.InfoQSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diseropi
 * Date: 10/28/12
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class InfoQSearchTest extends TestCase {

    public void testSearch() throws Exception {
        InfoQSearch searcher = new InfoQSearch("infoq.com");
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(new TextTag("akka", "akka"));

        List<SearchResult> resultList = searcher.search(tags);
        assertTrue(resultList.size() > 0);

    }
}
