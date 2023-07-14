package ch5;

import java.io.*;

public class ArrayEx6 {
    public static void main(String[] args) throws IOException {
        int[] score = new int[6];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<score.length; i++){
            score[i] = Integer.parseInt(br.readLine());
        }

        int max = score[0];
        int min = score[0];

        for(int i=1; i<score.length; i++){
            if(score[i] > max){
                max = score[i];
            }
            else if(score[i] < min){
                min = score[i];
            }
        }

        bw.write("max = "+max+"\n");
        bw.write("min = "+min+"");

        bw.flush();
        bw.close();
    }
}
