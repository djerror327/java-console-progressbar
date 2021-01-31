package com.dinusha.soft.prgressbar;

public class ProgressBar {
    public static void main(String[] args) {
        userAdd();
    }

    private static int livePercentage;
    static String[] progressSpaces = new String[100];

    static void progressBar(final double currentVal, final double totalCount) {

        if (currentVal == 0) {
            for (int i = 0; i < 100; i++) {
                progressSpaces[i] = "-";
            }
        }
        int percentage = (int) ((currentVal / totalCount) * 100);
        if (livePercentage == percentage) {

            if (percentage == 0) {
                progressSpaces[percentage] = "#";
            } else {
                progressSpaces[percentage - 1] = "#";
            }
            livePercentage++;

        }
        StringBuilder liveBar = new StringBuilder("");
        for (String val : progressSpaces) {
            liveBar.append(val);
        }
        System.out.print("[" + liveBar + "] " + percentage + "%\t\t" + currentVal + " out of " + totalCount + "\r");
    }

    static void userAdd() {
        for (int i = 0; i <= 500; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("user allocation created for user : " + i);
            progressBar(i, 500);
        }
    }
}
