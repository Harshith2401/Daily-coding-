/*7 Write a program that will allow two users to play tic-tac-toe. The program should 
ask for moves alternately from player X and player O. The program displays the 
game positions as follows:
1 2 3
4 5 6
7 8 9
The players enter their moves by entering the position number they wish to mark. 
After each move, the program displays the changed board. A sample board 
configuration is as follows:
X X O
4 5 6
O 8 9 */

import java.util.Scanner;
class Tictactoe
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String nums[][]=new String[4][4];
        int z=1;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                nums[i][j]=String.valueOf(z);
                z++;
            }
        }
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        char coin;
        int turn=1;
        while(true)
        {
            System.out.println("Enter the postion number");
            int position=sc.nextInt();
            if(turn%2==0)
            {
                coin='O';
            }
            else
            {
                coin='X';
            }
            turn++;
            switch(position)
            {
                case 1:
                    nums[1][1]=String.valueOf(coin);
                    break;
                case 2:
                    nums[1][2]=String.valueOf(coin);
                    break;
                case 3:
                    nums[1][3]=String.valueOf(coin);
                    break;
                case 4:
                    nums[2][1]=String.valueOf(coin);
                    break;
                case 5:
                    nums[2][2]=String.valueOf(coin);
                    break;
                case 6:
                    nums[2][3]=String.valueOf(coin);
                    break;
                case 7:
                    nums[3][1]=String.valueOf(coin);
                    break;
                case 8:
                    nums[3][2]=String.valueOf(coin);
                    break;
                case 9:
                    nums[3][3]=String.valueOf(coin);
                    break;
                 default:
                    System.out.println("Invalid position! Try again.");
                    continue;
            }
            System.out.println("Board after the move");
            for(int i=1;i<=3;i++)
            {
                for(int j=1;j<=3;j++)
                {
                    System.out.print(nums[i][j]+" ");
                }
                System.out.println();
            }

        }
        
    }
}

