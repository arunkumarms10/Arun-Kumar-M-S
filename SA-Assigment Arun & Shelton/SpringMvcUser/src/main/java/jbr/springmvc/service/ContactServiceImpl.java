package jbr.springmvc.service;




import org.springframework.stereotype.Service;

import jbr.springmvc.model.Counter;




@Service
public class ContactServiceImpl  implements ContactService{

                

                public String findCounter(String counter) {
                                // TODO Auto-generated method stub
                                String message= "";
                                if(counter.equalsIgnoreCase("countera")){
                                                message="countera.jsp";
                                                
                                                 String to="nandhinimay29@gmail.com";
                                                sendEmail(to);
                                }
                                else {
                                                message="counterb.jsp";
                                }
                                
                                
                                return message;
                }
                
                private void sendEmail(String to) {
        try {
            // all values as variables to clarify its usage
            
            String from = "arunkumarms10@hotmail.com";
            String subject = "Server is down - Counter A";
            String text = "Counter A is down!";
            String fileName = "file.pdf";
            String mimeType = "application/pdf";

            // call the email service to send the message
            EmailSender.send(from, to, subject, text,null,  fileName, mimeType);

            

            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

                public void findCounter(Counter counter) {
                                // TODO Auto-generated method stub
                                
                }
    
 
    
   
    
}