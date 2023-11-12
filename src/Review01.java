
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int tax = (int)(price * 0.1);
        int pay = price + tax;
        System.out.println(price + "円の商品の税込み価格は" + pay + "円(消費税は" + tax + "円)です。");
    }
    public static int sumMethod2(int price, int tax) {
        int result =  price+  tax;
        return result;
    }
}
