public class Main {

    public static void main(String[] args) {
        String inputMessage1="hello good morning,my owner";
        String inputMessage2="hdfjdslkfhehfewoihfoiwehoiehfweiohfioewfhwf";
        Iphone phone1=new Iphone("phone1","red","plus10",inputMessage1);
        Andriod phone2=new Andriod("phone2","blue","HuaWei",inputMessage2);
        phone1.getinformation();
        phone2.getinformation();
        Person hzg=new Person("hzg",phone1);
        Person zwh=new Person("zwh",phone2);
        hzg.usePhone(inputMessage1);
        zwh.usePhone(inputMessage2);
        IPhoneRobot iphonerobot=new IPhoneRobot();
        iphonerobot.useIphone(phone1,inputMessage1);
        String inputMessage3="hello good morning,I'm xiaomi";
        Andriod newphone=new Andriod("phone3","black","xiaomi",inputMessage3);
        hzg.changePhone(newphone);
        hzg.usePhone(inputMessage3);
    }
}
