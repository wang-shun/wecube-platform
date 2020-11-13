//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.09 at 03:29:54 PM CST 
//


package com.webank.wecube.platform.core.service.plugin.xml.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for interfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="interfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputParameters" type="{}inputParametersType" minOccurs="0"/>
 *         &lt;element name="outputParameters" type="{}outputParametersType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="httpMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isAsyncProcessing" type="{http://www.w3.org/2001/XMLSchema}string" default="N" />
 *       &lt;attribute name="filterRule" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="APPROVAL"/>
 *             &lt;enumeration value="EXECUTION"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interfaceType", propOrder = {
    "inputParameters",
    "outputParameters"
})
public class InterfaceType {

    protected InputParametersType inputParameters;
    protected OutputParametersType outputParameters;
    @XmlAttribute(name = "action")
    protected String action;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "httpMethod")
    protected String httpMethod;
    @XmlAttribute(name = "isAsyncProcessing")
    protected String isAsyncProcessing;
    @XmlAttribute(name = "filterRule")
    protected String filterRule;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the inputParameters property.
     * 
     * @return
     *     possible object is
     *     {@link InputParametersType }
     *     
     */
    public InputParametersType getInputParameters() {
        return inputParameters;
    }

    /**
     * Sets the value of the inputParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputParametersType }
     *     
     */
    public void setInputParameters(InputParametersType value) {
        this.inputParameters = value;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OutputParametersType }
     *     
     */
    public OutputParametersType getOutputParameters() {
        return outputParameters;
    }

    /**
     * Sets the value of the outputParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputParametersType }
     *     
     */
    public void setOutputParameters(OutputParametersType value) {
        this.outputParameters = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the httpMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * Sets the value of the httpMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpMethod(String value) {
        this.httpMethod = value;
    }

    /**
     * Gets the value of the isAsyncProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAsyncProcessing() {
        if (isAsyncProcessing == null) {
            return "N";
        } else {
            return isAsyncProcessing;
        }
    }

    /**
     * Sets the value of the isAsyncProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAsyncProcessing(String value) {
        this.isAsyncProcessing = value;
    }

    /**
     * Gets the value of the filterRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterRule() {
        if (filterRule == null) {
            return "";
        } else {
            return filterRule;
        }
    }

    /**
     * Sets the value of the filterRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterRule(String value) {
        this.filterRule = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}