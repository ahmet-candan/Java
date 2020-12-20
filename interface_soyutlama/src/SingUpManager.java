public class SingUpManager {
    private IUserCheckService iUserCheckService; // dependncy

    public SingUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void singUp(User user) {

        if(iUserCheckService.checkUser(user)){
            System.out.println("Kullanıcı Kayıt Oldu: "+ user.getName());
        }

        else {
            System.out.println("Kullanıcı kayıt olamadı");
        }




    }
}
