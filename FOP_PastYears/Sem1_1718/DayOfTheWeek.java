/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1718;

/**
 *
 * @author adina
 */
public class DayOfTheWeek {
    private int h,q,m,y,J,K;

    public DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
        if(m>12){
            this.m-=12;
        }
        J=y/100;
        K=y%100;
    }
    
    public Boolean ValidDay(){
        if (q==0)
            return false;
        if((y%4==0&&y%100!=0)||y%400==0){
            if(m==2&&q>29)
                return false;
        }
        else if (m==2&&q>28){
            return false;
        }
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            if(q>31)
                return false;
        }
        else if(m==4||m==6||m==9||m==11){        
            if(q>30)  
                return false;
        }
        else{
            return true;
        }
        return true;
    }

    public String toString() {
        h=(q+((13*(m+1))/5)+K+(K/4)+(J/4)+(5*J))%7;
        String day=null;
        if(ValidDay()==true){
            switch(h){
                case 0:
                    day="Saturday";
                    break;
                case 1:
                    day="Sunday";
                    break;
                case 2:
                    day="Monday";
                    break;
                case 3:
                    day="Tuesday";
                    break;
                case 4:
                    day="Wednesday";
                    break;
                case 5:
                    day="Thursday";
                    break;
                case 6:
                    day="Friday";
                    break;
            }
            return  q+"/"+m+"/"+y+" is on "+day;
        }
        else if(ValidDay()==false)  
            return q+"/"+m+"/"+y+" is invalid Input";
        return null;
    }
    
    
}
