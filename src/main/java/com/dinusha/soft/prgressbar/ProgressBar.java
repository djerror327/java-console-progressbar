package com.dinusha.soft.prgressbar;

public class ProgressBar {
    public static void main(String[] args) {
        userAdd();
    }


    private static final StringBuffer bar = new StringBuffer("");
    private static int percentageCurent;

    static void progressBar(final double currentVal, final double totalCount) {

        int percentage = (int) ((currentVal / totalCount) * 100);
        if (percentageCurent == percentage) {
            percentageCurent++;
            bar.append("#");
        }
        System.out.print("[" + bar +" "+  percentage + "%]\r");
    }

    static void userAdd() {
        for (int i = 0; i <= 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("user allocation created for user : " + i);
            progressBar(i, 1000);
        }
    }
}
