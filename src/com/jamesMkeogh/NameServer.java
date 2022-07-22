package com.jamesMkeogh;

public class NameServer {

    private static final int PORT = 9090;
    private static String[] names = {"Joe", "Mick", "Bob", "Paddy", "Mack", "Pippy"};
    private static String[] desc = {"fat", "ugly", "fit", "smart", "happy", "stupid"};

    public static void main(String[] args) {



    }

    public static String getRandomName(){
        int posName = (int) (Math.random()* names.length);
        String name = names[posName];
        int posDesc = (int) (Math.random()* desc.length);
        String des=desc[posDesc];

        return name+" "+des;
    }

}
