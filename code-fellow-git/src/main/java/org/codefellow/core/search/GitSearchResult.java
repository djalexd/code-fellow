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
package org.codefellow.core.search;

import org.codefellow.core.SearchResult;

/**
 * Search result specific to GitHub
 *
 * @author abserban
 * @since 2012
 */
public class GitSearchResult implements SearchResult {
    private String title;
    private String body;
    private String Uri;

    public GitSearchResult(String title, String body, String uri) {
        this.title = title;
        this.body = body;
        Uri = uri;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public String getUri() {
        return Uri;
    }
}
