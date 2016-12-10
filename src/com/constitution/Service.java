package com.constitution;

import java.util.List;

/**
 * Created by AD on 02.12.2016.
 */
public class Service {

    Constitution polishConstitution;

    public Service(Constitution a){

        this.polishConstitution = a;

    }

    public void parse(String args[]){

        if(args[1].equals("R")){

            System.out.println(polishConstitution.getChapter(Integer.parseInt(args[2])));

        }
        else if(args[1].equals("A")){

            if(!args[2].contains("-")){

                System.out.println(polishConstitution.getArticle(Integer.parseInt(args[2])));

            }
            else{

                String firstNumber = args[2].substring(0, args[2].indexOf("-"));
                String secondNumber = args[2].substring(args[2].indexOf("-")+1, args[2].length());


                System.out.println(firstNumber);
                System.out.println(secondNumber);
                List<Article> list = polishConstitution.
                        getRangeOfArticles(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber));
                for(Article a : list){

                    System.out.println(a);

                }

            }

        }

    }


}
