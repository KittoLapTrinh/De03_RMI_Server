package dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.PatientDao;
import entity.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class PatientImpl extends UnicastRemoteObject implements PatientDao{

	
	private EntityManager em;
	public PatientImpl() throws RemoteException {
		em = Persistence.createEntityManagerFactory("jpa-mssql").createEntityManager();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean updateAddress(String patientID, String newAddress) throws RemoteException {
		try {
			em.getTransaction().begin();
			Patient patient = em.find(Patient.class, patientID);
			
			if(patient == null) {
				return false;
			}
			
			patient.setAddress(newAddress);
			em.getTransaction().commit();
			return true;
		}catch (Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Patient findById(String patientID) throws RemoteException {
		return em.find(Patient.class, patientID);
	}

}
