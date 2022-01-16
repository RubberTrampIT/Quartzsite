package com.rubbertrampit.quartzsite;

final class CombineResults {
    private final String first;
    private final String second;

    public CombineResults(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public static CombineResults combine(String item1, String item2){


        return new CombineResults(item1, item2);
    }
}


