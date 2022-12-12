public class SnakeAndLadder7 {
        static final int SNAKE_option=0;
        static final int NoPLAY_option=1;
        static final int LADDER_option=2;
        public static void main(String[] args){
            int[] position_arr={0,0,0};
            int dice_count=0;
            System.out.println("Game starting with player1");
            int player=1;
            int prev=2;
            System.out.println("dice throw started");
            while(position_arr[1]<100 && position_arr[2]<100){
                int dice_num=(int) Math.floor(Math.random()*10)%7;
                int condition=(int) Math.floor(Math.random()*10)%3;
                System.out.print("Condition "+condition+" ");
                System.out.print("DiceNum "+dice_num+" ");
                if(condition==SNAKE_option ){
                    position_arr[player]=position_arr[player]-dice_num;
                    if (position_arr[player]<0){
                        position_arr[player]=0;
                    }
                    System.out.println("Player"+(player)+" position = "+position_arr[player]+" after "+(dice_count+1)+" dice throws");
                    if(prev==2){
                        prev=player;
                        player=2;
                    }else {
                        prev=player;
                        player=1;
                    }
                }
                else if (condition==LADDER_option && position_arr[player]+dice_num<=100) {
                    position_arr[player]=position_arr[player]+dice_num;
                    System.out.println("Player"+(player)+" position = "+position_arr[player]+" after "+(dice_count+1)+" dice throws");
                }
                else if (condition==NoPLAY_option) {
                    System.out.println("Player"+(player)+" position = "+position_arr[player]+" after "+(dice_count+1)+" dice throws");
                    if(prev==2){
                        prev=player;
                        player=2;
                    }else {
                        prev=player;
                        player=1;
                    }
                }
                dice_count++;
            }

            if(position_arr[1]==100){
                System.out.println("Player1 has won");
            }else {System.out.println("Player2 has won 1");}

            System.out.println("no of dice throws done to reach position 100 exactly "+dice_count);
        }
    }


