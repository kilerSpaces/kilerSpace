package com.myList.test;

import com.myList.Impl.MyLinkListImpl;
import com.myList.domain.User;

public class Test {

    public static void main(String[] args) {
        MyLinkListImpl<User> list = new MyLinkListImpl<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        user1.setId(1);
        user1.setUsername("sam");
        user1.setPasseord("123456");
        user1.setSex("男");
        user2.setId(2);
        user2.setUsername("lisa");
        user2.setPasseord("123456");
        user2.setSex("女");
        user3.setId(3);
        user3.setUsername("jack");
        user3.setPasseord("123456");
        user3.setSex("男");
        user4.setId(4);
        user4.setUsername("rose");
        user4.setPasseord("123456");
        user4.setSex("女");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        System.out.println(list.select(0).hasnext());

    }
}
