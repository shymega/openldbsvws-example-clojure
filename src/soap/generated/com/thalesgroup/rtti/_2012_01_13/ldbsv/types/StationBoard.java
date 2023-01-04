
package com.thalesgroup.rtti._2012_01_13.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.thalesgroup.rtti._2007_10_10.ldb.commontypes.FilterType;


/**
 * A structure containing details of a departure board for a specific location.
 * 
 * <p>Java class for StationBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationBoard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="locationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *         &lt;element name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType"/>
 *         &lt;element name="filterLocationName" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType" minOccurs="0"/>
 *         &lt;element name="filtercrs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" minOccurs="0"/>
 *         &lt;element name="filterType" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}FilterType" minOccurs="0"/>
 *         &lt;element name="stationManager" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCName"/>
 *         &lt;element name="stationManagerCode" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TOCCode"/>
 *         &lt;element name="nrccMessages" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfNRCCMessages" minOccurs="0"/>
 *         &lt;element name="platformsAreUnreliable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="qos" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="1.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isTruncated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="servicesAreUnavailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trainServices" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfServiceItems" minOccurs="0"/>
 *         &lt;element name="busServices" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfServiceItems" minOccurs="0"/>
 *         &lt;element name="ferryServices" type="{http://thalesgroup.com/RTTI/2012-01-13/ldbsv/types}ArrayOfServiceItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationBoard", propOrder = {
    "generatedAt",
    "locationName",
    "crs",
    "filterLocationName",
    "filtercrs",
    "filterType",
    "stationManager",
    "stationManagerCode",
    "nrccMessages",
    "platformsAreUnreliable",
    "qos",
    "isTruncated",
    "servicesAreUnavailable",
    "trainServices",
    "busServices",
    "ferryServices"
})
public class StationBoard {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedAt;
    @XmlElement(required = true)
    protected String locationName;
    @XmlElement(required = true)
    protected String crs;
    protected String filterLocationName;
    protected String filtercrs;
    @XmlElement(defaultValue = "to")
    protected FilterType filterType;
    @XmlElement(required = true)
    protected String stationManager;
    @XmlElement(required = true)
    protected String stationManagerCode;
    protected ArrayOfNRCCMessages nrccMessages;
    @XmlElement(defaultValue = "false")
    protected Boolean platformsAreUnreliable;
    protected Float qos;
    @XmlElement(defaultValue = "false")
    protected Boolean isTruncated;
    @XmlElement(defaultValue = "false")
    protected Boolean servicesAreUnavailable;
    protected ArrayOfServiceItems trainServices;
    protected ArrayOfServiceItems busServices;
    protected ArrayOfServiceItems ferryServices;

    /**
     * Gets the value of the generatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Sets the value of the generatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneratedAt(XMLGregorianCalendar value) {
        this.generatedAt = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrs(String value) {
        this.crs = value;
    }

    /**
     * Gets the value of the filterLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterLocationName() {
        return filterLocationName;
    }

    /**
     * Sets the value of the filterLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterLocationName(String value) {
        this.filterLocationName = value;
    }

    /**
     * Gets the value of the filtercrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltercrs() {
        return filtercrs;
    }

    /**
     * Sets the value of the filtercrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltercrs(String value) {
        this.filtercrs = value;
    }

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilterType(FilterType value) {
        this.filterType = value;
    }

    /**
     * Gets the value of the stationManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationManager() {
        return stationManager;
    }

    /**
     * Sets the value of the stationManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationManager(String value) {
        this.stationManager = value;
    }

    /**
     * Gets the value of the stationManagerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationManagerCode() {
        return stationManagerCode;
    }

    /**
     * Sets the value of the stationManagerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationManagerCode(String value) {
        this.stationManagerCode = value;
    }

    /**
     * Gets the value of the nrccMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNRCCMessages }
     *     
     */
    public ArrayOfNRCCMessages getNrccMessages() {
        return nrccMessages;
    }

    /**
     * Sets the value of the nrccMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNRCCMessages }
     *     
     */
    public void setNrccMessages(ArrayOfNRCCMessages value) {
        this.nrccMessages = value;
    }

    /**
     * Gets the value of the platformsAreUnreliable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformsAreUnreliable() {
        return platformsAreUnreliable;
    }

    /**
     * Sets the value of the platformsAreUnreliable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformsAreUnreliable(Boolean value) {
        this.platformsAreUnreliable = value;
    }

    /**
     * Gets the value of the qos property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQos() {
        return qos;
    }

    /**
     * Sets the value of the qos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQos(Float value) {
        this.qos = value;
    }

    /**
     * Gets the value of the isTruncated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * Sets the value of the isTruncated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTruncated(Boolean value) {
        this.isTruncated = value;
    }

    /**
     * Gets the value of the servicesAreUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicesAreUnavailable() {
        return servicesAreUnavailable;
    }

    /**
     * Sets the value of the servicesAreUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServicesAreUnavailable(Boolean value) {
        this.servicesAreUnavailable = value;
    }

    /**
     * Gets the value of the trainServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public ArrayOfServiceItems getTrainServices() {
        return trainServices;
    }

    /**
     * Sets the value of the trainServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public void setTrainServices(ArrayOfServiceItems value) {
        this.trainServices = value;
    }

    /**
     * Gets the value of the busServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public ArrayOfServiceItems getBusServices() {
        return busServices;
    }

    /**
     * Sets the value of the busServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public void setBusServices(ArrayOfServiceItems value) {
        this.busServices = value;
    }

    /**
     * Gets the value of the ferryServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public ArrayOfServiceItems getFerryServices() {
        return ferryServices;
    }

    /**
     * Sets the value of the ferryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItems }
     *     
     */
    public void setFerryServices(ArrayOfServiceItems value) {
        this.ferryServices = value;
    }

}