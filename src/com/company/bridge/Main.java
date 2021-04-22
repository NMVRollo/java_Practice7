package com.company.bridge;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Program> programs = List.of(
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        );

        for (Program program : programs) {
            program.developProgram();
        }
    }
}