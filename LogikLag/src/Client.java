public class Client
{
  private String clientName;
  private String clientEmail;
  private String clientPhoneNumber;

  public Client(String clientName, String clientEmail, String clientPhoneNumber)
  {
    this.clientName = clientName;
    this.clientEmail = clientEmail;
    this.clientPhoneNumber = clientPhoneNumber;
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
