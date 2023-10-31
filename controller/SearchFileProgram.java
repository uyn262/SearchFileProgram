/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

/**
 *
 * @author Admin
 */
public class SearchFileProgram extends Menu<String> {
    static String[] options = {"Count Word In File", "Find File By Word", "Exit"};
    Algorithm ar;
    public SearchFileProgram() {
        super("========== Word Program ==========", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1: ar.countWordInFile();
                break;
            case 2: ar.findFileByWord();
                break;
            case 3: System.exit(0);
                break;
        }
    }
    
}
