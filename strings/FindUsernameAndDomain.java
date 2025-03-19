package strings;

public class FindUsernameAndDomain {
	
public static void main(String[] args) {
        
        String email = "programmer@gmail.com";
        
        String uname = email.split("@")[0];
        String domain = email.split("@")[1];
        
        System.out.println("Name is :- "+uname);
        System.out.println("Domain is :- "+domain);
        
        int i = domain.indexOf(".");
        String domainCompany = domain.substring(0,i);
        String domainExtension = domain.substring(i+1);
        
        System.out.println("Compain name is :- "+domainCompany);
        System.out.println("Compain Extension is :- "+domainExtension);
        
        if(domainCompany.equals("gmail"))
        {
            System.out.println("Great user is smart");
        }
        else
        {
            System.out.println("user is dumb");
        }

}

}
