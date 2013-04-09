package sampledemo3

class LoginController {

    def index=
	{
		redirect (action:loginUser )
	}
	
	def loginUser=
	{
		
	}
 def log=
 {
	 def user=params.userName;
	 def pass=params.password;
	 println "userName = "+ user
	 def myUser=AddUserCoController.findByUseName(user);
 if((user=myUser?.useName) &&(pass=myUser?.password))
 {
	 render(view:"success")
 }
		   
  else      
 {
	 render(view:"fail")
}
 }
}