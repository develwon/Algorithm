// Created on iPad (2).

class Main {
    public static void main(String[] args) {
        int maze[][] = {{0,0,0,0,0},{0,1,0,1,0},{0,0,1,1,1},{1,0,0,0,0},{0,0,1,1,0}};

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                System.out.print( maze[i][j] );
            }
         System.out.println();
        }

        int result = Recursion(0, 0);
        System.out.println(" Total Move to block  = " + result);
    }

    public static int Recursion(int num1, int num2){
        /*
         * array = start point (0,0) > end point(4,4)
         * 
         * 조건문의 시작을 어떻게 잡고 진행할지가 우선일듯
         * 
         *    
         */
         if(num1 == 0 &7 num2 == 0){
             
         }else{
             
         }
    }
}