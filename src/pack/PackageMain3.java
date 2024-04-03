package pack;

import pack.a.User;

public class PackageMain3 {

    // 중복 클래스의 경우 선착순
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
