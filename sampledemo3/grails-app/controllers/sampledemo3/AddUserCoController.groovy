package sampledemo3

class AddUserCoController {

	def index= {
		
		redirect(action: add1)
	}
	
	def add1=
	{
		def org1 = Organization.findAll();
		[org1:org1]
	}
	
	def addu =
	{
		def user = params.userName;
		def pass = params.password;
		def gender = params.gender;
		def age = params.age;
		println "params = "+params
		if((params.userName != null) && (params.password !=null) && (params.gender !=null) &&( params.age != null ))
		{def  org =  Organization.get(params.orgid)
			
			def u = new AddUser(useName:user, password:pass, gender:gender, age:age,organization:org)
			
			if(!u.save()){
				u.errors.each{
					println it
				}
			}
		}
		
			render(view:"add1")	
			}
			
}		
		
	

