package com.tw;

public class MultiplicationTableBuilder {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 1000;

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        boolean startIsLessThanEnd = builder.startIsLessThanEnd(start, end);

        System.out.println("startIsLessThanEnd: " + startIsLessThanEnd);
    }

    public String generateMultiplicationTable(int start, int end) {
        return "";
    }

    private boolean checkNumberInRange(int number) {
        return number >= MIN_NUMBER && number <= MAX_NUMBER ? true : false;
    }

    private boolean startIsLessThanEnd(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }
}
