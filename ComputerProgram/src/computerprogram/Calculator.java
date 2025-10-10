/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computerprogram;

/**
 *
 * @author DELL
 */
public class Calculator {

    private double memory;

    public Calculator(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Calculator{" + "memory=" + memory + '}';
    }

    public void calculate(double num, String operator) {
        switch (operator) {
            case "+" :{
                memory += num;
                break;
            }
            case "-":{
                memory -= num;
                break;
            }
            case "*":{
                memory *= num;
                break;
            }
            case "/":{
                if(num == 0){
                    System.out.println("Error");
                }else{
                    memory /= num;
                }
                break;
            }
            default:{
                System.out.println("Please input (+, -, *, /, ^)");
                return;
            }
        }
    }
}
