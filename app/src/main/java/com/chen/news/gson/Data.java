package com.chen.news.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chen on 2016-12-13.
 */

public class Data {
    @SerializedName("news_id")
    public int newId;

    @SerializedName("title")
    public String title;

    @SerializedName("top_image")
    public String topImage;

    @SerializedName("text_image0")
    public String textImage0;

    @SerializedName("text_image1")
    public String textImage1;

    @SerializedName("source")
    public String source;

    @SerializedName("content")
    public String content;

    @SerializedName("digest")
    public String digest;

    @SerializedName("reply_count")
    public int replyCounts;

    @SerializedName("edit_time")
    public int editTime;

}
