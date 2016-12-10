package com.constitution;

/**
 * Created by AD on 02.12.2016.
 */

public class Article {

    private String content;
    private int number;

    public Article(String content, int number){

        this.content = content;
        this.number = number;

    }


    public String toString(){

        return content;

    }

    public String getContent(){

        return content;

    }

    public int getNumber(){

        return number;

    }

}
