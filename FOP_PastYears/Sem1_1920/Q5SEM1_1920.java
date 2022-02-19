/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1920;

/**
 *
 * @author adina
 */
public class Q5SEM1_1920 {
    public static void main(String[] args) {
        
        Job J1 = new Job("J1",252,20);
        Job J2 = new Job("J2",108,10);
        Job J3 = new Job("J3",72,25);
        
        CloudPackage package1 =new CloudPackage("P2-15",4,15,1.24);
        CloudPackage package2 =new CloudPackage("P2-30",6,30,2.11);
        CloudPackage package3 =new CloudPackage("R5-20",4,20,1.38);
        CloudPackage package4 =new CloudPackage("R6-20",6,20,1.88);
        
        Job[]JobList={J1,J2,J3};
        CloudPackage[]PackagesList={package1,package2,package3,package4};
        
        double total=0;
        for(int i=0;i<JobList.length;i++){
            double minCost=Double.MAX_VALUE;
            int minIndex=-1;
            System.out.println(JobList[i].toString());
            for(int j=0;j<PackagesList.length;j++){
                if(PackagesList[j].check(JobList[i]))
                    if(PackagesList[j].totalCost(JobList[i])<minCost){
                        minCost=PackagesList[j].totalCost(JobList[i]);
                        minIndex=j;
                    }
            }
            total+=PackagesList[minIndex].totalCost(JobList[i]);
            System.out.println(PackagesList[minIndex].toString());
        }
        System.out.printf("Total Cost : %.2f\n",total);
            
    }
}
