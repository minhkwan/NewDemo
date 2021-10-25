package com.example.dictionary_oop1;

import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
    private static ArrayList<Word> wordArrayList = new ArrayList<>();

    public static void addWord(Word s) {
        wordArrayList.add(s);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong tu them vao du lieu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String target = sc.next();
            String explain = sc.nextLine();
            addWord(new Word(target, explain));
        }
    }

    public static void output() {
        System.out.println("No         |English                     |Vietnamese");
        for (int i = 0; i < wordArrayList.size(); i++) {
            int a = i + 1;
            String eng = wordArrayList.get(i).getWord_target();
            int length = eng.length();
            String vni = wordArrayList.get(i).getWord_explain();
            System.out.print(a + "          |" + eng);
            for (int j = 0; j < 29 - length - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|" + vni);
        }
    }

    public static ArrayList<Word> getWordArrayList(){
        return wordArrayList;
    }
}
