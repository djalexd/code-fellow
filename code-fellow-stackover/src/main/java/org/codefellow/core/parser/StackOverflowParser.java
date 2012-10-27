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

import org.codefellow.core.SearchResult;
import org.codefellow.core.search.StackOverflowResult;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 * @author abserban
 * @since 2012
 */
public class StackOverflowParser {
    public List<SearchResult> parse(StringBuffer page) {
        List<SearchResult> result = new ArrayList<SearchResult>();

        try {
            JSONObject obj = new JSONObject(page.toString());
            JSONArray items = obj.getJSONArray("items");
            int total = items.length();
            for(int i=0;i<total;i++){
                JSONObject item = (JSONObject)items.get(0);
                String title = (String)item.get("title");
                String link = (String)item.get("link");
                link="https://github.com/"+link;
                JSONArray tags = (JSONArray) item.get("tags");

                String body = "";
                int count = tags.length();
                for(int j=0;j<count;j++){
                  body+=(String)tags.get(j);
                }
                result.add(new StackOverflowResult(title, body, link));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

}
