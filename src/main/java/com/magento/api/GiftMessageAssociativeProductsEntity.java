/**
 * Mule Magento Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * GiftMessageAssociativeProductsEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.magento.api;

public class GiftMessageAssociativeProductsEntity  implements java.io.Serializable {
    private com.magento.api.ShoppingCartProductEntity product;

    private com.magento.api.GiftMessageEntity message;

    public GiftMessageAssociativeProductsEntity() {
    }

    public GiftMessageAssociativeProductsEntity(
           com.magento.api.ShoppingCartProductEntity product,
           com.magento.api.GiftMessageEntity message) {
           this.product = product;
           this.message = message;
    }


    /**
     * Gets the product value for this GiftMessageAssociativeProductsEntity.
     * 
     * @return product
     */
    public com.magento.api.ShoppingCartProductEntity getProduct() {
        return product;
    }


    /**
     * Sets the product value for this GiftMessageAssociativeProductsEntity.
     * 
     * @param product
     */
    public void setProduct(com.magento.api.ShoppingCartProductEntity product) {
        this.product = product;
    }


    /**
     * Gets the message value for this GiftMessageAssociativeProductsEntity.
     * 
     * @return message
     */
    public com.magento.api.GiftMessageEntity getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GiftMessageAssociativeProductsEntity.
     * 
     * @param message
     */
    public void setMessage(com.magento.api.GiftMessageEntity message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftMessageAssociativeProductsEntity)) return false;
        GiftMessageAssociativeProductsEntity other = (GiftMessageAssociativeProductsEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GiftMessageAssociativeProductsEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Magento", "giftMessageAssociativeProductsEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "shoppingCartProductEntity"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:Magento", "giftMessageEntity"));
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
