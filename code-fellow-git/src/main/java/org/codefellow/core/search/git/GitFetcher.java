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
package org.codefellow.core.search.git;

import org.apache.http.client.HttpClient;
import org.codefellow.core.parsing.AbstractHttpFetcher;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Fetches a html page from <b>github.com</b> using the search capability
 *
 * @author abserban
 * @since 2012
 */
public class GitFetcher extends AbstractHttpFetcher {
    public GitFetcher(HttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected URI createUriForKeyword(String keyword) {
        try {
            return new URI("https://github.com/search?utf8=%E2%9C%93&type=Everything&repo=&langOverride=&start_value=1" + "&q=" + keyword);
        } catch (URISyntaxException e) {
            throw new IllegalStateException("an URI syntax exception occured", e);
        }
    }

}