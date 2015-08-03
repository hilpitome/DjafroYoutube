package com.eden.youtubesample.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/***********************************************************************************
 * The MIT License (MIT)

 * Copyright (c) 2015 Scott Cooper

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 ***********************************************************************************/


/**
 * A Helper class for providing mock data to the app.
 * In a real world scenario you would either hard code the video ID's in the strings file or
 * retrieve them from a web service.
 */
public class YouTubeContent {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("jGHbJKENf1k", "the dragon part 1"));
        addItem(new YouTubeVideo("V0PBfT9Uwxk", "Open in the YouTube App in fullscreen"));
        addItem(new YouTubeVideo("fEVxyyq4Rmg", "Open in the Standalone player in fullscreen"));
        addItem(new YouTubeVideo("XDiNh1-Qn_8", "Open in the Standalone player in \"Light Box\" mode"));
        addItem(new YouTubeVideo("KfL_s5mNn44", "Open in the YouTubeFragment"));
        addItem(new YouTubeVideo("dTQkQqAE_xQ", "Hosting the YouTubeFragment in an Activity"));
        addItem(new YouTubeVideo("8VRSTh-mXzQ", "Open in the YouTubePlayerView"));
        addItem(new YouTubeVideo("3PkC4J6Wju0", "Custom \"Light Box\" player with fullscreen handling"));
        addItem(new YouTubeVideo("XDiNh1-Qn_8", "Custom player controls"));
    }

    private static void addItem(final YouTubeVideo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A POJO representing a YouTube video
     */
    public static class YouTubeVideo {
        public String id;
        public String title;

        public YouTubeVideo(String id, String content) {
            this.id = id;
            this.title = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}