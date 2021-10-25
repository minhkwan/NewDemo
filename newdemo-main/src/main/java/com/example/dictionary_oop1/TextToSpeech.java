package com.example.dictionary_oop1;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class TextToSpeech {

    private String voiceName = "kevin16";
    private Voice voice;

    public TextToSpeech(String name) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        this.voiceName = name;
        this.voice = VoiceManager.getInstance().getVoice(this.voiceName);
    }

    public void speak(String word) {
        this.voice.allocate();
        this.voice.speak(word);
        this.voice.deallocate();
    }

}
