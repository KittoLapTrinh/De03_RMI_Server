package test;

import java.rmi.RemoteException;

import dao.impl.PatientImpl;
import entity.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) throws RemoteException{
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-mssql");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		try {
//			tx.begin();
//			tx.commit();
//		}catch (Exception e) {
//			tx.rollback();
//			e.printStackTrace();
//		}
		
		
		
//		try {
//			PatientImpl patientDao = new PatientImpl();
//			boolean result = patientDao.updateAddress("PT001", "Hello");
//			System.out.println(result ? "Cập nhật địa chỉ thành công!" : "Không thể cập nhật địa chỉ.");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
            // Tạo một đối tượng PatientImpl
            PatientImpl patientDao = new PatientImpl();

            // Thử nghiệm phương thức updateAddress
            boolean result = patientDao.updateAddress("PT001", "New Address Example");
            System.out.println(result ? "Cập nhật địa chỉ thành công!" : "Không thể cập nhật địa chỉ.");

            // Thử nghiệm phương thức findById
            String patientID = "PT001";
            Patient patient = patientDao.findById(patientID);
            if (patient != null) {
                System.out.println("Thông tin bệnh nhân:");
                System.out.println("ID: " + patient.getId());
                System.out.println("Tên: " + patient.getName());
                System.out.println("Địa chỉ: " + patient.getAddress());
                // In ra các thông tin khác của bệnh nhân nếu có
            } else {
                System.out.println("Không tìm thấy bệnh nhân có ID là " + patientID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
				

	}

}
