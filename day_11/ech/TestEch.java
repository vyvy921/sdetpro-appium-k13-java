package day_11.ech;

public class TestEch {

    public static void main(String[] args) {

        //What is polymorphism?
        //1 object co the chuyen thanh cac dang khac nhau trong 1 model
        // An object can trans into different form in the model
        Ech ech = new TrungEch();
// tao ra instance TrungEch cu the, nen khong the dung tinh da hinh
//        TrungEch ech = new TrungEch();
        ech = new NongNoc();
        ech = new EchCon();

    }
}
