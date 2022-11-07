public class Television {
    private int currentChanel;
    private int maxChanel;

    private String[] titleTvs;

    public Television(int currentChanel,int maxChanel){
        this.currentChanel=currentChanel;
        this.maxChanel=maxChanel;
    }

    public Television (int currentChanel,int maxChanel,String[]titleTvs){
        this.currentChanel=currentChanel;
        this.maxChanel=maxChanel;
        this.titleTvs=titleTvs;

        }

        public void setChanel( ){
        for(String string:titleTvs){
            System.out.println(string);
        }
    }

    public void getTitleTvs(String[] array){
        for (String str : array) {
            System.out.println(str);
        }
    }
    public void chanelUp(){
        if(currentChanel==maxChanel){
            currentChanel=0;
        } else{
            currentChanel++;
        }
        System.out.println(currentChanel);
    }
    public void chanelDown(){
        if (currentChanel == 0){
            currentChanel=maxChanel;}
        else{
            currentChanel--;
        }
        System.out.println(currentChanel);
    }
    public void ChangeByNumber(int chanelnumber){
       if (chanelnumber<0){
           System.out.println(" It's wrong");
       }
       else if (chanelnumber>maxChanel){
           System.out.println("The number of channel should little by"+maxChanel);
       }
       else {
           currentChanel=chanelnumber;
           System.out.println(currentChanel);
       }

        }
        public String getChannelName() {
        for (int i = 0; i < titleTvs.length; i++) {
            if (i == currentChanel) {
                return titleTvs[i];
            }
        }
        return "error";


    }}



