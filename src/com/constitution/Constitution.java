package com.constitution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by AD on 02.12.2016.
 */
public class Constitution {

    List<Chapter> chapterList;
    List<Article> articleList;

    public Constitution(List<Chapter> chL, List<Article> artL){

        this.chapterList = chL;
        this.articleList = artL;

    }

    public List<Article> getRangeOfArticles(int beginning, int end){

        List<Article> subArray = new ArrayList<Article>();

        for(int i = beginning-1; i<= end-1; i++){

            subArray.add(articleList.get(i));

        }

        return subArray;

    }

    public Article getArticle(int number){

        return articleList.get(number-1);

    }

    public Chapter getChapter(int number){

        return chapterList.get(number-1);

    }

}
