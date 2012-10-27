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

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/**
 * Fetches a html page from <b>stackoverflow.com</b> using the search capability
 *
 * @author abserban
 * @since 2012
 */
public class OnlineFetcher implements Fetcher {
    /**
     * Searches stackoverflow.com using the keyword parameter.
     *
     * @param keywords one or more keywords separated by blank
     * @return the search result page
     */
    @Override
    public StringBuffer getPage(String keywords) {

        try {
            URL url = new URL("https://api.stackexchange.com/2.1/search/advanced?order=desc&sort=relevance&site=stackoverflow&body=" + keywords);

            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Accept-Charset", "UTF-8");

            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(inputStream)));
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