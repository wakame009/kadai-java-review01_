
public class Review01 {

    public static void main(String[] args) {
        // 商品価格の初期値設定
        int price = 1500;
       
        // taxメソッドから税のみを出す
        int taxOnly = tax(price);

        // 税込み価格を出す
        int includeTax = price + taxOnly;
        
        // 出力
        System.out.println(price + "円の商品の税込み価格は" + includeTax + "円(消費税は" + taxOnly + "円)です。");
    }
    
    public static int tax(int price) {
        int result = (int)(price * 0.1);
        return result;
    }
}
