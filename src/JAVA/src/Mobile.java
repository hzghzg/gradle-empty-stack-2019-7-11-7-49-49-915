public class Mobile {
    private String name;
    private String color;
    private String brand;
    public Mobile(String name,String color,String brand){
        this.name=name;
        this.color=color;
        this.brand=brand;
    }
    public void call(String message){
        System.out.println("Message:["+message+"]");
    }
    public void getinformation(){
        System.out.println("name: "+name+" color: "+color+" name: "+brand);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
