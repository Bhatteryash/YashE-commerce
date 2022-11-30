package com.Shopping.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shopping.Exceptions.AdminException;
import com.Shopping.Exceptions.LoginException;
import com.Shopping.Model.Admin;
import com.Shopping.Repository.AdminRepo;
import com.Shopping.Repository.CurrentUserSessionRepo;

@Service
public class AdminServicesImpl implements AdminServices{

	@Autowired
	private AdminRepo arepo;
	
	@Autowired
	private CurrentUserSessionRepo cusrepo;
	
	
	@Override
	public Admin addadmin(Admin admin) throws AdminException {
		Admin ad = arepo.save(admin);
		return ad;
	}

	@Override
	public Admin updateAdmin(Admin admin, String key) throws LoginException, AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdmin(Integer adminId, String key) throws LoginException, AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdminById(Integer adminId, String key) throws LoginException, AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
