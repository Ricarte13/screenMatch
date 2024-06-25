package br.com.alura.screenMatch.calculations;

import br.com.alura.screenMatch.model.Title;

public class timeCalculator {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title title) {
        totalTime += title.getDurationInMinutes();
    }
}
