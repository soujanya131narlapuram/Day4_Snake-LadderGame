public class SnakeAndLadder3 {
    public static void main(String[] args){
        int position=0;
        int dice_num=(int) Math.floor(Math.random()*10)%7;
        int condition=(int) Math.floor(Math.random()*10)%3;
        System.out.println("dice number is "+dice_num);
        System.out.println("dice condition is "+condition);
    }
}