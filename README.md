Password Validator (Java)
A simple Java-based password validation system built with clean code principles. No frameworks are used, and the project includes custom exceptions along with JUnit tests.
Features:
Validation rules:
Password must not be null
Password must be longer than 8 characters
Must contain at least one uppercase letter
Must contain at least one lowercase letter
Must contain at least one numeric digit

A password is considered OK if at least three rules pass.
The length rule is mandatory; if it fails, the password is never considered OK.
Project Structure
config/            -> Settings
src/rules/          -> PasswordRules
src/exceptions/    -> Custom exception classes
src/validator/     -> PasswordValidator
src/Main.java      -> Demo runner
tests/             -> JUnit test cases

Running Tests
mvn test

Running the Application
java src/Main.java
