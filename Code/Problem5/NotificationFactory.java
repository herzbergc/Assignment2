class NotificationFactory
{
    //Depending on the enum constant input, returns the appropriate type of Notification using a switch case. If the switch case reaches default, throw exception
    public static Notification CreateNotification(NotificationChannelType channelType)
    {
        switch(channelType)
        {
            case EMAIL:
                return new EmailNotfication();
            case SMS:
                return new SMSNotification();
            case PUSH: 
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid input for method CreateNotification. ChannelType must be EMAIL, SMS, or PUSH.")               
        }
    }
}