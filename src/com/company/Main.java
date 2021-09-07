package com.company;

public class Main {

    public static void main(String[] args) {
	int[] in;
        in = new int[]{1,2,3,4,5,6,7,8,9};
        int[] out = new int[in.length];
        out[0] = in[0];
        for (int i = 1; i < out.length; i++)
            out[i] = out[i-1] + in[i];

        for (int j : out) System.out.print(j + " ");
    }
    }

