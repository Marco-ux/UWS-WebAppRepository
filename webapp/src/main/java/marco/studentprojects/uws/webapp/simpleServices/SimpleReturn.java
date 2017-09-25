package marco.studentprojects.uws.webapp.simpleServices;

import javax.jws.WebService;

@WebService
public class SimpleReturn {

	public String getReturn(){
		return "Hello World";
	}
}
