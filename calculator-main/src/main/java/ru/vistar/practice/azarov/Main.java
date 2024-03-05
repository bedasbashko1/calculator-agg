package ru.vistar.practice.azarov;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    
        System.out.println(calculator.add(
            Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}