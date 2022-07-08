package com.aravindh;

import java.util.Scanner;

public class SumOfPrimeIndex {

	public static void main(String[] args)
	            {
	                        int n, i,j,count=0,sum=0,temp=0,avg;
	                        Scanner in=new Scanner(System.in);
	                        n = in.nextInt();
	                        if(n < 0)
	                        {
	                                    System.out.print("Invalid array size");
	                                    System.exit(0);
	                        }
	                        else
	                        {
	                          int a[]=new int[100];
	                          for(i = 1; i<=n; i++)
	                          {
	                           a[i] = in.nextInt();
	                          if(a[i] < 0)
	                            {
	                            System.out.print("Invalid input");
	                           System.exit(0);
	                                                }
	                             }
	                             for(i=1;i<=n;i++)
				                 {
	                            	 count=0;
	                           for(j=1;j<=i;j++)
					            {
	                        	   if(i%j==0)
	                                 count++;
	                              }
	                              if(count==2)
					               {
	                               sum = sum+a[i];
	                                temp++;
	                                }
	                                    }
	                                avg=sum/temp;
	                                    System.out.print(avg);
	                        }
	            }
	}


//	private static int primeIndexSum(int[] array, int size) {
////		int sum = 0;
////		int count=0;
////		boolean flag=true;
////		for(int i=1;i<=size;i++) { // 2 4 5 1 9 3 8
////		  for(int j=1;j<=i;j++) {
////			  if(i%j==0) {
////				  flag=false;
////			  }
////			  if(flag)
////				  sum+=array[i];
////		  }
////				
////		}
////		return sum;
//		int count=0;
//		for (int i = 1; i <= n; i++) {
//			count = 0;
//			for (j = 1; j <= i; j++) {
//				if (i % j == 0)
//					count++;
//			}
//			if (count == 2) {
//				sum = sum + a[i];
//				temp++;
//			}
//		}
//		avg = sum / temp;
//		System.out.print(avg);
//
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the size");
//		int size = scanner.nextInt();
//		int[] array = new int[size];
//		if (size <= 0) {
//			System.out.println("invalid array size");
//		} else {
//
//			System.out.println("enter the elements");
//			for (int i = 0; i < size; i++) {
//				array[i] = scanner.nextInt();
//				if (array[i] < 0) {
//					System.out.println("invalid input");
//					break;
//				}
//			}
//		}
//		System.out.println("sum is " + primeIndexSum(array, size));
//	}

