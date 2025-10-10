/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computerprogram;

/**
 *
 * @author DELL
 */
public class Bmi {
    private double height, weight;

    public Bmi(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bmi{" + "height=" + height + ", weight=" + weight + '}';
    }
    
    public double bmiCalculate(){
        return weight / ((height /100) * (height /100));
    }
}
