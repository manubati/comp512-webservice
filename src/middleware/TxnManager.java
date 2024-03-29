package middleware;

import java.util.*;

/**
 * Created by Phil Tremblay on 2015-11-06.
 */
public class TxnManager {

    //creating unique trxnId
    protected int currentTxnId;

    private synchronized void incrTxnId(){
        this.currentTxnId++;
    }
    private synchronized int getTxnIdVal(){
        return this.currentTxnId;
    }

    //DataStructure containing active transactions, list of update commands by a transaction and the list of RM's used by this transaction
    protected Hashtable <Integer,Vector> activeTxnRM = new Hashtable<>();
    protected Hashtable <Integer,Stack> txnCmdList = new Hashtable<>();

    //methods for txnCmdList
    private void addUpdateCmdToStack(){

    }


    //initiate the global transactionId counter
    public TxnManager() {
        this.currentTxnId = 0;
    }

    public int newTxn(){
        //increment txn counter
        this.incrTxnId();

        //assign this counter to new txn
        int txnId = this.getTxnIdVal();

        //add this transaction to the TM datastructures and create
        Stack cmdStack = new Stack();
        Vector activeRMList = new Vector();

        synchronized (this.txnCmdList) {
            this.txnCmdList.put(txnId, cmdStack);
        }
        synchronized (this.activeTxnRM) {
            this.activeTxnRM.put(txnId,activeRMList);
        }
        return txnId;
    }

    public boolean setNewUpdateItem(int txnId, Vector cmd){
        //check if it's a valid txnId
        if (this.txnCmdList.containsKey(txnId)){
            appendStack(txnId,cmd);
            return true;
        }
        else{
            System.out.println("TRANSACTION HAS NO VALID ENTRY IN TRANSACTION COMMAND LIST HASH");
            return false;
        }
    }
    public boolean enlist(int txnId, int RMType){
        if (this.activeTxnRM.containsKey(txnId)){
            //check for duplicates
            if (!this.activeTxnRM.contains(RMType)) {
                appendActive(txnId,RMType);
            }
            return true;
        }
        else{
            System.out.println("TRANSACTION HAS NO VALID ENTRY IN TRANSACTION COMMAND LIST HASH");
            return false;
        }

    }


    private void appendActive(int txnId,int RMType){
        synchronized (this.activeTxnRM){
            Vector list = this.activeTxnRM.get(txnId);
            list.add(RMType);
            this.activeTxnRM.put(txnId,list);
        }

    }
    //append to cmdStack
    private void appendStack(int txnId, Vector command){
        synchronized (this.txnCmdList){
            Stack cmdList = this.txnCmdList.get(txnId);
            if (!cmdList.contains(command)) {
                cmdList.push(command);
                this.txnCmdList.put(txnId, cmdList);
            }
        }
    }
}
