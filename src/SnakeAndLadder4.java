public class SnakeAndLadder4 {
    static final int SNAKE_option=0;
    static final int NoPLAY_option=1;
    static final int LADDER_option=2;
    public static void main(String[] args){
        int position=0;
        int count=0;
        System.out.println("dice throw started");
        while(position<100){
            int dice_num=(int) Math.floor(Math.random()*10)%7;
            int condition=(int) Math.floor(Math.random()*10)%3;
            if(condition==SNAKE_option ){
                position=position-dice_num;
                if (position<0){
                    position=0;
                }
            } else if (condition==LADDER_option) {
                position=position+dice_num;
            }
            count++;
        }
        System.out.println("no of dice throws done to reach position 100 is "+count);
    }
}