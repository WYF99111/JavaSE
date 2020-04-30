package exercise;

public class phoneParam {
    public static void main(String[] args){
        phone one=new phone();
        one.brand="苹果";
        one.color="黑色";
        one.price=8388;
        method(one);
        //当一个对象作为参数，传递到方法当中时，实际上传递进去的是对象的地址值
    }
    public static void method(phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
