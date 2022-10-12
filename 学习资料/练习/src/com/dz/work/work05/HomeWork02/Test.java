package com.dz.work.work05.HomeWork02;

public class Test {
    /*输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
      要求：
      (1)用户名长度为2或3或4
      (2)密码的长度为6，要求全是数字
      (3)邮箱中包含@和.并且@在的前面
     */
    public static void main(String[] args) {
        String name = "qq22";
        String password = "111111";
        String email = "2483482026@qq.com";
        try {
            userLogin(name, password, email);
            System.out.println("登陆成功！！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userLogin(String name, String pws, String email) {
        if (!(name != null && pws != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }
        if (!(pws.length() == 6 && isItANumber(pws))) {
            throw new RuntimeException("密码必须为6位,要求全是数字");
        }
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和.并且@在的前面");
        }
    }

    public static boolean isItANumber(String pws) {
        char[] chars = pws.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
