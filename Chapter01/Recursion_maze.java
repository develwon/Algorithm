// Created on iPad (2).

class Main {
    static String[][] maze = new String[5][5];
    static int cnt=0;

    public static void main(String[] args) {
      /*
       * Question 1` 
       * # 다음과 같은 미로가 있다.
       * 
       * 시작    0   0   0   0   0
       *        0   1   0   1   0
       *        0   0   1   1   1
       *        1   0   0   0   0
       *        0   0   1   1   0
       * 
       *  0으로 되어 있는 길은 뚫려 있는 길이고 1로 되어있는 길은 막혀 있는 길이라고 했을 때
       *  "시작"부터 "도착" 까지 이동할 때 지나야 하는 최소의 칸수를 구하세요.
       *  (단, 다른 칸으로 이동할 때는 서로 인접한 칸으로만 이동할 수 있으며 함수 recursion 사용)
       * 
       *  미로의 형태를 어떻게 규정지을 것인지?
       * 
       * */
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
      
      Recursion(0, 0);
    }

    public static void Recursion(int num1, int num2) {
      
      /*
      for(int i=0; i<5; i++) {
         for(int j=0; j<5; j++) {
            System.out.print( maze[i][j] );
         }
         System.out.println();
      }*/
      if((num1 == 4 && num2 == 4) && (maze[4][4] == "0")){
         System.out.println("Total move cnt = " + cnt);
         return;
      }else if( (num1 < 4 && num2 < 4 ) ){
         if(maze[num1][num2] == "0"){
            if(maze[num1][num2+1] == "0"){
               num2 = num2 + 1;
               cnt++;
               Recursion(num1, num2);
            }else if(maze[num1][num2+1] == "1"){
               num1 = 0;
               num2 = 0;
               cnt = 0;
               Recursion(num1, num2);
            }else if(maze[num1+1][num2] == "0"){
               num1 = num1 + 1;
               cnt++;
               Recursion(num1, num2);
            }else if(maze[num1+1][num2] == "1"){
               num1 = 0;
               num2 = 0;
               cnt = 0;
               Recursion(num1, num2);
            }
         }else{
            return;
         }
      }else if( (num1 == 4 && num2 < 4 ) ){
         if(maze[num1][num2+1] == "0"){
            num2 = num2+1;
            cnt++;
            Recursion(num1, num2);
         }else if(maze[num1][num2+1] == "1"){
            num1 = 0;
            num2 = 0;
            cnt = 0;
            Recursion(num1, num2);
         }
      }else if( (num1 < 4 && num2 == 4 ) ){
         if(maze[num1+1][num2] == "0"){
            num1 = num1+1;
            cnt++;
            Recursion(num1, num2);
         }else if(maze[num1+1][num2] == "1"){
            num1 = 0;
            num2 = 0;
            cnt = 0;
            Recursion(num1, num2);
         }
      }else{
         
      }
   }
}