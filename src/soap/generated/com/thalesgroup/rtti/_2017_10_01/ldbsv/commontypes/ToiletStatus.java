
package com.thalesgroup.rtti._2017_10_01.ldbsv.commontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ToiletStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ToiletStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="InService"/>
 *     &lt;enumeration value="NotInService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ToiletStatus")
@XmlEnum
public enum ToiletStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("InService")
    IN_SERVICE("InService"),
    @XmlEnumValue("NotInService")
    NOT_IN_SERVICE("NotInService");
    private final String value;

    ToiletStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToiletStatus fromValue(String v) {
        for (ToiletStatus c: ToiletStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
