package com.farzadmoradkhani;


import com.farzadmoradkhani.PrettyLogger.LogLevel;

public class Main {
    public static void main(String[] args) {

        String tag = "DEVV";
        PrettyLogger.printInfo(tag, "This is an Info message.");
        PrettyLogger.printError(tag, "This is an Error message.");
        PrettyLogger.printWarining(tag, "This is a Warinig message.");
        PrettyLogger.printDebug(tag, "This is a Debug message.");
        
        PrettyLogger.printInfo(tag, "This is an Info message with background.",true);
        PrettyLogger.printError(tag, "This is an Error message with background.",true);
        PrettyLogger.printWarining(tag, "This is a Warinig message with background.",true);
        PrettyLogger.printDebug(tag, "This is a Debug message with background.",true);
        
    }
}