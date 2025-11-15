package com.farzadmoradkhani;

import java.time.LocalDateTime;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import org.fusesource.jansi.Ansi.Color;

public class PrettyLogger {
    public PrettyLogger(){
        AnsiConsole.systemInstall();
    }
    enum LogLevel{
        INFO("info")
        ,DEBUG("debug")
        ,ERROR("error")
        ,WARNING("warning");
        String levelValue;
        public String getValue() {
            return levelValue;
        }
        LogLevel(String string) {
            levelValue=string;
        }
        
    }
    private static void print(String tag,String message,LogLevel level){
        System.out.print(Ansi.ansi().reset());
        String text="";
        switch (level) {
            case INFO:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().fg(Color.GREEN).a(text).reset());
                break;
            case DEBUG:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().fg(Color.CYAN).a(text).reset());
                break;
            case ERROR:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().fg(Color.RED).a(text).reset());
                break;
            case WARNING:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().fg(Color.YELLOW).a(text).reset());
                break;
        
            default:
                break;
        }
    }
    private static void printBG(String tag,String message,LogLevel level){
        System.out.print(Ansi.ansi().reset());
        String text="";
        switch (level) {
            case INFO:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().bg(Color.GREEN).a(text).reset());
                break;
            case DEBUG:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().bg(Color.CYAN).a(text).reset());
                break;
            case ERROR:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().bg(Color.RED).a(text).reset());
                break;
            case WARNING:
                text=putBraks(LocalDateTime.now().toString())+" "+putBraks(level.getValue())+" "+putBraks(tag)+": "+message;
                System.out.println(Ansi.ansi().bg(Color.YELLOW).a(text).reset());
                break;
        
            default:
                break;
        }
    }
    
    
    private static String putBraks(String s){
        return "["+s+"]";
    }

    public static void printInfo(String tag,String message){
        print(tag, message, LogLevel.INFO);
    }
    public static void printDebug(String tag,String message){
        print(tag, message, LogLevel.DEBUG);
    }
    public static void printError(String tag,String message){
        print(tag, message, LogLevel.ERROR);
    }
    public static void printWarining(String tag,String message){
        print(tag, message, LogLevel.WARNING);
    }


    public static void printInfo(String tag,String message,boolean useBackground){
        printBG(tag, message, LogLevel.INFO);
    }
    public static void printDebug(String tag,String message,boolean useBackground){
        printBG(tag, message, LogLevel.DEBUG);
    }
    public static void printError(String tag,String message,boolean useBackground){
        printBG(tag, message, LogLevel.ERROR);
    }
    public static void printWarining(String tag,String message,boolean useBackground){
        printBG(tag, message, LogLevel.WARNING);
    }

}
