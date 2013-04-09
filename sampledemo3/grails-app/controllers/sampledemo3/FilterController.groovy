package sampledemo3

class FilterController {

    def index() { }
	
	def filter1 = {
		
	}
	
	def filterUser = {
		println params
		
		def c = AddUser.createCriteria()
		def results = c.list {
			
				between("age",Integer.parseInt(params.age1.trim()),Integer.parseInt(params.age2.trim()))
				eq("gender", params.gender)
			
		}
		[user:results]
	}
}
