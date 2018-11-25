public class Main {

    public static void main(String[] args) {

        DHellman dHellman=new DHellman();

        dHellman.setNandG(23,5);
      dHellman.setX(6);
      dHellman.setY(15);
        dHellman.getk();
        System.out.println(dHellman.getk()+"  "+dHellman.getkprime());
    }
}
