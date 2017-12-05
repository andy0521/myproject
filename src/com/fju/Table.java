package com.fju;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] =new int [5][3];
		score[0][0]=7;score[0][1]=8;score[0][2]=9;
		score[1][1]=1;	score[1][2]=2;	score[1][0]=3;
		score[2][1]=4;score[2][2]=5;score[2][0]=6;
		score[3][1]=7;
		score[3][2]=8;
		score[3][0]=9;
		score[4][0]=1;score[4][1]=1;score[4][2]=1;
		for (int i=0;i<5;i++){
			System.out.print(score[i][1]+" "+score[i][2]+" "+score[i][0]);
			System.out.println();
		}
		
	}

}
