package exercise;

public class phoneone {
    public static void main(String[] args) {
        phone phone1 = new phone();
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        phone1.brand = "苹果";
        phone1.price = 8388;
        phone1.color = "black";
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        phone1.call("乔布斯");
        phone1.sendMessage();
    }
}

