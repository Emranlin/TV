import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] titleTvs={"KTRK","Balastan","ORT","Ilim Bilim","ELTR","Bishkek","OshTV","Exo Manas", "TRT Avaz","TalasTv"};
        Television television = new Television( 0, 10, titleTvs);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("*   My Television    *");
        System.out.println("**********************");
        while (true){
            System.out.println("1. Set chanel");
            System.out.println("2. Increase Channel");
            System.out.println("3. Decrease Channel");
            System.out.println("4. Change by number");
            System.out.println("5. Get Channel Name");
            System.out.println();
            System.out.print("Make Selection -->");
            int sel = keyboard.nextInt();
            if(sel == 0) {
                System.out.println("TV is turned off.");
                break;
            }
            if (sel == 1) television.getTitleTvs(titleTvs);
            if (sel == 2) television.chanelUp();
            if (sel == 3) television.chanelDown();
            if (sel == 4) {
                int channelNumber=new Scanner(System.in).nextInt();
                television.ChangeByNumber(channelNumber);
            }
            if (sel == 5) {
                System.out.println(television.getChannelName());
            }}

        }
}
