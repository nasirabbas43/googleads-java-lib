
package com.google.api.ads.dfp.jaxws.v201311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link Placement} objects.
 *             
 *             @param placements the placements to create
 *             @return the new placements, with their IDs filled in
 *           
 * 
 * <p>Java class for createPlacements element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createPlacements">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="placements" type="{https://www.google.com/apis/ads/publisher/v201311}Placement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "placements"
})
@XmlRootElement(name = "createPlacements")
public class PlacementServiceInterfacecreatePlacements {

    protected List<Placement> placements;

    /**
     * Gets the value of the placements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Placement }
     * 
     * 
     */
    public List<Placement> getPlacements() {
        if (placements == null) {
            placements = new ArrayList<Placement>();
        }
        return this.placements;
    }

}
