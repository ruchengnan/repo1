package test_itheima;


import java.util.ArrayList;

/*1.定义User类，包含空参、满参构造、以下成员变量及其get、set方法
        姓名 name（Sting 类型）
        年龄 age（int 类型）
        性别 sex（String 类型）
  2.定义测试类Test,完成以下要求：
        ①定义方法，public static ArrayList<User> getUser(ArrayList<User> users)，
        获得年龄大于等于18岁，并且性别为 “男”的User，加入新的集合并返回。
        ②在main方法中完成以下功能：创建5个User对象并赋值，加入ArrayList<User>集合中，
        调用getUser方法，并输出返回的新集合中所有元素信息，格式如下*/
public class Test_22 {
    public static void main(String[] args) {
        ArrayList<User> arrayList=new ArrayList<>();
        User u1=new User("张三",18,"男");
        User u2=new User("李四",17,"男");
        User u3=new User("王五",15,"男");
        User u4=new User("赵六",20,"男");
        User u5=new User("小红",17,"女");
        arrayList.add(u1);
        arrayList.add(u2);
        arrayList.add(u3);
        arrayList.add(u4);
        arrayList.add(u5);
        ArrayList<User> list=getUser(arrayList);
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            System.out.println(u.getName()+"\t"+u.getAge()+"\t"+u.getSex());
        }
    }

    public static ArrayList<User> getUser(ArrayList<User> users){
        ArrayList<User> list=new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            User u=users.get(i);
            if((u.getAge()>=18)&&(u.getSex().equals("男"))){
                list.add(u);
            }
        }
        return list;
    }
}
