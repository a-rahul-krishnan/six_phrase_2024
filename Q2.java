package q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = { in.nextLine(), in.nextLine(), in.nextLine() };
        String[] f = new String[3];
        String[] m = new String[3];
        String[] e = new String[3];
        for (int i = 0; i < 3; i++) {
            int n = s[i].length();
            switch (n % 3) {
                case 0:
                    f[i] = s[i].substring(0, n / 3);
                    m[i] = s[i].substring(n / 3, 2 * (n / 3));
                    e[i] = s[i].substring(2 * (n / 3), n);
                    break;
                case 1:
                    f[i] = s[i].substring(0, n / 3);
                    m[i] = s[i].substring(n / 3, 2 * (n / 3) + 1);
                    e[i] = s[i].substring(2 * (n / 3) + 1, n);
                    break;
                case 2:
                    f[i] = s[i].substring(0, n / 3 + 1);
                    m[i] = s[i].substring(n / 3 + 1, 2 * (n / 3) + 1);
                    e[i] = s[i].substring(2 * (n / 3) + 1, n);
                    break;
            }
        }
        String out1 = f[0] + m[1] + e[2];
        String out2 = m[0] + e[1] + f[2];
        String out3 = e[0] + f[1] + m[2];
        String s1 = "";
        for (int i = 0; i < out3.length(); i++) {
            if (Character.isUpperCase(out3.charAt(i)))
                s1 = s1 + Character.toLowerCase(out3.charAt(i));
            else
                s1 = s1 + Character.toUpperCase(out3.charAt(i));
        }
        out3 = s1;
        System.out.println("Output1 :" + out1 + "\nOutput2 :" + out2 + "\nOutput3 :" + out3);
    }
}