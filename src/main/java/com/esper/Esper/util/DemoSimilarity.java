package com.esper.Esper.util;

import org.apache.commons.text.similarity.HammingDistance;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class DemoSimilarity {

    private static LevenshteinDistance lv = new LevenshteinDistance();
    private static JaroWinklerDistance jaro = new JaroWinklerDistance();
    private static HammingDistance hmm = new HammingDistance();

    public static void main(String[] args) {
        String s =  "000000000000000000011100011110011000001100000111101101110111000000011100111111011100000000000000";
        String s1 = "000000000000000000001100100000000011100000000000100000000100101100100001001000110110100000000000";
        similarityRatio(s, s1);
    }

    public static void similarityRatio(String s, String s1) {
        double lvDistance =  1 - ((double) lv.apply(s, s1)) / Math.max(s.length(), s1.length());
        System.out.println("LevenshteinDistance: "+lvDistance);
        double jaroDistance = jaro.apply(s, s1);
        System.out.println("JaroWinklerDistance: "+jaroDistance);
        double harmmi = hmm.apply(s, s1);
        System.out.println("HammingDistance: "+harmmi);
    }


}
