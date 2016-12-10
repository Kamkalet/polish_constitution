package com.constitution;

import java.util.List;

/**
 * Created by AD on 02.12.2016.
 */


public class Chapter {

    private int number;
    private String name;
    private List<Article> articleList;

    public Chapter(List<Article> articleList, int number, String name){

        this.number = number;
        this.name = name;
        this.articleList = articleList;

    }

    // zwroc wszystkie artykuly
    public String toString(){

        return name;

    }

    public String getName(){

        return name;

    }
    public int getNumber(){

        return number;

    }
    public List<Article> getArticleList(){

        return articleList;

    }

}
