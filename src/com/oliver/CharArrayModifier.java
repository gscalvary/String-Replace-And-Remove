package com.oliver;

public class CharArrayModifier {

    // Replace all 'a's with 'dd's and remove all 'b's.  The input array has enough space to contain the answer
    // (per the problem statement).
    public static void modify(char[] s) {

        if(s == null || s.length == 0) return;

        // Remove the b characters and count the a characters.
        int offset = 0;
        int aCount = 0;
        for(int i = 0; i < s.length; i++) {
            if(s[i] == 'b') {
                ++offset;
            } else {
                if(s[i] == 'a') aCount++;
                if(offset > 0) {
                    s[i - offset] = s[i];
                    s[i] = Character.MIN_VALUE;
                }
            }
        }

        // Replace the a characters with characters dd.
        offset = s.length - 1;
        for(int i = s.length - 1; i >= 0; i--) {
            if(s[i] != Character.MIN_VALUE) {
                if(s[i] == 'a') {
                    s[offset] = 'd';
                    s[--offset] = 'd';
                } else {
                    s[offset] = s[i];
                }
                --offset;
            }
        }
    }
}
