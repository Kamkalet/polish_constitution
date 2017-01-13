package com.constitution;

import java.util.List;

/**
 * Created by AD on 02.12.2016.
 */
public class Service {

    private Constitution polishConstitution;

    public Service(Constitution a){

        this.polishConstitution = a;

    }

    public void parse(String args[]) throws IllegalArgumentException {

        if(args[1].equals("R")){

            int number = Integer.parseInt(args[2]);
            if((number < 1) || (number > 13)) throw new IllegalArgumentException();
            System.out.println(polishConstitution.getChapter(Integer.parseInt(args[2])));


        }
        else if(args[1].equals("A")){

            if(!args[2].contains("-")){

                int number = Integer.parseInt(args[2]);
                if((number < 1) || (number > 243)) throw new IllegalArgumentException();
                System.out.println(polishConstitution.getArticle(number));

            }
            else{

                String firstNumber = args[2].substring(0, args[2].indexOf("-"));
                String secondNumber = args[2].substring(args[2].indexOf("-")+1, args[2].length());
                if(Integer.parseInt(firstNumber) < 1 || Integer.parseInt(firstNumber) > 243) throw new IllegalArgumentException();
                if(Integer.parseInt(secondNumber) < 1 || Integer.parseInt(secondNumber) > 243) throw new IllegalArgumentException();

                List<Article> list = polishConstitution.
                        getRangeOfArticles(Integer.parseInt(firstNumber),Integer.parseInt(secondNumber));
                for(Article a : list){

                    System.out.println(a);

                }

            }

        }
        else{

            throw new IllegalArgumentException();

        }

    }


}
