package lzy.com.des;

public class Go {
    public static void main(String[] args) {
        try {
            String test = "like";
            DesUtils des = new DesUtils();//可自定义密钥
            System.out.println("加密前的字符：" + test);
            System.out.println("加密后的字符：" + des.encrypt(test));
            System.out.println("解密后的字符：" + des.decrypt(des.encrypt(test)));
            //c3b54cb29f72fd4f为like加密后的结果
            System.out.println("c3b54cb29f72fd4f解密后的字符：" + des.decrypt("c3b54cb29f72fd4f"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
