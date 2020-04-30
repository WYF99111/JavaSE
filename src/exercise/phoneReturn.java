package exercise;

public class phoneReturn {
    public static void main(String[] args){
        phone two=getPhone();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);
    }
    public static phone getPhone(){
        phone one =new phone();
        one.brand="苹果";
        one.price=8388.0;
        one.color="玫瑰金";
        return one;
//        当使用一个对象类型作为方法的返回值时：返回值其实就是对象的地址值
    }

}
