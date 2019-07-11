public class Iphone extends Mobile{
    private String message;
    public Iphone(String name,String color,String brand,String message){
        super(name,color,brand);
        this.message=message;
    }
    @Override
    public void call(String message) {
        if(message.length()<30)
            System.out.println("<iPhone>message:["+message+"]");
        else
            System.out.println("<iPhone> Too long! Message cannot be sent");
    }

}
