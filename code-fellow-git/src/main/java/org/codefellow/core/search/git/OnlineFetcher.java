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

import java.net.URLEncoder;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Fetches a html page from <b>github.com</b> using the search capability
 *
 * @author abserban
 * @since 2012
 */
public class OnlineFetcher implements Fetcher {
    /**
     * Searches github.com using the keyword parameter.
     *
     * @param keywords one or more keywords separated by blank
     * @return the search result page
     */
    @Override
    public StringBuffer getPage(String keywords) {

        try {
            URL url = new URL("https://github.com/search?utf8=%E2%9C%93&type=Everything&repo=&langOverride=&start_value=1" + "&q=" + URLEncoder.encode(keywords, "UTF-8"));

            URLConnection connection = url.openConnection();

            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer page = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                page.append(line);
                page.append("\n");
            }

            return page;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}