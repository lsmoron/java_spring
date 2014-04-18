package model;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.HibernateUtil;

/**
 * Created by luke on 4/16/14.
 */
public class CertificateTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void simpleTest(){
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Certificate certificate = new Certificate();
        certificate.setName("name");
        certificate.setValue("Value");
        session.save(certificate);
        session.getTransaction().commit();

    }
}
