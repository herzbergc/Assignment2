class EmailNotfication implements Notification
{
    public void send(string message)
    {
        System.out.println("Sending Email with message: " + message + "\n");
    }
}