
package client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ResourceManager", targetNamespace = "http://ws.server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ResourceManager {


    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "shutdown", targetNamespace = "http://ws.server/", className = "client.Shutdown")
    @ResponseWrapper(localName = "shutdownResponse", targetNamespace = "http://ws.server/", className = "client.ShutdownResponse")
    @Action(input = "http://ws.server/ResourceManager/shutdownRequest", output = "http://ws.server/ResourceManager/shutdownResponse")
    public boolean shutdown();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "start", targetNamespace = "http://ws.server/", className = "client.Start")
    @ResponseWrapper(localName = "startResponse", targetNamespace = "http://ws.server/", className = "client.StartResponse")
    @Action(input = "http://ws.server/ResourceManager/startRequest", output = "http://ws.server/ResourceManager/startResponse")
    public int start();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "abort", targetNamespace = "http://ws.server/", className = "client.Abort")
    @ResponseWrapper(localName = "abortResponse", targetNamespace = "http://ws.server/", className = "client.AbortResponse")
    @Action(input = "http://ws.server/ResourceManager/abortRequest", output = "http://ws.server/ResourceManager/abortResponse")
    public boolean abort(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "commit", targetNamespace = "http://ws.server/", className = "client.Commit")
    @ResponseWrapper(localName = "commitResponse", targetNamespace = "http://ws.server/", className = "client.CommitResponse")
    @Action(input = "http://ws.server/ResourceManager/commitRequest", output = "http://ws.server/ResourceManager/commitResponse")
    public boolean commit(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteRooms", targetNamespace = "http://ws.server/", className = "client.DeleteRooms")
    @ResponseWrapper(localName = "deleteRoomsResponse", targetNamespace = "http://ws.server/", className = "client.DeleteRoomsResponse")
    @Action(input = "http://ws.server/ResourceManager/deleteRoomsRequest", output = "http://ws.server/ResourceManager/deleteRoomsResponse")
    public boolean deleteRooms(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlightKey", targetNamespace = "http://ws.server/", className = "client.GetFlightKey")
    @ResponseWrapper(localName = "getFlightKeyResponse", targetNamespace = "http://ws.server/", className = "client.GetFlightKeyResponse")
    @Action(input = "http://ws.server/ResourceManager/getFlightKeyRequest", output = "http://ws.server/ResourceManager/getFlightKeyResponse")
    public String getFlightKey(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "newCustomer", targetNamespace = "http://ws.server/", className = "client.NewCustomer")
    @ResponseWrapper(localName = "newCustomerResponse", targetNamespace = "http://ws.server/", className = "client.NewCustomerResponse")
    @Action(input = "http://ws.server/ResourceManager/newCustomerRequest", output = "http://ws.server/ResourceManager/newCustomerResponse")
    public int newCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCars", targetNamespace = "http://ws.server/", className = "client.DeleteCars")
    @ResponseWrapper(localName = "deleteCarsResponse", targetNamespace = "http://ws.server/", className = "client.DeleteCarsResponse")
    @Action(input = "http://ws.server/ResourceManager/deleteCarsRequest", output = "http://ws.server/ResourceManager/deleteCarsResponse")
    public boolean deleteCars(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryRooms", targetNamespace = "http://ws.server/", className = "client.QueryRooms")
    @ResponseWrapper(localName = "queryRoomsResponse", targetNamespace = "http://ws.server/", className = "client.QueryRoomsResponse")
    @Action(input = "http://ws.server/ResourceManager/queryRoomsRequest", output = "http://ws.server/ResourceManager/queryRoomsResponse")
    public int queryRooms(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRoomKey", targetNamespace = "http://ws.server/", className = "client.GetRoomKey")
    @ResponseWrapper(localName = "getRoomKeyResponse", targetNamespace = "http://ws.server/", className = "client.GetRoomKeyResponse")
    @Action(input = "http://ws.server/ResourceManager/getRoomKeyRequest", output = "http://ws.server/ResourceManager/getRoomKeyResponse")
    public String getRoomKey(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCars", targetNamespace = "http://ws.server/", className = "client.AddCars")
    @ResponseWrapper(localName = "addCarsResponse", targetNamespace = "http://ws.server/", className = "client.AddCarsResponse")
    @Action(input = "http://ws.server/ResourceManager/addCarsRequest", output = "http://ws.server/ResourceManager/addCarsResponse")
    public boolean addCars(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addRooms", targetNamespace = "http://ws.server/", className = "client.AddRooms")
    @ResponseWrapper(localName = "addRoomsResponse", targetNamespace = "http://ws.server/", className = "client.AddRoomsResponse")
    @Action(input = "http://ws.server/ResourceManager/addRoomsRequest", output = "http://ws.server/ResourceManager/addRoomsResponse")
    public boolean addRooms(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteFlight", targetNamespace = "http://ws.server/", className = "client.DeleteFlight")
    @ResponseWrapper(localName = "deleteFlightResponse", targetNamespace = "http://ws.server/", className = "client.DeleteFlightResponse")
    @Action(input = "http://ws.server/ResourceManager/deleteFlightRequest", output = "http://ws.server/ResourceManager/deleteFlightResponse")
    public boolean deleteFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarKey", targetNamespace = "http://ws.server/", className = "client.GetCarKey")
    @ResponseWrapper(localName = "getCarKeyResponse", targetNamespace = "http://ws.server/", className = "client.GetCarKeyResponse")
    @Action(input = "http://ws.server/ResourceManager/getCarKeyRequest", output = "http://ws.server/ResourceManager/getCarKeyResponse")
    public String getCarKey(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws DeadlockException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addFlight", targetNamespace = "http://ws.server/", className = "client.AddFlight")
    @ResponseWrapper(localName = "addFlightResponse", targetNamespace = "http://ws.server/", className = "client.AddFlightResponse")
    @Action(input = "http://ws.server/ResourceManager/addFlightRequest", output = "http://ws.server/ResourceManager/addFlightResponse", fault = {
        @FaultAction(className = DeadlockException_Exception.class, value = "http://ws.server/ResourceManager/addFlight/Fault/DeadlockException")
    })
    public boolean addFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3)
        throws DeadlockException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryCars", targetNamespace = "http://ws.server/", className = "client.QueryCars")
    @ResponseWrapper(localName = "queryCarsResponse", targetNamespace = "http://ws.server/", className = "client.QueryCarsResponse")
    @Action(input = "http://ws.server/ResourceManager/queryCarsRequest", output = "http://ws.server/ResourceManager/queryCarsResponse")
    public int queryCars(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryFlight", targetNamespace = "http://ws.server/", className = "client.QueryFlight")
    @ResponseWrapper(localName = "queryFlightResponse", targetNamespace = "http://ws.server/", className = "client.QueryFlightResponse")
    @Action(input = "http://ws.server/ResourceManager/queryFlightRequest", output = "http://ws.server/ResourceManager/queryFlightResponse")
    public int queryFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserveCar", targetNamespace = "http://ws.server/", className = "client.ReserveCar")
    @ResponseWrapper(localName = "reserveCarResponse", targetNamespace = "http://ws.server/", className = "client.ReserveCarResponse")
    @Action(input = "http://ws.server/ResourceManager/reserveCarRequest", output = "http://ws.server/ResourceManager/reserveCarResponse")
    public boolean reserveCar(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserveRoom", targetNamespace = "http://ws.server/", className = "client.ReserveRoom")
    @ResponseWrapper(localName = "reserveRoomResponse", targetNamespace = "http://ws.server/", className = "client.ReserveRoomResponse")
    @Action(input = "http://ws.server/ResourceManager/reserveRoomRequest", output = "http://ws.server/ResourceManager/reserveRoomResponse")
    public boolean reserveRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserveItinerary", targetNamespace = "http://ws.server/", className = "client.ReserveItinerary")
    @ResponseWrapper(localName = "reserveItineraryResponse", targetNamespace = "http://ws.server/", className = "client.ReserveItineraryResponse")
    @Action(input = "http://ws.server/ResourceManager/reserveItineraryRequest", output = "http://ws.server/ResourceManager/reserveItineraryResponse")
    public boolean reserveItinerary(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        List<Object> arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        boolean arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        boolean arg5);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "reserveFlight", targetNamespace = "http://ws.server/", className = "client.ReserveFlight")
    @ResponseWrapper(localName = "reserveFlightResponse", targetNamespace = "http://ws.server/", className = "client.ReserveFlightResponse")
    @Action(input = "http://ws.server/ResourceManager/reserveFlightRequest", output = "http://ws.server/ResourceManager/reserveFlightResponse")
    public boolean reserveFlight(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://ws.server/", className = "client.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://ws.server/", className = "client.DeleteCustomerResponse")
    @Action(input = "http://ws.server/ResourceManager/deleteCustomerRequest", output = "http://ws.server/ResourceManager/deleteCustomerResponse")
    public boolean deleteCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateItemInfo", targetNamespace = "http://ws.server/", className = "client.UpdateItemInfo")
    @ResponseWrapper(localName = "updateItemInfoResponse", targetNamespace = "http://ws.server/", className = "client.UpdateItemInfoResponse")
    @Action(input = "http://ws.server/ResourceManager/updateItemInfoRequest", output = "http://ws.server/ResourceManager/updateItemInfoResponse")
    public boolean updateItemInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryCustomerInfo", targetNamespace = "http://ws.server/", className = "client.QueryCustomerInfo")
    @ResponseWrapper(localName = "queryCustomerInfoResponse", targetNamespace = "http://ws.server/", className = "client.QueryCustomerInfoResponse")
    @Action(input = "http://ws.server/ResourceManager/queryCustomerInfoRequest", output = "http://ws.server/ResourceManager/queryCustomerInfoResponse")
    public String queryCustomerInfo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "newCustomerId", targetNamespace = "http://ws.server/", className = "client.NewCustomerId")
    @ResponseWrapper(localName = "newCustomerIdResponse", targetNamespace = "http://ws.server/", className = "client.NewCustomerIdResponse")
    @Action(input = "http://ws.server/ResourceManager/newCustomerIdRequest", output = "http://ws.server/ResourceManager/newCustomerIdResponse")
    public boolean newCustomerId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryCarsPrice", targetNamespace = "http://ws.server/", className = "client.QueryCarsPrice")
    @ResponseWrapper(localName = "queryCarsPriceResponse", targetNamespace = "http://ws.server/", className = "client.QueryCarsPriceResponse")
    @Action(input = "http://ws.server/ResourceManager/queryCarsPriceRequest", output = "http://ws.server/ResourceManager/queryCarsPriceResponse")
    public int queryCarsPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryRoomsPrice", targetNamespace = "http://ws.server/", className = "client.QueryRoomsPrice")
    @ResponseWrapper(localName = "queryRoomsPriceResponse", targetNamespace = "http://ws.server/", className = "client.QueryRoomsPriceResponse")
    @Action(input = "http://ws.server/ResourceManager/queryRoomsPriceRequest", output = "http://ws.server/ResourceManager/queryRoomsPriceResponse")
    public int queryRoomsPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryFlightPrice", targetNamespace = "http://ws.server/", className = "client.QueryFlightPrice")
    @ResponseWrapper(localName = "queryFlightPriceResponse", targetNamespace = "http://ws.server/", className = "client.QueryFlightPriceResponse")
    @Action(input = "http://ws.server/ResourceManager/queryFlightPriceRequest", output = "http://ws.server/ResourceManager/queryFlightPriceResponse")
    public int queryFlightPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateDeleteCustomer", targetNamespace = "http://ws.server/", className = "client.UpdateDeleteCustomer")
    @ResponseWrapper(localName = "updateDeleteCustomerResponse", targetNamespace = "http://ws.server/", className = "client.UpdateDeleteCustomerResponse")
    @Action(input = "http://ws.server/ResourceManager/updateDeleteCustomerRequest", output = "http://ws.server/ResourceManager/updateDeleteCustomerResponse")
    public boolean updateDeleteCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
