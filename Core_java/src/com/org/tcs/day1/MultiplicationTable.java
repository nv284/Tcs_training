package com.org.tcs.day1;

public class MultiplicationTable {
public static void main(String[] args) 
{
   int row = 1;
// Outer while loop for rows
   while (row <= 10) 
   {
       int column = 1;

    // Inner while loop for columns
       while (column <= 10) 
       {
           int result = row * column;
           System.out.print(result + "\t");
           column++;
        }
       System.out.println(); // Move to the next row after printing all columns
       row++;
      }
    }
}