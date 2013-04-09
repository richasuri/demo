package sampledemo3

class AddUser {
	String useName;
	String password;
	String gender;
	int age;
	static belongsTo=[organization:Organization];
    static constraints = {
	
		password(nullable:true)
		gender(nullable:true)
		age(nullable:true)
    }
}
