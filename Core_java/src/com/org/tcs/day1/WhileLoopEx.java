package com.org.tcs.day1;

public class WhileLoopEx {
public static void main(String[] args) 
{
  int num = 1;
  int sum = 0;

  while (num <= 10) {
     if (num % 2 == 0) {
        sum += num;
    }
    num++;
  }
  System.out.println("Sum of even numbers between 1 and 10: " +sum);
  }
}