1.
class AppCache
{
    private static AppCache INSTANCE = null;
    private Map<EnchancementId,ConfigurationData> data;
    //Private constructor for the AppCache INSTANCE
    private AppCache() { data = new Map<EnchancementId,ConfigurationData>;}
    //Returns the instance of the INSTANCE and, if the INSTANCE is null, creates one and then returns it.
    public static synchronized AppCache getInstance()
    {
        if(INSTANCE == null) 
        { 
            INSTANCE = new AppCache();
        }
        else
        {
            return INSTANCE;
        }       
    }
    //Set and Get methods for data
    public void putData(EnhancementId enhancementId, ConfigurationData configurationData) {data.put(enhancementId, configurationData);}
    public ConfigurationData getData(EnhancementId enchancementId) {return data.get(enchancementId);}
}

2.
AppCache.getInstance().putData(enhancementId, configurationData);
ConfigurationData output = AppCache.getInstance().getData(enhancementId);

