// Created on iPad (2).

class Main {
    static String[][] maze = new String[5][5];

    public static void main(String[] args) {
        // 미로 형태 생성 첫줄
        maze[0][0] = "0"; maze[0][1] = "0"; maze[0][2] = "0"; maze[0][3] = "0"; maze[0][4] = "0";
        // 미로 형태 생성 둘째줄
        maze[1][0] = "0"; maze[1][1] = "1"; maze[1][2] = "0"; maze[1][3] = "1"; maze[1][4] = "0";
        // 미로 형태 생성 셋째줄
        maze[2][0] = "0"; maze[2][1] = "0"; maze[2][2] = "1"; maze[2][3] = "1"; maze[2][4] = "1";      
        // 미로 형태 생성 넷째줄
        maze[3][0] = "1"; maze[3][1] = "0"; maze[3][2] = "0"; maze[3][3] = "0"; maze[3][4] = "0";      
        // 미로 형태 생성 넷째줄
        maze[4][0] = "0"; maze[4][1] = "0"; maze[4][2] = "1"; maze[4][3] = "1"; maze[4][4] = "0";

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                System.out.print( maze[i][j] );
            }
         System.out.println();
        }

        Recursion(0, 0);
    }

    public static void Recursion(int num1, int num2){
        
    }
}