package com.task3.task3;

public class Calculator {
    private int result;
    private int variable1;
    private int variable2;
    private String operation;

    public void count(int v1, int v2, String operation){
        int res;
        switch (operation){
            case "plus" -> res = v1 + v2;
            case "minus" -> res = v1 - v2;
            case "multiplication" -> res = v1 * v2;
            case "division" -> {if (v2 == 0) throw new NullPointerException();
                res = v1 / v2;}
            default -> throw new NullPointerException();
        }
        this.result = res;
        this.variable1 = v1;
        this.variable2 = v2;
        this.operation = operation;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
