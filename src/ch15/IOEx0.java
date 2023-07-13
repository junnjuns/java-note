package ch15;

import java.io.*;
import java.util.StringTokenizer;

public class IOEx0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        bw.write("ads");
        bw.newLine();
        bw.flush();

        StringTokenizer st = new StringTokenizer(s);
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        System.out.println("STZ = " + s1);
        System.out.println("STZ = " + s2);

        String[] arr = s.split(" ");
        for (String s3 : arr) {
            System.out.println("s3 = " + s3);
        }

    }
}
