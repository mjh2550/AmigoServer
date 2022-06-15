package com.spring.amigo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.*;
import java.util.Scanner;

import static java.lang.Math.min;

class codetest {
    /*
     * 2022-06-14
     * @Author 문호환 (Main)
     * @param
     * @return
     */
    static long L;
    @Test
    public void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        L = (x2 - x1) * (y2 - y1) * (c + 1);
        if (f <= W / 2) {
            if (f <= x1) {
                System.out.println(W * H - L);
            }
            else {
                System.out.println(W * H - (L + (min(f, x2) - x1) * (y2 - y1) * (c + 1)));
            }
        }
        else {
            if (W <= x1+f) {
                System.out.println(W * H - L);
            }
            else {
                System.out.println(W * H - (L + (min(W, f + x2) - (f + x1)) * (y2 - y1) * (c + 1)));
            }
        }
    }
}
