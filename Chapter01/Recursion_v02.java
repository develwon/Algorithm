// Created on iPad (2).

class Main {
    public static void main(String[] args) {
        /*
         * Recursion Algorithm version 02 
         *  
         * 
         * 
         * 
         * 
         * 
         */
         int result = Recursion(100);
         System.out.println("Total Odd number = " + result);
    }
    public static void Recursion(int num){
        if(num == 0){
            return 0;
        }else{
            return num + Recursion(num-1);
        }
    }
}