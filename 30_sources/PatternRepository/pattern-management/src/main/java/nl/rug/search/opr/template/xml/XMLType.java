//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.07 at 03:17:14 PM MEZ 
//


package nl.rug.search.opr.template.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XMLType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XMLType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROBLEM"/>
 *     &lt;enumeration value="CONTEXT"/>
 *     &lt;enumeration value="SOLUTION"/>
 *     &lt;enumeration value="DESCRIPTION"/>
 *     &lt;enumeration value="FORCES"/>
 *     &lt;enumeration value="CONSEQUENCES"/>
 *     &lt;enumeration value="RELATIONSHIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XMLType")
@XmlEnum
public enum XMLType {

    PROBLEM,
    CONTEXT,
    SOLUTION,
    DESCRIPTION,
    FORCES,
    CONSEQUENCES,
    RELATIONSHIP;

    public String value() {
        return name();
    }

    public static XMLType fromValue(String v) {
        return valueOf(v);
    }

}
