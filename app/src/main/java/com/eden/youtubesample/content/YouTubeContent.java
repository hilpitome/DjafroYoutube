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
        addItem(new YouTubeVideo("5WjhzPTjX0E", "S.P.L.A"));
        addItem(new YouTubeVideo("4OSSSp1qKQE", "Legend of The Drunken Master FULL MOVIE 1994 (Jackie Chan)"));
        addItem(new YouTubeVideo("uAVfgwH32vU", "Open in the Standalone player in fullscreen"));
        addItem(new YouTubeVideo("8VRSTh-mXzQ", "DJ AFRO AMINGOS-Fight the Fight {part 2}"));
        addItem(new YouTubeVideo("3PkC4J6Wju0", "Dj afro~legedary assasin"));
        addItem(new YouTubeVideo("SWy3kof-WZI", "DJ Afro a.k.a Kimonda"));
        addItem(new YouTubeVideo("fEVxyyq4Rmg", "DJ AFRO AMIGOS strike commando"));
        addItem(new YouTubeVideo("ERGav_N3YVM", "CDj Afro- City of Violence (Part One)"));
        addItem(new YouTubeVideo("YZUBiASOEHE", "Dj Afro the Boss (Part 2) And (Kicks of Heat Part 1)"));
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