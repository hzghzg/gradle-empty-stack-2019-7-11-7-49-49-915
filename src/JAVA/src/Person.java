public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name,Mobile mobile) {
        this.name = name;
        this.mobile=mobile;
    }
    public void usePhone(String message){
        System.out.println(this.name+" use "+this.mobile.getName());
        this.mobile.call(message);
    }
    public void changePhone(Mobile mobile){
        this.mobile=mobile;
        System.out.print("my phone change, ");
        mobile.getinformation();
    }
}
