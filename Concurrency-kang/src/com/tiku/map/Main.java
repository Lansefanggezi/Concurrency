package com.tiku.map;
    import java.util.Arrays;  
    import java.util.Scanner;  
      
    public class Main{  
        public static void main(String[] args){  
      
            long[] scores=new long[100];  
            boolean[] flag=new boolean[100];  
            int nums;  
            Scanner sc=new Scanner(System.in);  
            while(sc.hasNextInt()){  
                nums=sc.nextInt();  
                for(int m=0;m<10;m++){  
                    scores[m]=0l;  
                    flag[m]=false;  
                }  
                for(int i=0;i<nums;i++){   
                    String a=sc.next();  
                    int la=a.length();  
                    for(int j=0;j<la;j++){  
                        int indexnow=a.charAt(j)-65;  
                        scores[indexnow]+=(long)(Math.pow(10,la-j-1));  
                        if(j==0&&la>1)  
                            flag[indexnow]=true;  
                        }  
                }     
                int digit=1,firstdigit=1;long result=0;long firstDigit=5000000000000l;  
                for(int i=0;i<10;i++){  
                    if(scores[i]<firstDigit&&flag[i]==false){  
                        firstDigit=scores[i];  
                        firstdigit=i;  
                    }                 
                }  
                for(int i=firstdigit;i<9;i++){  
                    scores[i]=scores[i+1];  
                }  
                Arrays.sort(scores,0,9);  
                for(int i=0;i<9;i++){  
                    result+=scores[i]*digit;  
                    digit++;  
                }  
                System.out.println(result);  
                }  
            }  
              
      
    }  