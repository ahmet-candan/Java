public class Main {

    public static void main(String[] args) {
        SingUpManager singUpManager = new SingUpManager(new AgeUserCheck());

        singUpManager.singUp(new User(1,"ahmet",18));

    }

}
