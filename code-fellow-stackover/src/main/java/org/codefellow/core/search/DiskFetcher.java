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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Reads a html page from the disk.
 *
 * @author abserban
 * @since 2012
 */
public class DiskFetcher implements Fetcher {
    /**
     * Path to the file
     */
    private String fileName = null;

    /**
     * Creates a fetcher instance based on a file path
     *
     * @param fileName of the file that must be on the classpath
     */
    public DiskFetcher(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Reads the page from the disk. The filename was specified in constructor.
     *
     * @param keyword ignored by this method
     * @return a StringBuffer containing the file content.
     */
    @Override
    public StringBuffer getPage(String keyword) {
        InputStream htmlDoc = getClass().getClassLoader().getResourceAsStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(htmlDoc));
        StringBuffer page = new StringBuffer();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                page.append(line);
                page.append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return page;
    }
}
