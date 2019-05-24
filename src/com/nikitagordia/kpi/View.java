package com.nikitagordia.kpi;

import java.util.Scanner;

public class View {

    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public String read() {
        suggestInput();
        return scanner.nextLine();
    }

    public void suggestInput() {
        System.out.println("\nPrint count of circles:");
    }

    public void alert(String message) {
        System.out.println(message);
    }
}

