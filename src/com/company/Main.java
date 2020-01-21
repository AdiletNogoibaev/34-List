package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i<50; i++) {
            List.add(rd.nextInt(100-1)+1);
            System.out.println(List.get(i)+" "+ i);
        }
        ArrayList<Integer> chetnue = new ArrayList<>();
        for (int e : List){
            if (e % 2 == 0){
                chetnue.add(e);
            }

        }
        System.out.println(chetnue);

        ArrayList<Integer> nechetnue = new ArrayList<>();
        for (int e : List) {
            if (e % 2 != 0) {
                nechetnue.add(e);
            }
        }
        System.out.println(nechetnue);
    }
}
