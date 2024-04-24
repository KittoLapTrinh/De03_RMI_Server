package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.Patient;



public interface PatientDao extends Remote{
	public Patient findById(String person_id) throws RemoteException;
	public boolean updateAddress(String patientID,  String newAddress) throws RemoteException;

}
