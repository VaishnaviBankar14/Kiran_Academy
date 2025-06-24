class Insta{

    void login(String uname, String pwd) {
       
        System.out.println("Username = " + uname);
        System.out.println("Password = " + pwd);
    }
}

class TestInsta {
    public static void main(String[] args) {
        Insta user1 = new Insta();
        user1.login("vaishu123", "mypassword"); 
    }
}
