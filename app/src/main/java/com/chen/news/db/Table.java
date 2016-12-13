package com.chen.news.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chen on 2016-12-13.
 */

public class Table extends DataSupport{

    private int tableNum;
    private int page;
    private int pagesize;
    private String callback;
    private int justList;

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public int getJustList() {
        return justList;
    }

    public void setJustList(int justList) {
        this.justList = justList;
    }
}
