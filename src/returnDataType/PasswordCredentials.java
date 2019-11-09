package returnDataType;

public class PasswordCredentials {
    public static void main(String[] args) {
        if(loginMethod("james123","password")){
            System.out.println("Logged in");
        }else {
            System.out.println("Invalid credentials");
        }

    }

    public static boolean loginMethod(String username, String password) {
        String validUsername = "james123";
        String validPassword = "password";

        if (validUsername.equals(username) && validPassword.equals(password)) {
            return true;
        }
        return false;
    }

}