package com.chen.news.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chen on 2016-12-13.
 */

public class News {
    public int status;

    public String error;
    public int count;

    @SerializedName("data")
    public List<Data> dataList;
}
