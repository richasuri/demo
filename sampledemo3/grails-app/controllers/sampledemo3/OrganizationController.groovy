package sampledemo3

class OrganizationController {

    def index = { 
		
		redirect(action:addorganization)
	}
	
	def addorganization =
	{
		
	}

	def addme=
	{
		def organization=params.organization;
		println "organization"+ organization
		if(params.organization!=null)
		{
			new Organization(organization:organization).save();
			
		
		render (view:"addorganization")
		}
	}
}
