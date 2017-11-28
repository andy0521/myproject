package com.fju;

public class Dice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub排序城市 左變數字越小
        int n[] = {51,22,6,65,15};
        for (int i = 0 ;i<n.length;i++){
        	for (int j=0;j<n.length;j++){
        		if(n[i]< n[i+j]){
        			int  tmp =n[j];
        			n[j]=n[i];
        			n[i]= tmp;
        			int tmp1=n[i];
//        			int tmp1 = j;
//        					j=i;
//        					i=tmp1;
        			
        		}else{
        			continue;
        		}
        		
        	//	System.out.print(n[j]+ " ");
        		// int tmp =a 站存
        		//a=b;
        		//b=tmp;
        		
        	}
        }
	}

}
