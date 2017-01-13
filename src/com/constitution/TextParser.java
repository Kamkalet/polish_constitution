package com.constitution;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class TextParser {

    // parsuje text, tworzy obiekty i do nich zapisywane sa tresci
    public static Constitution parse(String fileName)  {

        List<Article> articleList = new ArrayList<Article>();
        List<Chapter> chapterList = new ArrayList<Chapter>();

        try {

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            String readLine;
            String chapterString = "Rozdział";

            while (!(readLine = bufferedReader.readLine()).contains(chapterString)) ;

            List<Article> articlesInChapter = new ArrayList<Article>();

            String chapter = readLine;
            String article = "";
            int chapterCounter = 1, articleCounter = 1;
            boolean newChap = true;
            while ((readLine = bufferedReader.readLine()) != null) {

                if (!(readLine.contains("Kancelaria") || readLine.contains("2009"))) {

                    if (readLine.contains(chapterString)) {

                        if (!newChap) {

                            Article newArticle = new Article(article, articleCounter);
                            articleList.add(newArticle);
                            articlesInChapter.add(newArticle);
                            articleCounter++;

                        }

                        Chapter newChapter = new Chapter(articlesInChapter, chapterCounter, chapter);
                        chapterList.add(newChapter);
                        chapter = "";
                        article = "";

                        chapterCounter++;
                        newChap = true;

                    }
                    if (readLine.contains("Art.")) {

                        if (!article.equals("")) {

                            Article newArticle = new Article(article, articleCounter);
                            articleList.add(newArticle);

                        }

                        articleCounter++;
                        newChap = false;
                        article = "";

                    }

                    if (readLine.charAt(readLine.length() - 1) == '-') {

                        readLine = readLine.substring(0, readLine.length() - 1);
                        chapter = chapter + readLine;

                        if (newChap == false)
                            article = article + readLine;

                    } else {

                        chapter = chapter + readLine + '\n';
                        char a = readLine.charAt(readLine.length() - 1);
                        if (!newChap && !Character.isUpperCase(a))
                            article = article + readLine + '\n';

                    }

                }

            }

            fileReader.close();



        }catch(FileNotFoundException ex){

            System.out.println("Nie ma takiego pliku");
            System.exit(1);

        }
        catch(IOException ex){

            System.out.println("Blad operacji wejscia/wyjscia");
            System.exit(1);

        }
        catch ( Exception ex){

            System.out.println();
            System.exit(1);

        }

        return new Constitution(chapterList, articleList);

    }

}
