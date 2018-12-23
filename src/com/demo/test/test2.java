package com.demo.test;
/**
 * ����hibernate
 * @author Huangjiping
 *
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.domain.Customer;

public class test2 {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustName("ssh����Customer");
		//1.���������ļ�
		Configuration cfg = new Configuration();
		cfg.configure();
		//2.���������ļ�����SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		//3.��ȡsession
		Session session = factory.openSession() ;
		//4.��������
		Transaction tx = session.beginTransaction();
		//5.ִ�в���  ��ʱ����дdao��ʵ����Ҳ������sql�������
		session.save(c);
		//6.�ύ/�ع�����
		tx.commit();
		//7.�ͷ���Դ
//		session.close();
		factory.close();
	}
	
}

