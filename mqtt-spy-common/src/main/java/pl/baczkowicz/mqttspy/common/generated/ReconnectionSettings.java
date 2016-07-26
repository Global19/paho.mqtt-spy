//
// Copyright (c) 2015 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ReconnectionSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconnectionSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetryInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Resubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
*/
@SuppressWarnings("all")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconnectionSettings", propOrder = {
    "retryInterval",
    "resubscribe"
})
public class ReconnectionSettings implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RetryInterval")
    protected int retryInterval;
    @XmlElement(name = "Resubscribe")
    protected boolean resubscribe;

    /**
     * Default no-arg constructor
     * 
     */
    public ReconnectionSettings() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReconnectionSettings(final int retryInterval, final boolean resubscribe) {
        this.retryInterval = retryInterval;
        this.resubscribe = resubscribe;
    }

    /**
     * Gets the value of the retryInterval property.
     * 
     */
    public int getRetryInterval() {
        return retryInterval;
    }

    /**
     * Sets the value of the retryInterval property.
     * 
     */
    public void setRetryInterval(int value) {
        this.retryInterval = value;
    }

    /**
     * Gets the value of the resubscribe property.
     * 
     */
    public boolean isResubscribe() {
        return resubscribe;
    }

    /**
     * Sets the value of the resubscribe property.
     * 
     */
    public void setResubscribe(boolean value) {
        this.resubscribe = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            int theRetryInterval;
            theRetryInterval = this.getRetryInterval();
            strategy.appendField(locator, this, "retryInterval", buffer, theRetryInterval);
        }
        {
            boolean theResubscribe;
            theResubscribe = this.isResubscribe();
            strategy.appendField(locator, this, "resubscribe", buffer, theResubscribe);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReconnectionSettings)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReconnectionSettings that = ((ReconnectionSettings) object);
        {
            int lhsRetryInterval;
            lhsRetryInterval = this.getRetryInterval();
            int rhsRetryInterval;
            rhsRetryInterval = that.getRetryInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retryInterval", lhsRetryInterval), LocatorUtils.property(thatLocator, "retryInterval", rhsRetryInterval), lhsRetryInterval, rhsRetryInterval)) {
                return false;
            }
        }
        {
            boolean lhsResubscribe;
            lhsResubscribe = this.isResubscribe();
            boolean rhsResubscribe;
            rhsResubscribe = that.isResubscribe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resubscribe", lhsResubscribe), LocatorUtils.property(thatLocator, "resubscribe", rhsResubscribe), lhsResubscribe, rhsResubscribe)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            int theRetryInterval;
            theRetryInterval = this.getRetryInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retryInterval", theRetryInterval), currentHashCode, theRetryInterval);
        }
        {
            boolean theResubscribe;
            theResubscribe = this.isResubscribe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resubscribe", theResubscribe), currentHashCode, theResubscribe);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ReconnectionSettings) {
            final ReconnectionSettings copy = ((ReconnectionSettings) draftCopy);
            {
                int sourceRetryInterval;
                sourceRetryInterval = this.getRetryInterval();
                int copyRetryInterval = strategy.copy(LocatorUtils.property(locator, "retryInterval", sourceRetryInterval), sourceRetryInterval);
                copy.setRetryInterval(copyRetryInterval);
            }
            {
                boolean sourceResubscribe;
                sourceResubscribe = this.isResubscribe();
                boolean copyResubscribe = strategy.copy(LocatorUtils.property(locator, "resubscribe", sourceResubscribe), sourceResubscribe);
                copy.setResubscribe(copyResubscribe);
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ReconnectionSettings();
    }

}
