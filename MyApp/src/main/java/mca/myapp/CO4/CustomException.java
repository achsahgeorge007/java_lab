package mca.myapp.CO4;

public class CustomException {
    public static class InvalidUserException extends Exception {
        public InvalidUserException() {
            super("Invalid username / password provided!");
        }
    }

    public static void main(String[] args) {
        String username = "john";
        String password = "pass";
        try {
            if (username.equals("user") && password.equals("pass")) {
                System.out.println("Authenticated successfully!");
            } else {
                throw new InvalidUserException();
            }

        } catch (InvalidUserException e) {
            System.out.println(e);
        }
    }
}