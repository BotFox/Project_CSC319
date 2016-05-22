package totorobank.model;

public class ServiceFactory {
     
    public Interface_Service getService(String ServiceType){
      if(ServiceType == null){
         return null;
      }		
      if(ServiceType.equalsIgnoreCase("Deposite")){
         return new deposite();
         
      } else if(ServiceType.equalsIgnoreCase("Withdraw")){
         return new withdraw();
         
      } else if(ServiceType.equalsIgnoreCase("Transfer")){
         return new transfer();
      
      } else if(ServiceType.equalsIgnoreCase("Interest")){
         return new interest();
      }
      
      return null;
   }
}
