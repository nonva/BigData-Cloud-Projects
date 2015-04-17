/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.refactorlabs.cs378.sessions;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Session extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Session\",\"namespace\":\"com.refactorlabs.cs378.sessions\",\"fields\":[{\"name\":\"user_id\",\"type\":\"string\"},{\"name\":\"api_key\",\"type\":\"string\"},{\"name\":\"user_agent\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"resolution\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"activex\",\"type\":{\"type\":\"enum\",\"name\":\"ActiveX\",\"symbols\":[\"ENABLED\",\"NOT_SUPPORTED\",\"DISABLED\"],\"default\":\"NOT_SUPPORTED\"},\"default\":\"NOT_SUPPORTED\"},{\"name\":\"impressions\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Impression\",\"fields\":[{\"name\":\"impression_type\",\"type\":{\"type\":\"enum\",\"name\":\"ImpressionType\",\"symbols\":[\"ACTION\",\"VDP\",\"SRP\",\"THANK_YOU\"],\"default\":\"SRP\"},\"default\":\"SRP\"},{\"name\":\"action\",\"type\":{\"type\":\"enum\",\"name\":\"Action\",\"symbols\":[\"CLICK\",\"PAGE_VIEW\"],\"default\":\"PAGE_VIEW\"},\"default\":\"PAGE_VIEW\"},{\"name\":\"action_name\",\"type\":{\"type\":\"enum\",\"name\":\"ActionName\",\"symbols\":[\"VIEWED_CARFAX_REPORT\",\"VIEWED_CARFAX_REPORT_UNHOSTED\",\"VEHICLE_AT_DEALER_PAGE_VIEWED\",\"MAP_DEALER_LOCATION\",\"PRINT_VEHICLE_DETAIL\",\"MORE_PHOTOS_VIEWED\",\"DEALER_PAGE_VIEWED\",\"DEALER_WEBSITE_VIEWED\",\"UNKNOWN\",\"NONE\"],\"default\":\"NONE\"},\"default\":\"NONE\"},{\"name\":\"id\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"long\"}],\"default\":null},{\"name\":\"timestamp\",\"type\":\"long\",\"default\":0},{\"name\":\"ab\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"vertical\",\"type\":{\"type\":\"enum\",\"name\":\"Vertical\",\"symbols\":[\"CARS\",\"OTHER\"],\"default\":\"CARS\"},\"default\":\"CARS\"},{\"name\":\"start_index\",\"type\":\"int\",\"default\":0},{\"name\":\"total\",\"type\":\"int\",\"default\":0},{\"name\":\"domain\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"lat\",\"type\":\"double\",\"default\":0.0},{\"name\":\"lon\",\"type\":\"double\",\"default\":0.0},{\"name\":\"address\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"dma\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"city\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"zip\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"state\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"phone_type\",\"type\":{\"type\":\"enum\",\"name\":\"PhoneType\",\"symbols\":[\"TRACKED\",\"NONE\"],\"default\":\"NONE\"},\"default\":\"NONE\"}]}}},{\"name\":\"leads\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Lead\",\"fields\":[{\"name\":\"lead_id\",\"type\":\"long\",\"default\":0},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"LeadType\",\"symbols\":[\"GOOD\",\"DUPLICATE\",\"RANGE\",\"ERROR\",\"BAD\"],\"default\":\"BAD\"},\"default\":\"BAD\"},{\"name\":\"bid_type\",\"type\":{\"type\":\"enum\",\"name\":\"BidType\",\"symbols\":[\"LEAD\",\"SALE\",\"OTHER\"],\"default\":\"LEAD\"},\"default\":\"LEAD\"},{\"name\":\"advertiser\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"campaign_id\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"id\",\"type\":\"long\",\"default\":0},{\"name\":\"amount\",\"type\":\"float\",\"default\":0.0},{\"name\":\"revenue\",\"type\":\"float\",\"default\":0.0},{\"name\":\"customer_zip\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"customer_dma\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"vehicle_zip\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"vehicle_dma\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"test\",\"type\":\"boolean\",\"default\":\"false\"},{\"name\":\"ab\",\"type\":[\"string\",\"null\"],\"default\":\"null\"},{\"name\":\"vdp_index\",\"type\":\"int\",\"default\":-1}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence user_id;
  @Deprecated public java.lang.CharSequence api_key;
  @Deprecated public java.lang.CharSequence user_agent;
  @Deprecated public java.lang.CharSequence resolution;
  @Deprecated public com.refactorlabs.cs378.sessions.ActiveX activex;
  @Deprecated public java.util.List<com.refactorlabs.cs378.sessions.Impression> impressions;
  @Deprecated public java.util.List<com.refactorlabs.cs378.sessions.Lead> leads;

  /**
   * Default constructor.
   */
  public Session() {}

  /**
   * All-args constructor.
   */
  public Session(java.lang.CharSequence user_id, java.lang.CharSequence api_key, java.lang.CharSequence user_agent, java.lang.CharSequence resolution, com.refactorlabs.cs378.sessions.ActiveX activex, java.util.List<com.refactorlabs.cs378.sessions.Impression> impressions, java.util.List<com.refactorlabs.cs378.sessions.Lead> leads) {
    this.user_id = user_id;
    this.api_key = api_key;
    this.user_agent = user_agent;
    this.resolution = resolution;
    this.activex = activex;
    this.impressions = impressions;
    this.leads = leads;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return user_id;
    case 1: return api_key;
    case 2: return user_agent;
    case 3: return resolution;
    case 4: return activex;
    case 5: return impressions;
    case 6: return leads;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: user_id = (java.lang.CharSequence)value$; break;
    case 1: api_key = (java.lang.CharSequence)value$; break;
    case 2: user_agent = (java.lang.CharSequence)value$; break;
    case 3: resolution = (java.lang.CharSequence)value$; break;
    case 4: activex = (com.refactorlabs.cs378.sessions.ActiveX)value$; break;
    case 5: impressions = (java.util.List<com.refactorlabs.cs378.sessions.Impression>)value$; break;
    case 6: leads = (java.util.List<com.refactorlabs.cs378.sessions.Lead>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'user_id' field.
   */
  public java.lang.CharSequence getUserId() {
    return user_id;
  }

  /**
   * Sets the value of the 'user_id' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.CharSequence value) {
    this.user_id = value;
  }

  /**
   * Gets the value of the 'api_key' field.
   */
  public java.lang.CharSequence getApiKey() {
    return api_key;
  }

  /**
   * Sets the value of the 'api_key' field.
   * @param value the value to set.
   */
  public void setApiKey(java.lang.CharSequence value) {
    this.api_key = value;
  }

  /**
   * Gets the value of the 'user_agent' field.
   */
  public java.lang.CharSequence getUserAgent() {
    return user_agent;
  }

  /**
   * Sets the value of the 'user_agent' field.
   * @param value the value to set.
   */
  public void setUserAgent(java.lang.CharSequence value) {
    this.user_agent = value;
  }

  /**
   * Gets the value of the 'resolution' field.
   */
  public java.lang.CharSequence getResolution() {
    return resolution;
  }

  /**
   * Sets the value of the 'resolution' field.
   * @param value the value to set.
   */
  public void setResolution(java.lang.CharSequence value) {
    this.resolution = value;
  }

  /**
   * Gets the value of the 'activex' field.
   */
  public com.refactorlabs.cs378.sessions.ActiveX getActivex() {
    return activex;
  }

  /**
   * Sets the value of the 'activex' field.
   * @param value the value to set.
   */
  public void setActivex(com.refactorlabs.cs378.sessions.ActiveX value) {
    this.activex = value;
  }

  /**
   * Gets the value of the 'impressions' field.
   */
  public java.util.List<com.refactorlabs.cs378.sessions.Impression> getImpressions() {
    return impressions;
  }

  /**
   * Sets the value of the 'impressions' field.
   * @param value the value to set.
   */
  public void setImpressions(java.util.List<com.refactorlabs.cs378.sessions.Impression> value) {
    this.impressions = value;
  }

  /**
   * Gets the value of the 'leads' field.
   */
  public java.util.List<com.refactorlabs.cs378.sessions.Lead> getLeads() {
    return leads;
  }

  /**
   * Sets the value of the 'leads' field.
   * @param value the value to set.
   */
  public void setLeads(java.util.List<com.refactorlabs.cs378.sessions.Lead> value) {
    this.leads = value;
  }

  /** Creates a new Session RecordBuilder */
  public static com.refactorlabs.cs378.sessions.Session.Builder newBuilder() {
    return new com.refactorlabs.cs378.sessions.Session.Builder();
  }
  
  /** Creates a new Session RecordBuilder by copying an existing Builder */
  public static com.refactorlabs.cs378.sessions.Session.Builder newBuilder(com.refactorlabs.cs378.sessions.Session.Builder other) {
    return new com.refactorlabs.cs378.sessions.Session.Builder(other);
  }
  
  /** Creates a new Session RecordBuilder by copying an existing Session instance */
  public static com.refactorlabs.cs378.sessions.Session.Builder newBuilder(com.refactorlabs.cs378.sessions.Session other) {
    return new com.refactorlabs.cs378.sessions.Session.Builder(other);
  }
  
  /**
   * RecordBuilder for Session instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Session>
    implements org.apache.avro.data.RecordBuilder<Session> {

    private java.lang.CharSequence user_id;
    private java.lang.CharSequence api_key;
    private java.lang.CharSequence user_agent;
    private java.lang.CharSequence resolution;
    private com.refactorlabs.cs378.sessions.ActiveX activex;
    private java.util.List<com.refactorlabs.cs378.sessions.Impression> impressions;
    private java.util.List<com.refactorlabs.cs378.sessions.Lead> leads;

    /** Creates a new Builder */
    private Builder() {
      super(com.refactorlabs.cs378.sessions.Session.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.refactorlabs.cs378.sessions.Session.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Session instance */
    private Builder(com.refactorlabs.cs378.sessions.Session other) {
            super(com.refactorlabs.cs378.sessions.Session.SCHEMA$);
      if (isValidValue(fields()[0], other.user_id)) {
        this.user_id = data().deepCopy(fields()[0].schema(), other.user_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.api_key)) {
        this.api_key = data().deepCopy(fields()[1].schema(), other.api_key);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.user_agent)) {
        this.user_agent = data().deepCopy(fields()[2].schema(), other.user_agent);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.resolution)) {
        this.resolution = data().deepCopy(fields()[3].schema(), other.resolution);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.activex)) {
        this.activex = data().deepCopy(fields()[4].schema(), other.activex);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.impressions)) {
        this.impressions = data().deepCopy(fields()[5].schema(), other.impressions);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.leads)) {
        this.leads = data().deepCopy(fields()[6].schema(), other.leads);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'user_id' field */
    public java.lang.CharSequence getUserId() {
      return user_id;
    }
    
    /** Sets the value of the 'user_id' field */
    public com.refactorlabs.cs378.sessions.Session.Builder setUserId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.user_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'user_id' field has been set */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'user_id' field */
    public com.refactorlabs.cs378.sessions.Session.Builder clearUserId() {
      user_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'api_key' field */
    public java.lang.CharSequence getApiKey() {
      return api_key;
    }
    
    /** Sets the value of the 'api_key' field */
    public com.refactorlabs.cs378.sessions.Session.Builder setApiKey(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.api_key = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'api_key' field has been set */
    public boolean hasApiKey() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'api_key' field */
    public com.refactorlabs.cs378.sessions.Session.Builder clearApiKey() {
      api_key = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'user_agent' field */
    public java.lang.CharSequence getUserAgent() {
      return user_agent;
    }
    
    /** Sets the value of the 'user_agent' field */
    public com.refactorlabs.cs378.sessions.Session.Builder setUserAgent(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.user_agent = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'user_agent' field has been set */
    public boolean hasUserAgent() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'user_agent' field */
    public com.refactorlabs.cs378.sessions.Session.Builder clearUserAgent() {
      user_agent = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'resolution' field */
    public java.lang.CharSequence getResolution() {
      return resolution;
    }
    
    /** Sets the value of the 'resolution' field */
    public com.refactorlabs.cs378.sessions.Session.Builder setResolution(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.resolution = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'resolution' field has been set */
    public boolean hasResolution() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'resolution' field */
    public com.refactorlabs.cs378.sessions.Session.Builder clearResolution() {
      resolution = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'activex' field */
    public com.refactorlabs.cs378.sessions.ActiveX getActivex() {
      return activex;
    }
    
    /** Sets the value of the 'activex' field */
    public com.refactorlabs.cs378.sessions.Session.Builder setActivex(com.refactorlabs.cs378.sessions.ActiveX value) {
      validate(fields()[4], value);
      this.activex = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'activex' field has been set */
    public boolean hasActivex() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'activex' field */
    public com.refactorlabs.cs378.sessions.Session.Builder clearActivex() {
      activex = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'impressions' field */
    public java.util.List<com.refactorlabs.cs378.sessions.Impression> getImpressions() {
      return impressions;
    }
    
    /** Sets the value of the 'impressions' field */
    public com.refactorlabs.cs378.sessions.Session.Builder setImpressions(java.util.List<com.refactorlabs.cs378.sessions.Impression> value) {
      validate(fields()[5], value);
      this.impressions = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'impressions' field has been set */
    public boolean hasImpressions() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'impressions' field */
    public com.refactorlabs.cs378.sessions.Session.Builder clearImpressions() {
      impressions = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'leads' field */
    public java.util.List<com.refactorlabs.cs378.sessions.Lead> getLeads() {
      return leads;
    }
    
    /** Sets the value of the 'leads' field */
    public com.refactorlabs.cs378.sessions.Session.Builder setLeads(java.util.List<com.refactorlabs.cs378.sessions.Lead> value) {
      validate(fields()[6], value);
      this.leads = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'leads' field has been set */
    public boolean hasLeads() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'leads' field */
    public com.refactorlabs.cs378.sessions.Session.Builder clearLeads() {
      leads = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Session build() {
      try {
        Session record = new Session();
        record.user_id = fieldSetFlags()[0] ? this.user_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.api_key = fieldSetFlags()[1] ? this.api_key : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.user_agent = fieldSetFlags()[2] ? this.user_agent : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.resolution = fieldSetFlags()[3] ? this.resolution : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.activex = fieldSetFlags()[4] ? this.activex : (com.refactorlabs.cs378.sessions.ActiveX) defaultValue(fields()[4]);
        record.impressions = fieldSetFlags()[5] ? this.impressions : (java.util.List<com.refactorlabs.cs378.sessions.Impression>) defaultValue(fields()[5]);
        record.leads = fieldSetFlags()[6] ? this.leads : (java.util.List<com.refactorlabs.cs378.sessions.Lead>) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
