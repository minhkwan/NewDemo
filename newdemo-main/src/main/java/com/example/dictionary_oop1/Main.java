package com.example.dictionary_oop1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Word> array = DictionaryManagement.insertFromFile();
        System.out.println(DictionaryManagement.dictionaryLookup("english"));
    }
}
