public class AgeUserCheck implements IUserCheckService{
    @Override
    public boolean checkUser(User user){
        if (user.getAge() >= 18){
            return true;
        }
        return false;
    }
    // Method

}
