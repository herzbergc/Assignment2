class EmailNotfication implements Notification
{
    public void send(string message)
    {
        System.out.println("Sending Push with message: " + message + "\n");
    }
}