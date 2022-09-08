import entities.Vitrine;

public class celularVenda {

    public static void main(String[] args) {

        Vitrine iphone = new Vitrine("Iphone","XR",123, 4000.00,Boolean.TRUE, Boolean.FALSE);
        System.out.println(iphone.getMarca());

        Vitrine iphone2 = new Vitrine("Iphone","X",12, 2500.00,Boolean.TRUE, Boolean.FALSE);
        System.out.println(iphone2.getMarca());

        Vitrine samsungNote = new Vitrine("SamsungNote","A20",987, 3100.00,Boolean.TRUE, Boolean.FALSE);
        System.out.println(samsungNote.getMarca());




    }
}
