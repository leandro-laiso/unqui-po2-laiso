package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

    private List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }


    public int getEvenOcurrences() {
        int counter = 0;
        for (int n: numbers) {
            if (n % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }


}
