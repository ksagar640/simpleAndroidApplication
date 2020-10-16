package com.example.myapplication;

public class word {
    private String english;
    private String translation;
    private int src = -1;
    public word(String a , String b)
    {
        english = a;
        translation = b;
    }
    public word(String a , String b , int c)
    {
        english = a;
        translation = b;
        src = c;
    }
    public String getEnglish()
    {
        return english;
    }
    public String getTranslation() { return translation; }
    public int getSrc() { return src; }
    public boolean hasImage(){
        return src!=-1;
    }
}
