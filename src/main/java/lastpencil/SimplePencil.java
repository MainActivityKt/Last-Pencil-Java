package lastpencil;

public class SimplePencil {

    public static void main(String[] args) {
        SimplePencil pencil = new SimplePencil();
        System.out.println(pencil.getPencil(true));
        System.out.println("Your turn! ");
    }

    public String getPencil(boolean largePencil) {
        return largePencil ? "||||||||" : "|||";
    }
}


