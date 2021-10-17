package method;

public class Learn_Method {

    public static void main(String[] args) {
      Learn_Method.getInfo(31,5.9);
        System.out.println("Thank you");
        Learn_Method input = new Learn_Method();
        input.getfamilyinfo("Salim","Mony",55,45);
    }
    public static void getInfo(int age,double height){

        System.out.println("My age="+age);
        System.out.println("My height="+height);

    }

    public void getfamilyinfo(String fathersname,String mothersname,int fage,int mage){

        System.out.println("My fathers name="+fathersname);
        System.out.println("My mothers name="+mothersname);
        System.out.println("Fathers age="+fage);
        System.out.println("Mothers age="+mage);
    }











}
