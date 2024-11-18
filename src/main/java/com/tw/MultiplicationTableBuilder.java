package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 1000;

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String tableRow = builder.generateTableRow(4, 2);

        System.out.println("tableRow: " + tableRow);
    }

    public String generateMultiplicationTable(int start, int end) {
        return "";
    }

    private String generateTableRow(int lineNumber, int start) {
        return IntStream.rangeClosed(start, lineNumber)
                .mapToObj(item -> String.format("%d*%d=%d", item, lineNumber, item * lineNumber))
                .collect(Collectors.joining(" "));
    }

    private boolean checkInputLegal(int startNumber, int endNumber) {
        if (checkNumberInRange(startNumber) && checkNumberInRange(endNumber)
                && startIsLessThanEnd(startNumber, endNumber)) {
            return true;
        }
        return false;
    }

    private boolean checkNumberInRange(int number) {
        return number >= MIN_NUMBER && number <= MAX_NUMBER ? true : false;
    }

    private boolean startIsLessThanEnd(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }
}
