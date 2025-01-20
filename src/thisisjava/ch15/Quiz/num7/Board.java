package thisisjava.ch15.Quiz.num7;

import javax.print.DocFlavor;

public class Board {
    private String title;
    private String content;

    public Board(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
}
