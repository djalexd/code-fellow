package org.codefellow.core.search;

import org.codefellow.core.SearchResult;

/**
 * Created with IntelliJ IDEA.
 * User: diseropi
 * Date: 10/28/12
 * Time: 1:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class MavenCentralSearchResult implements SearchResult {
    public static final String MAVEN_ARTIFACTORY_DETAILS_URL_PRE = "http://search.maven.org/#artifactdetails";

    private final String title;
    private final String body;
    private final String url;

    public MavenCentralSearchResult(final String artifactId, final String groupId, final String version, final String updatedTimestamp) {
        this.title = artifactId;
        this.body = "groupId: " + groupId + ", version: " + version + ", lastupdate: " + updatedTimestamp;
        this.url = MAVEN_ARTIFACTORY_DETAILS_URL_PRE + "%7C" + groupId + "%7C" + artifactId + "%7C" + version + "%7Cjar";
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public String getUri() {
        return this.url;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
