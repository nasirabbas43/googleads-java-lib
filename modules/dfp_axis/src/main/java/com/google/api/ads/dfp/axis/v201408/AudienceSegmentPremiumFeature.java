/**
 * AudienceSegmentPremiumFeature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201408;


/**
 * A premium feature applied to audience segment targeting.
 */
public class AudienceSegmentPremiumFeature  extends com.google.api.ads.dfp.axis.v201408.PremiumFeature  implements java.io.Serializable {
    /* The ID of the {@link AudienceSegment#id}.
     *                     
     *                     <p>This attribute is required and cannot be changed
     * after creation. */
    private java.lang.Long audienceSegmentId;

    public AudienceSegmentPremiumFeature() {
    }

    public AudienceSegmentPremiumFeature(
           java.lang.String premiumFeatureType,
           java.lang.Long audienceSegmentId) {
        super(
            premiumFeatureType);
        this.audienceSegmentId = audienceSegmentId;
    }


    /**
     * Gets the audienceSegmentId value for this AudienceSegmentPremiumFeature.
     * 
     * @return audienceSegmentId   * The ID of the {@link AudienceSegment#id}.
     *                     
     *                     <p>This attribute is required and cannot be changed
     * after creation.
     */
    public java.lang.Long getAudienceSegmentId() {
        return audienceSegmentId;
    }


    /**
     * Sets the audienceSegmentId value for this AudienceSegmentPremiumFeature.
     * 
     * @param audienceSegmentId   * The ID of the {@link AudienceSegment#id}.
     *                     
     *                     <p>This attribute is required and cannot be changed
     * after creation.
     */
    public void setAudienceSegmentId(java.lang.Long audienceSegmentId) {
        this.audienceSegmentId = audienceSegmentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceSegmentPremiumFeature)) return false;
        AudienceSegmentPremiumFeature other = (AudienceSegmentPremiumFeature) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audienceSegmentId==null && other.getAudienceSegmentId()==null) || 
             (this.audienceSegmentId!=null &&
              this.audienceSegmentId.equals(other.getAudienceSegmentId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAudienceSegmentId() != null) {
            _hashCode += getAudienceSegmentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AudienceSegmentPremiumFeature.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "AudienceSegmentPremiumFeature"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceSegmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "audienceSegmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
