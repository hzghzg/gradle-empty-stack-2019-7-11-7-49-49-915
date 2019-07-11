public class Andriod extends Mobile{
    private String message;
    public Andriod(String name,String color,String brand,String message){
        super(name,color,brand);
        this.message=message;
    }
    @Override
    public void call(String message) {
        if(message.length()<30)
            System.out.println("<Andriod>message:["+message+"]");
        else
            System.out.println("<Andriod> Too long! Message cannot be sent");
    }

}
