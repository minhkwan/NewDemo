package com.example.dictionary_oop1;

import java.io.IOException;

public class DictionaryCommandline {
    public static void showAllWords() {
        Dictionary.output();
    }

    public static void dictionaryBasic() {
        DictionaryManagement.insertFromCommandline();
        showAllWords();
    }

    public static void dictionaryAdvanced() throws IOException {
        DictionaryManagement.insertFromFile();
        showAllWords();
        DictionaryManagement.deleteWord();
        DictionaryManagement.editWord();
        DictionaryManagement.dictionayExportToFile();
    }
}
