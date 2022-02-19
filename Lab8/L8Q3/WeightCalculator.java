/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q3;

/**
 *
 * @author adina
 */
public class WeightCalculator {
    private int age;
    private double height, recommendedWeight;

    public WeightCalculator() {
        age=0;
        height=0;
        recommendedWeight=0;
    }
   
    public void Input(int age,double height){
        this.age=age;
        this.height=height;
}
    
    public void CalRecommendedWeight(){
        recommendedWeight = (height-100+(age/10))*0.9;
    }   
    
    public void Display(){
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Recommended Weight: "+recommendedWeight);
    }
    
}
