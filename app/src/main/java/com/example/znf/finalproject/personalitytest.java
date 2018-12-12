package com.example.znf.finalproject;

public class personalitytest {
    private static int extraversionScore = 0;
    private static int agreeablenessScore = 0;
    private static int conscientiousnessScore = 0;
    private static int neuroticismScore = 0;
    private static int ExperienceOpennessScore=0;
    private static int[] scores;

    public static int[] getScores() {
        scores = new int[] {extraversionScore,
                agreeablenessScore,
                conscientiousnessScore,
                neuroticismScore,
                ExperienceOpennessScore};
        return scores;
    }
    public static void add(int score, String nameOfP) {
        if (nameOfP.equals("extraversionScore")) {
            extraversionScore += score;
        }
        if (nameOfP.equals("agreeablenessScore")) {
            agreeablenessScore += score;
        }
        if (nameOfP.equals("conscientiousnessScore")) {
            conscientiousnessScore += score;
        }
        if (nameOfP.equals("neuroticismScore")) {
            neuroticismScore += score;
        }
        if (nameOfP.equals("ExperienceOpennessScore")) {
            ExperienceOpennessScore += score;
        }
    }

}
