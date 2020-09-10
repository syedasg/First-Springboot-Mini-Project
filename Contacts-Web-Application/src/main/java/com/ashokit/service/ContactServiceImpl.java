package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.ContactsEntity;

import com.ashokit.persistance.Contactrepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	Contactrepository cntcrepo;
	
	@Override
	public boolean addNewContact(ContactsEntity entity) {
		cntcrepo.save(entity);
		
		return true;
	}

	@Override
	public List<ContactsEntity> getAllContacts() {
		List<ContactsEntity> list = cntcrepo.findAll();
		return list;
	}

	@Override
	public ContactsEntity getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(ContactsEntity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}