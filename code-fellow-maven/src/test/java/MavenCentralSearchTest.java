import junit.framework.TestCase;
import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;
import org.codefellow.core.TextTag;
import org.codefellow.core.search.maven.MavenCentralSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diseropi
 * Date: 10/28/12
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class MavenCentralSearchTest extends TestCase {
    public void testSearch() throws Exception {
        MavenCentralSearch searcher = new MavenCentralSearch("maven.org");
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(new TextTag("spring", "spring"));

        List<SearchResult> resultList = searcher.search(tags);
        assertTrue(resultList.size() > 0);

    }
}
