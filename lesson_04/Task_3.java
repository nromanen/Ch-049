package lesson_04;

import java.util.Random;

public class Task_3 {
	
    public static void main(String[] args) {
        Random rm = new Random();
    	int a[] = new int[5];        
        for (int i = 0; i < a.length; i++) {           
            a[i] =rm.nextInt(20)-10;
        }
        for(int x: a){
        	System.out.print(x + ", ");
        }
        System.out.println();
        
        System.out.println("Minimum is " + min(a));
        
        int x = 0;
        int i = 0;
        
        for(i = 0; i < a.length; i++){
        	if (a[i] > 0){
        		x++;
        	if(x == 2){
        		System.out.println("Second positive is " + a[i]);
        		break;
        		}
        	}
        	}if(x != 2){
        		System.out.println("Array does not have two positive number.");
    		}
        }
    
    public static int min (int [] a){
    	int min = a[0];
    	int i;
    	for(i = 0; i < a.length; i++){
    		if(a[i] < min){
    			min = a[i];
    		}
    	} return min;
    } 
    }