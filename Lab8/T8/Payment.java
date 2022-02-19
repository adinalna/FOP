/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8;

/**
 *
 * @author adina
 */
//4
import java.util.Scanner;
public class Payment {
    private double amount;
    private int chequeNum, validCode;
    private String paymentType, cardName, cardType, cardExpire;

    public Payment() {
        amount=0;
        chequeNum=0;
        cardName="";
        cardType="";
        cardExpire="";
        validCode=0;
        paymentType="";
    }

    //Mutator
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setChequeNum(int chequeNum) {
        this.chequeNum = chequeNum;
    }

    
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCardExpire(String cardExpire) {
        this.cardExpire = cardExpire;
    }
    
     public void setValidCode(int validCode) {
        this.validCode = validCode;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    
    //Accessor 
    public double getAmount() {
        return amount;
    }

    public int getChequeNum() {
        return chequeNum;
    }


    public String getCardName() {
        return cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardExpire() {
        return cardExpire;
    }
    
    public int getValidCode() {
        return validCode;
    }
    
    public String getPaymentType() {
        return paymentType;
    }

    public void payBy(double a){
        amount=a;
        System.out.println("Total pay by cash "+amount);
    }
    
    /*
    public void payBy(double a,String c){
        amount=a;
        chequeNum=c;
        System.out.println("Total pay by cheque: "+amount);
        System.out.println("Cheque number: "+chequeNum);
    }
    
    public void payBy(double a, String cn, String ct, String ce, int vc){
        amount=a;
        cardName=cn;
        cardType=ct;
        cardExpire=ce;
        validCode=vc;
    
        System.out.println("Total pay by credit card: "+amount);
        System.out.println("Credit Card name: "+cardName);
        System.out.println("Card type: "+cardType);
        System.out.println("Validation code: "+validCode);
    }
    */
        
    }
    
    

