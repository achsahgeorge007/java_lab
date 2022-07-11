/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mca.myapp.CO4;

public class CustomException {

    // A custom exception class
    public static class InvalidUserException extends Exception {

        public InvalidUserException() {
            super("Invalid username / password provided!");
        }

    }

    public static void main(String[] args) {

        // A invalid username
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