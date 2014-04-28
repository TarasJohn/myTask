package com.gh;

import java.util.Random;

public class Mass {
	
	public int[][] crtMass(int n, int k){
		Random massgen = new Random();
		int[][] mArr = new int[n][k];
		for(int i = 0; i < n; i++ ){
			for(int j = 0; j < k; j++ ){
				
				mArr[i][j] = massgen.nextInt(20);
			}
		}
		
		return mArr;
	}
	
	public int[][] replMass(int[][] Arr){
		for(int i = 0; i < Arr.length; i++ ){
			for(int j = 0; j < Arr[i].length; j++ ){
				if(Arr[i][j] < 10){
					Arr[i][j] = 0;
				}
			 }
			}
		return Arr;
	}
		
	public void prntMass(int[][] Arr){
		for(int i = 0; i < Arr.length; i++ ){
			for(int j = 0; j < Arr[i].length; j++ ){
				System.out.print(" " + Arr[i][j]);
			  }
			System.out.println();
			}
	}
	
	public void task(int n, int k){
		int [][] taskArr = crtMass(n, k);
		taskArr = replMass(taskArr);
		prntMass(taskArr);	
		
	}
	public static void main (String[] args) {
	
		Mass taskobj = new Mass();
		taskobj.task(4, 5);
	}

}
