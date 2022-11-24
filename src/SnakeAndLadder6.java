public class SnakeAndLadder6 {
    static final int SNAKE_option=0;
    static final int NoPLAY_option=1;
    static final int LADDER_option=2;
    public static void main(String[] args){
        int position=0;
        int dice_count=0;
        System.out.println("dice throw started");
        while(position<10){
            int dice_num=(int) Math.floor(Math.random()*10)%7;
            int condition=(int) Math.floor(Math.random()*10)%3;
            if(condition==SNAKE_option ){
                position=position-dice_num;
                if (position<0){
                    position=0;
                }
            } else if (condition==LADDER_option && position+dice_num<=100) {
                position=position+dice_num;
            }
            dice_count++;
            System.out.println("position = "+position+" after "+dice_count+" dice throws");
        }
        System.out.println("no of dice throws done to reach position 100 exactly "+dice_count);
    }
}