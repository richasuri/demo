package sampledemo3

class Login {
String userName;
String password;
static belongsTo= [addUser:AddUser]
    static constraints = {
    }
}
