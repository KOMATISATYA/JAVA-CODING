class Mm{
    public <T> void display(T elem){
        System.out.println("data"+elem);

    }
}

class GenericFun {
    
    public static void main(String args[]){
        Mm m = new Mm();
    
        m.<Integer>display(26);
        m.<Double>display(87.5);
        m.<String>display("Satya");
    }

    
}
