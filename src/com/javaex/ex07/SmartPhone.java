package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if("앱".equals(str)) {
        	playApp();
        }
        else {
        	super.execute(str);
        }
    }
 
    //메소드작성
    private void playApp() {
    	System.out.println("앱실행");
    }
   
    //메소드작성
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
}
