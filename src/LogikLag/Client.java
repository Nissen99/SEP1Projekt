package LogikLag;

import java.io.Serializable;

public class Client implements Serializable
{
  private String clientName;
  private String clientEmail;
  private String clientPhoneNumber;
  private LogikFacade logikFacade;

  public Client(String clientName, String clientEmail, String clientPhoneNumber)
  {
    this.clientName = clientName;
    this.clientEmail = clientEmail;
    this.clientPhoneNumber = clientPhoneNumber;
    logikFacade;
  }

  public String getClientName()
  {
    return clientName;
  }

  public String getClientEmail()
  {
    return clientEmail;
  }

  public String getClientPhoneNumber()
  {
    return clientPhoneNumber;
  }
}
