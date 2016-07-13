package lzy.com.des;

public class Go {
    public static void main(String[] args) {
        try {
            String test = "liasd";
            DesUtils des = new DesUtils();//可自定义密钥
            System.out.println("加密前的字符：" + test);
            System.out.println("加密后的字符：" + des.encrypt(test));
            System.out.println("解密后的字符：" + des.decrypt(des.encrypt(test)));
            System.out.println("解密后的字符：" + des.decrypt("0b17dbc3f957d859"));//0b17dbc3f957d859为asd加密后的结果
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
