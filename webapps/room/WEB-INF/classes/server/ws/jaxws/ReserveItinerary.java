
package server.ws.jaxws;

import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "reserveItinerary", namespace = "http://ws.server/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveItinerary", namespace = "http://ws.server/", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5"
})
public class ReserveItinerary {

    @XmlElement(name = "arg0", namespace = "")
    private int arg0;
    @XmlElement(name = "arg1", namespace = "")
    private int arg1;
    @XmlElement(name = "arg2", namespace = "")
    private Vector arg2;
    @XmlElement(name = "arg3", namespace = "")
    private String arg3;
    @XmlElement(name = "arg4", namespace = "")
    private boolean arg4;
    @XmlElement(name = "arg5", namespace = "")
    private boolean arg5;

    /**
     * 
     * @return
     *     returns int
     */
    public int getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(int arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    /**
     * 
     * @return
     *     returns Vector
     */
    public Vector getArg2() {
        return this.arg2;
    }

    /**
     * 
     * @param arg2
     *     the value for the arg2 property
     */
    public void setArg2(Vector arg2) {
        this.arg2 = arg2;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getArg3() {
        return this.arg3;
    }

    /**
     * 
     * @param arg3
     *     the value for the arg3 property
     */
    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }

    /**
     * 
     * @return
     *     returns boolean
     */
    public boolean isArg4() {
        return this.arg4;
    }

    /**
     * 
     * @param arg4
     *     the value for the arg4 property
     */
    public void setArg4(boolean arg4) {
        this.arg4 = arg4;
    }

    /**
     * 
     * @return
     *     returns boolean
     */
    public boolean isArg5() {
        return this.arg5;
    }

    /**
     * 
     * @param arg5
     *     the value for the arg5 property
     */
    public void setArg5(boolean arg5) {
        this.arg5 = arg5;
    }

}
