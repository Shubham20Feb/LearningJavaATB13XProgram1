package ex_Test_26_String;

public class Test_Q_3_Performance {
    public static void main(String[] args) {

        int iterations = 100000;

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "A";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String concatenation: " + (endTime - startTime) + " ms");


        // 1. StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("A");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");

        // 2. StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("A");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");
    }
    }

