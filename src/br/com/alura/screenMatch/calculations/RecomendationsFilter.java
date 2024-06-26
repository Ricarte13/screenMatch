package br.com.alura.screenMatch.calculations;

public class RecomendationsFilter {

    public void filter(Classificable classificable) {
        if (classificable.getClassification() >= 4) {
            System.out.println("One of the best!");
        }else if (classificable.getClassification() >= 2) {
            System.out.println("Great avaliation!");
            System.out.println("Great avaliation!");
        }else {
            System.out.println("Still worth to watch");
        }
    }
}
